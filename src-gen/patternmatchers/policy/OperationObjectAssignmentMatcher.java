/*******************************************************************************
 * EMF Specific API of the policy.OperationObjectAssignment pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package patternmatchers.policy;

import java.util.Collection;

import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.matcher.ReteEngine;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

import signatures.policy.OperationObjectAssignmentSignature;

/**
 * Generated domain-specific pattern matcher API of of the policy.OperationObjectAssignment pattern.
 * Please instantiate using the static field FACTORY.
 */
@SuppressWarnings("unused")
public class OperationObjectAssignmentMatcher extends BaseGeneratedMatcher<OperationObjectAssignmentSignature> implements IncQueryMatcher<OperationObjectAssignmentSignature>{

	public final static IMatcherFactory<OperationObjectAssignmentSignature,OperationObjectAssignmentMatcher> FACTORY = new Factory();
	public static class Factory extends BaseMatcherFactory<OperationObjectAssignmentSignature,OperationObjectAssignmentMatcher> {
			@Override
			public OperationObjectAssignmentMatcher instantiate(ReteEngine<String> reteEngine) throws IncQueryRuntimeException {
				return new OperationObjectAssignmentMatcher(reteEngine);
			}
			@Override
			public String getPatternName() {
				return "policy.OperationObjectAssignment";
			}
		} 
			
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param PERM the fixed value of pattern parameter PERM, or null if not bound.
	 * @param OPE the fixed value of pattern parameter OPE, or null if not bound.
	 * @param OBJ the fixed value of pattern parameter OBJ, or null if not bound.
	 * @return matches represented as an array containing the values of each parameter.
	 */
	public Collection<Object[]> getAllMatchesAsArray(Object PERM, Object OPE, Object OBJ) {
		return getAllMatchesAsArray(new Object[] {PERM, OPE, OBJ});
	}
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param PERM the fixed value of pattern parameter PERM, or null if not bound.
	 * @param OPE the fixed value of pattern parameter OPE, or null if not bound.
	 * @param OBJ the fixed value of pattern parameter OBJ, or null if not bound.
	 * @return matches represented as a OperationObjectAssignmentSignature object.
	 */
	public Collection<OperationObjectAssignmentSignature> getAllMatchesAsSignature(Object PERM, Object OPE, Object OBJ) {
		return getAllMatchesAsSignature(new Object[] {PERM, OPE, OBJ});
	}

	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param PERM the fixed value of pattern parameter PERM, or null if not bound.
	 * @param OPE the fixed value of pattern parameter OPE, or null if not bound.
	 * @param OBJ the fixed value of pattern parameter OBJ, or null if not bound.
	 * @return a match represented as an array containing the values of each parameter, or null if no match is found.
	 */
	public Object[] getOneMatchAsArray(Object PERM, Object OPE, Object OBJ) {
		return getOneMatchAsArray(new Object[] {PERM, OPE, OBJ});
	}
	
	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param PERM the fixed value of pattern parameter PERM, or null if not bound.
	 * @param OPE the fixed value of pattern parameter OPE, or null if not bound.
	 * @param OBJ the fixed value of pattern parameter OBJ, or null if not bound.
	 * @return a match represented as a OperationObjectAssignmentSignature object, or null if no match is found.
	 */
	public OperationObjectAssignmentSignature getOneMatchAsSignature(Object PERM, Object OPE, Object OBJ) {
		return getOneMatchAsSignature(new Object[] {PERM, OPE, OBJ});
	}
	
	/**
	 * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
	 * 	under any possible substitution of the unspecified parameters.
	 * @param PERM the fixed value of pattern parameter PERM, or null if not bound.
	 * @param OPE the fixed value of pattern parameter OPE, or null if not bound.
	 * @param OBJ the fixed value of pattern parameter OBJ, or null if not bound.
	 * @return true if the input is a valid (partial) match of the pattern.
	 */
	public boolean hasMatch(Object PERM, Object OPE, Object OBJ) {
		return hasMatch(new Object[] {PERM, OPE, OBJ});
	}
	
	/** 
	 * Returns the number of all pattern matches given some fixed parameters.
	 * @param PERM the fixed value of pattern parameter PERM, or null if not bound.
	 * @param OPE the fixed value of pattern parameter OPE, or null if not bound.
	 * @param OBJ the fixed value of pattern parameter OBJ, or null if not bound.
	 * @return the number of pattern matches found.
	 */	
	public int countMatches(Object PERM, Object OPE, Object OBJ) {
		return countMatches(new Object[] {PERM, OPE, OBJ});
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getPatternName()
	 */
	@Override
	public String getPatternName() {
		return "policy.OperationObjectAssignment";
	}

	private static final String[] paramNames = new String[] {"PERM", "OPE", "OBJ"};
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
	protected OperationObjectAssignmentSignature tupleToSignature(Tuple t) {
		return new OperationObjectAssignmentSignature(t.get(0), t.get(1), t.get(2));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#arrayToSignature(java.lang.Object[])
	 */
	@Override
	public OperationObjectAssignmentSignature arrayToSignature(Object[] signature) {
		return new OperationObjectAssignmentSignature(signature[0], signature[1], signature[2]);
	}	
	
	private OperationObjectAssignmentMatcher(ReteEngine<String> engine) throws IncQueryRuntimeException {
		super(engine, "policy.OperationObjectAssignment");
	}
		
}
