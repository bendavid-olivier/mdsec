/*******************************************************************************
 * Pattern builder for pattern policy.object
 * Generated by EMF-IncQuery
 * Should contribute a pattern-builder to extension point
 * org.eclipse.viatra2.emf.incquery.codegen.patternmatcher.builder 
 *******************************************************************************/

package patternbuilders.policy;

import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra2.emf.incquery.runtime.IStatelessGeneratedRetePatternBuilder;
import org.eclipse.viatra2.emf.incquery.runtime.term.VPMTermEvaluator;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.boundary.AbstractEvaluator;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.construction.ReteContainerBuildable;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.construction.RetePatternBuildException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.construction.Stub;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.matcher.IPatternMatcherContext;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.network.Receiver;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.network.Supplier;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.remote.Address;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.FlatTuple;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.TupleMask;

/**
 * Generated automatically from pattern policy.object
 */
public class PatternBuilderForobject implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("policy.object".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("policy.object");
		
		final Address<? extends Receiver> var_574 = buildable.patternCollector("policy.object");
		final Stub<Address<? extends Supplier>> var_575 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_576 = EPackage.Registry.INSTANCE.getEPackage("http://policy/1.0").getEClassifier("Object");
		final Stub<Address<? extends Supplier>> var_577 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"OB"}), var_576);
		final TupleMask var_578 = new TupleMask(new int[] {}, 0);
		final TupleMask var_579 = new TupleMask(new int[] {}, 1);
		final TupleMask var_580 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_581 = buildable.buildBetaNode(var_575, var_577, var_578, var_579, var_580, false);
		final TupleMask var_582 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_583 = buildable.buildTrimmer(var_581, var_582);
		buildable.buildConnection(var_583, var_574);
		return var_574;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("policy.object".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("OB", 0);

		}
		return posMapping;
	}
}
