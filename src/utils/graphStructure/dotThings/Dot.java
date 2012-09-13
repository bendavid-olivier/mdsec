package utils.graphStructure.dotThings;
//- Dot.java --- Generate a DOT-style graph of an object
//- Copyright (C) 2003  John Hamer, University of Auckland

//- Author:     John Hamer <J.Hamer@cs.auckland.ac.nz>
//- Created:    Sat May 10 15:27:48 2003
//- Time-stamp: <2004-04-28 12:50:08 jham005>

//-   This program is free software; you can redistribute it and/or
//-   modify it under the terms of the GNU General Public License as
//-   published by the Free Software Foundation; either version 2 of the
//-   License, or (at your option) any later version.

//-   This program is distributed in the hope that it will be useful,
//-   but WITHOUT ANY WARRANTY; without even the implied warranty of
//-   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//-   General Public License for more details.

//-   You should have received a copy of the GNU General Public License
//-   along with this program; if not, write to the Free Software
//-   Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
//-   02111-1307, USA.

//- Usage:
//-   drawGraph, drawGraphToFile (static methods).

//-   Note: Requires the DOT graph drawing program to be installed in
//-   your PATH (or edit the call to Runtime.exec to include the full
//-   path).

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

class Dot {

private static Context defaultContext;

static {
  //- Feel free to customise this.
  defaultContext = new Context( );
  //    defaultContext.ignorePrivateFields = true;
  //    defaultContext.treatAsPrimitive( Package.getPackage( "java.lang" ) );
}

public static void setDefaultContext( Context ctx ) {
  defaultContext = ctx;
}

public static Context getDefaultContext( ) {
  return defaultContext;
}

static class Context {
  /**
     Set the DOT output file format.  E.g., <tt>ps</tt> for
     PostScript, <tt>png</tt> for PNG, etc.
   */
  public String outputFormat = "png";

  /**
     The name of the output file is derived from
     <code>baseFileName</code> by appending successive integers.
   */
  public String baseFileName = "graph-";
  private static int nextGraphNumber = 0;

  private String nextFileName( ) {
    return baseFileName + nextGraphNumber++ + "." + outputFormat;
  }


  /**
     If null (the default), the DOT file is written to a temporary
     file which is then deleted.<p/>

     If non-null, the DOT file is left in this file.  This is only
     really useful for debugging Graphviz.java.<p/>
  */
  public String keepDotFile = null;

  /**
     Set the DOT attributes for a class.  This allows you to change the
     appearance of certain nodes in the output, but requires that you
     know something about dot attributes.  Simple attributes are, e.g.,
     "color=red".
  */
  public void setClassAttribute( Class<?> cz, String attrib ) {
    classAttributeMap.put( cz, attrib );
  }

  /**
     Set the DOT attributes for a specific field. This allows you to
     change the appearance of certain edges in the output, but requires
     that you know something about dot attributes.  Simple attributes
     are, e.g., "color=blue".
  */
  public void setFieldAttribute( Field field, String attrib ) {
    fieldAttributeMap.put( field, attrib );
  }
  
  /**
     Set the DOT attributes for all fields with this name.
  */
  public void setFieldAttribute( String field, String attrib ) {
    fieldAttributeMap.put( field, attrib );
  }

  /**
     Pretend the given field does not exist.
  */
  public void ignoreField( Field field ) {
    ignoreSet.add( field );
  }

  /**
     Pretend that no fields with this name exist.
  */
  public void ignoreField( String field ) {
    ignoreSet.add( field );
  }
  

  /**
     Pretend this class has no fields.  I.e., make the class opaque.
  */
  public void ignoreFields( Class<?> cz ) {
    Field[] fs = cz.getDeclaredFields( );
    for( int i = 0; i < fs.length; i++ )
      ignoreField( fs[i] );
  }
  
  /**
     Treat objects of this class as primitives; i.e., <code>toString</code>
     is called on the object, and the result displayed in the label like
     a primitive field.  
  */
  public void treatAsPrimitive( Class <?>cz ) {
    pretendPrimitiveSet.add( cz );
  }
  
