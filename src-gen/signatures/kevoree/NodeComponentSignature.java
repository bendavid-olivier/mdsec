/*******************************************************************************
 * Pattern signature of the kevoree.nodeComponent pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.kevoree;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternSignature;

/**
 * Pattern-specific signature object of the kevoree.nodeComponent pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 */
@SuppressWarnings("unused")
public final class NodeComponentSignature extends BasePatternSignature implements IPatternSignature {

	// constructor
	public NodeComponentSignature(Object N, Object C) {
		this.fN = N;
		this.fC = C;	
	}

	//private attributes
	private Object fN;
	private Object fC;
	
	// getter methods
	/** Returns the value of the parameter with the given name, or null if name is invalid. */
	@Override
	public Object get(String parameterName) {
		if ("N".equals(parameterName)) return fN;
		if ("C".equals(parameterName)) return fC;
		return null;
	}	
	
	public Object getValueOfN(){
		 return fN;
	}
	public Object getValueOfC(){
		 return fC;
	}	
	
	// setter methods
	/** 
	 * Sets the parameter with the given name to the given value. 
	 * @returns true if successful, false if parameter name is invalid. May also fail and return false if the value type is incompatible. 
	 */
	@Override
	public boolean set(String parameterName, Object newValue) {
		if ("N".equals(parameterName)) {
			fN = newValue;
			return true;
		}
		if ("C".equals(parameterName)) {
			fC = newValue;
			return true;
		}
		return false;
	}
	
	public void setValueOfN(Object N){
		 this.fN=N;
	}
	public void setValueOfC(Object C){
		 this.fC=C;
	}

	// overridden prettyPrint(), hashCode(), equals() with Tuple-semantics
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (! (obj instanceof IPatternSignature))
			return false;
		IPatternSignature otherSig = (IPatternSignature) obj;
		if (!patternName().equals(otherSig.patternName()))
			return false;
		if (!NodeComponentSignature.class.equals(obj.getClass()))
			return Arrays.deepEquals(toArray(), otherSig.toArray());
		NodeComponentSignature other = (NodeComponentSignature) obj;
		if (fN == null) {if (other.fN != null) return false;}
		else if (!fN.equals(other.fN)) return false;
		if (fC == null) {if (other.fC != null) return false;}
		else if (!fC.equals(other.fC)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fN == null) ? 0 : fN.hashCode());
		result = prime * result + ((fC == null) ? 0 : fC.hashCode());
		return result;
	}

	@Override
	public String prettyPrint() {
		StringBuilder result = new StringBuilder();
		result.append("\"N\"=" + prettyPrintValue(fN));
		result.append(", \"C\"=" + prettyPrintValue(fC));
		return result.toString();
	}

	// conversion and reflection
	/** Converts the signature to an array representation, with each pattern parameter at their respective position */
	@Override
	public Object[] toArray() {
		return new Object[] {fN, fC};
	}
	
	/** Identifies the name of the pattern for which this is a signature. */
	@Override
	public String patternName() {
		return "kevoree.nodeComponent";
	}
	
	/** Returns the list of symbolic parameter names. */
	@Override
	public String[] parameterNames() {
		return parameterNames;
	}
	private static String[] parameterNames = {"N", "C"};
	
	
}
