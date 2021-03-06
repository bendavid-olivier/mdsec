/*******************************************************************************
 * EMF Specific API of the kevoree.channel pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package patternmatchers.kevoree;

import java.util.Collection;

import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.matcher.ReteEngine;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

import signatures.kevoree.ChannelSignature;

/**
 * Generated domain-specific pattern matcher API of of the kevoree.channel pattern.
 * Please instantiate using the static field FACTORY.
 */
@SuppressWarnings("unused")
public class ChannelMatcher extends BaseGeneratedMatcher<ChannelSignature> implements IncQueryMatcher<ChannelSignature>{

	public final static IMatcherFactory<ChannelSignature,ChannelMatcher> FACTORY = new Factory();
	public static class Factory extends BaseMatcherFactory<ChannelSignature,ChannelMatcher> {
			@Override
			public ChannelMatcher instantiate(ReteEngine<String> reteEngine) throws IncQueryRuntimeException {
				return new ChannelMatcher(reteEngine);
			}
			@Override
			public String getPatternName() {
				return "kevoree.channel";
			}
		} 
			
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param CHA the fixed value of pattern parameter CHA, or null if not bound.
	 * @return matches represented as an array containing the values of each parameter.
	 */
	public Collection<Object[]> getAllMatchesAsArray(Object CHA) {
		return getAllMatchesAsArray(new Object[] {CHA});
	}
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param CHA the fixed value of pattern parameter CHA, or null if not bound.
	 * @return matches represented as a ChannelSignature object.
	 */
	public Collection<ChannelSignature> getAllMatchesAsSignature(Object CHA) {
		return getAllMatchesAsSignature(new Object[] {CHA});
	}

	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param CHA the fixed value of pattern parameter CHA, or null if not bound.
	 * @return a match represented as an array containing the values of each parameter, or null if no match is found.
	 */
	public Object[] getOneMatchAsArray(Object CHA) {
		return getOneMatchAsArray(new Object[] {CHA});
	}
	
	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param CHA the fixed value of pattern parameter CHA, or null if not bound.
	 * @return a match represented as a ChannelSignature object, or null if no match is found.
	 */
	public ChannelSignature getOneMatchAsSignature(Object CHA) {
		return getOneMatchAsSignature(new Object[] {CHA});
	}
	
	/**
	 * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
	 * 	under any possible substitution of the unspecified parameters.
	 * @param CHA the fixed value of pattern parameter CHA, or null if not bound.
	 * @return true if the input is a valid (partial) match of the pattern.
	 */
	public boolean hasMatch(Object CHA) {
		return hasMatch(new Object[] {CHA});
	}
	
	/** 
	 * Returns the number of all pattern matches given some fixed parameters.
	 * @param CHA the fixed value of pattern parameter CHA, or null if not bound.
	 * @return the number of pattern matches found.
	 */	
	public int countMatches(Object CHA) {
		return countMatches(new Object[] {CHA});
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getPatternName()
	 */
	@Override
	public String getPatternName() {
		return "kevoree.channel";
	}

	private static final String[] paramNames = new String[] {"CHA"};
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getParameterNames()
	 */
	@Override
	public String[] getParameterNames() {
		return paramNames;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher#tupleToSignature(org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple)
	 */
	@Override
	protected ChannelSignature tupleToSignature(Tuple t) {
		return new ChannelSignature(t.get(0));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#arrayToSignature(java.lang.Object[])
	 */
	@Override
	public ChannelSignature arrayToSignature(Object[] signature) {
		return new ChannelSignature(signature[0]);
	}	
	
	private ChannelMatcher(ReteEngine<String> engine) throws IncQueryRuntimeException {
		super(engine, "kevoree.channel");
	}
		
}