  /**
     Treat objects from this package as primitives; i.e.,
     <code>toString</code> is called on the object, and the result displayed
     in the label like a primitive field.
  */
  public void treatAsPrimitive( Package pk ) {
    pretendPrimitiveSet.add( pk );
  }
  
  private Map<Class<?>, String> classAttributeMap   = new HashMap<Class<?>, String>( );
  private Map<Object, String> fieldAttributeMap   = new HashMap<Object, String>( );
  private Set<AnnotatedElement> pretendPrimitiveSet = new HashSet<AnnotatedElement>( );
  private Set<Object> ignoreSet           = new HashSet<Object>( );


  /**
     Allow private, protected and package-access fields to be shown.
     This is only possible if the security manager allows
     <code>ReflectPermission("suppressAccessChecks")</code> permission.
     This is usually the case when running from an application, but
     perhaps not from an applet or servlet.
  */
  public boolean ignorePrivateFields = false;


  /**
     Toggle whether or not to include the field name in the label for an
     object.  This is currently all-or-nothing.  TODO: allow this to be
     set on a per-class basis.
  */
  public boolean showFieldNamesInLabels = true;

  /**
     Toggle whether to display the class name in the label for an
     object (false, the default) or to use the result of calling
     toString (true).
   */
  //public boolean useToStringAsClassName = false;

  /**
     Toggle whether to display qualified nested class names in the
     label for an object from the same package as Graphviz (true) or
     to display an abbreviated name (false, the default).
   */
  public boolean qualifyNestedClassNames = false;
  public boolean showPackageNamesInClasses = true;

  private boolean canTreatAsPrimitive( Object obj ) {
    return obj == null || canTreatClassAsPrimitive( obj.getClass( ) );
  }

  private boolean canTreatClassAsPrimitive( Class<?> cz ) {
    if( cz == null || cz.isPrimitive( ) )
      return true;

    do {
      if( pretendPrimitiveSet.contains( cz )
       || pretendPrimitiveSet.contains( cz.getPackage( ) )
          )
        return true;

      Class<?>[] ifs = cz.getInterfaces( );
      for( int i = 0; i < ifs.length; i++ )
        if( canTreatClassAsPrimitive( ifs[i] ) )
          return true;

      cz = cz.getSuperclass( );
    } while( cz != null );
    return false;
  }


  private boolean looksLikePrimitiveArray( Object obj ) {
    Class<?> c = obj.getClass( );
    if( canTreatClassAsPrimitive( c.getComponentType( ) ) )
      return true;
    int len = Array.getLength( obj );
    for( int i = 0; i < len; i++ )
      if( ! canTreatAsPrimitive( Array.get(obj, i) ) )
        return false;
    return true;
  }


  private boolean canIgnoreField( Field field ) {
    return
      Modifier.isStatic( field.getModifiers( ) )
      || ignoreSet.contains( field )
      || ignoreSet.contains( field.getName( ) )
      ;
  }


  protected String className( Object obj, boolean useToStringAsClassName ) {
    if( obj == null )
      return "";

    Class<?> c = obj.getClass( );
    if( useToStringAsClassName && redefinesToString( obj ) )
      return quote(obj.toString( ));
    else {
      String name = c.getName( );
      if( ! showPackageNamesInClasses || c.getPackage( ) == this.getClass( ).getPackage( ) ) {
        //- Strip away everything before the last .
        name = name.substring( name.lastIndexOf( '.' )+1 );
        
        if( ! qualifyNestedClassNames )
          name = name.substring( name.lastIndexOf( '$' )+1 );
      }
      return name;
    }
  }
}

//- Wrapper for objects that get visited.
private static class VisitedObject {
  Object obj;
  VisitedObject( Object obj ) {
    this.obj = obj;
  }

  public boolean equals( Object other ) {
    VisitedObject v = (VisitedObject)other;
    return obj == v.obj;
  }

