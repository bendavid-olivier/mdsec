/*******************************************************************************
 * Pattern builder for pattern policy.userFullRule
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
 * Generated automatically from pattern policy.userFullRule
 */
public class PatternBuilderForuserFullRule implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("policy.userFullRule".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("policy.userFullRule");
		
		final Address<? extends Receiver> var_262 = buildable.patternCollector("policy.userFullRule");
		final Stub<Address<? extends Supplier>> var_263 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_264 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://policy/1.0").getEClassifier("Role"))).getEStructuralFeature("permissions");
		final Stub<Address<? extends Supplier>> var_265 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"ROLE", "PERMISSION"}), var_264);
		final TupleMask var_266 = new TupleMask(new int[] {}, 0);
		final TupleMask var_267 = new TupleMask(new int[] {}, 2);
		final TupleMask var_268 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_269 = buildable.buildBetaNode(var_263, var_265, var_266, var_267, var_268, false);
		final Stub<Address<? extends Supplier>> var_270 = buildable.buildInjectivityChecker(var_269, 1, new int[] {0});
		final Object var_271 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://policy/1.0").getEClassifier("Permission"))).getEStructuralFeature("operations");
		final Stub<Address<? extends Supplier>> var_272 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"PERMISSION", "OPERATION"}), var_271);
		final TupleMask var_273 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_274 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_275 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_276 = buildable.buildBetaNode(var_270, var_272, var_273, var_274, var_275, false);
		final Stub<Address<? extends Supplier>> var_277 = buildable.buildInjectivityChecker(var_276, 2, new int[] {1});
		final Stub<Address<? extends Supplier>> var_278 = buildable.buildInjectivityChecker(var_277, 2, new int[] {0});
		final Object var_279 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://policy/1.0").getEClassifier("User"))).getEStructuralFeature("roles");
		final Stub<Address<? extends Supplier>> var_280 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"USER", "ROLE"}), var_279);
		final TupleMask var_281 = new TupleMask(new int[] {0}, 3);
		final TupleMask var_282 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_283 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_284 = buildable.buildBetaNode(var_278, var_280, var_281, var_282, var_283, false);
		final Stub<Address<? extends Supplier>> var_285 = buildable.buildInjectivityChecker(var_284, 2, new int[] {3});
		final Stub<Address<? extends Supplier>> var_286 = buildable.buildInjectivityChecker(var_285, 1, new int[] {3});
		final Stub<Address<? extends Supplier>> var_287 = buildable.buildInjectivityChecker(var_286, 0, new int[] {3});
		final Object var_288 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://policy/1.0").getEClassifier("Operation"))).getEStructuralFeature("objects");
		final Stub<Address<? extends Supplier>> var_289 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"OPERATION", "OBJECT"}), var_288);
		final TupleMask var_290 = new TupleMask(new int[] {2}, 4);
		final TupleMask var_291 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_292 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_293 = buildable.buildBetaNode(var_287, var_289, var_290, var_291, var_292, false);
		final Stub<Address<? extends Supplier>> var_294 = buildable.buildInjectivityChecker(var_293, 4, new int[] {2});
		final Stub<Address<? extends Supplier>> var_295 = buildable.buildInjectivityChecker(var_294, 4, new int[] {1});
		final Stub<Address<? extends Supplier>> var_296 = buildable.buildInjectivityChecker(var_295, 4, new int[] {0});
		final Stub<Address<? extends Supplier>> var_297 = buildable.buildInjectivityChecker(var_296, 4, new int[] {3});
		final TupleMask var_298 = new TupleMask(new int[] {3, 0, 1, 2, 4}, 5);
		final Stub<Address<? extends Supplier>> var_299 = buildable.buildTrimmer(var_297, var_298);
		buildable.buildConnection(var_299, var_262);
		return var_262;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("policy.userFullRule".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("USER", 0);
			posMapping.put("ROLE", 1);
			posMapping.put("PERMISSION", 2);
			posMapping.put("OPERATION", 3);
			posMapping.put("OBJECT", 4);

		}
		return posMapping;
	}
}