  public int hashCode( ) {
    return System.identityHashCode( obj );
  }
}


public static Context newContext( ) {
  return new Context( );
}


private static String dotName( Object obj ) {
  //- System.identityHashCode is a cheap way of generating a unique
  //- label for an object.  It relies on identityHashCode returning a
  //- memory address, which is true in at least Java 1.3 and 1.4.  If
  //- it ceases to be true, VisitedObject can be made to generate
  //- unique numbers.
  return "n" + System.identityHashCode( obj );
}

private static boolean redefinesToString( Object obj ) {
  Method[] ms = obj.getClass( ).getMethods( );
  for( int i = 0; i < ms.length; i++ )
    if( ms[i].getName( ).equals( "toString" ) && ms[i].getDeclaringClass( ) != Object.class )
      return true;
  return false;
}


private static boolean hasPrimitiveFields( Context ctx, Field[] fs, Object obj ) {
  for( int i = 0; i < fs.length; i++ ) {
    Field field = fs[i];
    if( ! ctx.canIgnoreField( field ) ) {
      try {
        //- The order of these statements matters.  If field is not
        //- accessible, we want an IllegalAccessException to be raised
        //- (and caught).
        Object val = field.get( obj );
        if( field.getType( ).isPrimitive( ) || ctx.canTreatAsPrimitive( val ) )
          //- Beware: ctx.canTreatAsPrimitive is not adequate - we may
          //- be dealing with a truly primitive type here
          return true;
      } catch( IllegalAccessException e ) { }
    }
  }
  return false;
}


private static final String canAppearUnquotedInLabelChars = " $&*@#!-+()^%;[],;.=";
private static boolean canAppearUnquotedInLabel( char c ) {
  return canAppearUnquotedInLabelChars.indexOf( c ) != -1
    || Character.isLetter( c )
    || Character.isDigit( c )
    ;
}

private static final String quotable = "\"<>{}|";

private static String quote( String s ) {
  StringBuffer sb = new StringBuffer( );
  for( int i = 0, n = s.length( ); i < n; i++ ) {
    char c = s.charAt(i);
    if( quotable.indexOf(c) != -1 )
      sb.append( '\\' ).append( c );
    else
      if( canAppearUnquotedInLabel( c ) )
        sb.append( c );
      else
        sb.append("\\\\0u" ).append( Integer.toHexString( (int)c ) );
  }
  return sb.toString( );
}


protected static void processPrimitiveArray( Object obj, PrintWriter out ) {
  out.print( dotName( obj ) + "[shape=record, label=\"" );
  int len = Array.getLength( obj );
  for( int i = 0; i < len; i++ ) {
    if( i != 0 )
      out.print( "|" );
    out.print( quote(String.valueOf( Array.get(obj, i) )) );
  }
  out.println( "\"];" );
}


protected static void processObjectArray( Context ctx, Object obj, PrintWriter out, Set<VisitedObject> visited ) {
  out.print( dotName( obj ) + "[label=\"" );
  int len = Array.getLength( obj );
  for( int i = 0; i < len; i++ ) {
    if( i != 0 )
      out.print( "|" );
    out.print( "<f" + i + ">" );
  }
  out.println( "\",shape=record];" );
  for( int i = 0; i < len; i++ ) {
    Object ref = Array.get( obj, i );
    if( ref == null )
      continue;
    out.println( dotName( obj ) + ":f" + i + " -> " + dotName( ref )
                 + "[label=\"" + i + "\",fontsize=12];" );
    generateDotInternal( ctx, ref, out, visited );
  }
}


protected static void labelObjectWithSomePrimitiveFields( Context ctx, Object obj, Field[] fs, PrintWriter out ) {
  Object cabs  = ctx.classAttributeMap.get( obj.getClass( ) );
  out.print( dotName( obj ) + "[label=\"" + ctx.className( obj, false ) + "|{" );
  String sep = "";
  for( int i = 0; i < fs.length; i++ ) {
    Field field = fs[i];
    if( ! ctx.canIgnoreField( field ) )
      try {
        Object ref = field.get( obj );
        if( field.getType( ).isPrimitive( ) || ctx.canTreatAsPrimitive( ref ) ) {
          if( ctx.showFieldNamesInLabels )
            out.print( sep + field.getName( ) + ": " + quote(String.valueOf( ref )) );
          else
            out.print( sep + quote(String.valueOf( ref )) );
          sep = "|";
        }
      } catch( IllegalAccessException e ) { }
  }

  out.println( "}\"" + (cabs == null ? "" : "," + cabs) + ",shape=record];" );
}


protected static void labelObjectWithNoPrimitiveFields( Context ctx, Object obj, PrintWriter out ) {
  Object cabs  = ctx.classAttributeMap.get( obj.getClass( ) );
  out.println( dotName( obj )
               + "[label=\"" + ctx.className( obj, true ) + "\""
               + (cabs == null ? "" : "," + cabs)
               + "];" );
}

protected static void processFields( Context ctx, Object obj, Field[] fs, PrintWriter out, Set<VisitedObject> visited ) {
  for( int i = 0; i < fs.length; i++ ) {
    Field field = fs[i];
    if( ! ctx.canIgnoreField( field ) ) {
      try {
        Object ref = field.get( obj );
        if( field.getType( ).isPrimitive( ) || ctx.canTreatAsPrimitive( ref ) )
          //- The field might be declared, say, Object, but the actual
          //- object may be, say, a String.
          continue;
        String name = field.getName( );
        Object fabs = ctx.fieldAttributeMap.get( field );
        if( fabs == null )
          fabs = ctx.fieldAttributeMap.get( name );
        out.println( dotName( obj ) + " -> " + dotName( ref )
                     + "[label=\"" + name + "\",fontsize=12"
                     + (fabs == null ? "" : "," + fabs)
                     + "];" );
        generateDotInternal( ctx, ref, out, visited );
      } catch( IllegalAccessException e ) { }
    }
  }
}

protected static void generateDotInternal( Context ctx, Object obj, PrintWriter out, Set<VisitedObject> visited )
  throws IllegalArgumentException
{
  if( visited.add( new VisitedObject(obj) ) ) {
    if( obj == null )
      out.println( dotName( obj ) + "[label=\"null\"" + ", shape=plaintext];" );
    else {
      Class<?> c = obj.getClass( );
      if( c.isArray( ) ) {
        if( ctx.looksLikePrimitiveArray( obj ) )
          processPrimitiveArray( obj, out );
        else 
          processObjectArray( ctx, obj, out, visited );
      } else {
        Field[] fs = c.getDeclaredFields( );
        if( ! ctx.ignorePrivateFields )
          AccessibleObject.setAccessible( fs, true );

        if( hasPrimitiveFields( ctx, fs, obj ) )
          labelObjectWithSomePrimitiveFields( ctx, obj, fs, out );
        else
          labelObjectWithNoPrimitiveFields( ctx, obj, out );
        
        processFields( ctx, obj, fs, out, visited );

        if( ! ctx.ignorePrivateFields )
          AccessibleObject.setAccessible( fs, false );
      }
    }
  }
}

/**
   Write a DOT digraph specification of the graph rooted at
   <tt>obj</tt> to <tt>out</tt>.
 */
public static void generateDOT( Context ctx, Object obj, PrintWriter out ) {
  out.println( "digraph Java {" );
  generateDotInternal( ctx, obj, out, new HashSet<VisitedObject>( ) );
  out.println( "}" );
}

/**
   Create a graph of the object rooted at <tt>obj</tt>.
 */
public static void drawGraph( Context ctx, Object obj, String file ) {
  try {
    File        dotfile = ctx.keepDotFile == null ? File.createTempFile( "Graphviz", "dot" ) : new File( ctx.keepDotFile );
    PrintWriter out     = new PrintWriter( new FileWriter( dotfile ) );
    try {
      generateDOT( ctx, obj, out );
      out.close( );
      Runtime.getRuntime( ).exec( new String[]{ "P:/programs/ATT/Graphviz/bin/dot", "-T" + ctx.outputFormat, dotfile.toString( ), "-o", file } ).waitFor( );
    } catch( InterruptedException e ) { }
    finally {
      if( ctx.keepDotFile == null )
        dotfile.delete( );
    }
  } catch( IOException e ) {
    System.err.println( e );
  }
}

public static void drawGraph( Context ctx, Object obj ) {
  drawGraph( ctx, obj, ctx.nextFileName( ) );
}

public static void drawGraphToFile( Object obj, String file ) {
  drawGraph( defaultContext, obj, file );
}

public static void drawGraph( Object obj ) {
  drawGraph( defaultContext, obj );
}
}
//- Dot.java ends here
