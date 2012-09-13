/*******************************************************************************
 * Pattern builder for pattern policy.userActivatedRoleRule
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
 * Generated automatically from pattern policy.userActivatedRoleRule
 */
public class PatternBuilderForuserActivatedRoleRule implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("policy.userActivatedRoleRule".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("policy.userActivatedRoleRule");
		
		final Address<? extends Receiver> var_164 = buildable.patternCollector("policy.userActivatedRoleRule");
		final Stub<Address<? extends Supplier>> var_165 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_166 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://policy/1.0").getEClassifier("Role"))).getEStructuralFeature("permissions");
		final Stub<Address<? extends Supplier>> var_167 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"ROLE", "PERMISSION"}), var_166);
		final TupleMask var_168 = new TupleMask(new int[] {}, 0);
		final TupleMask var_169 = new TupleMask(new int[] {}, 2);
		final TupleMask var_170 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_171 = buildable.buildBetaNode(var_165, var_167, var_168, var_169, var_170, false);
		final Stub<Address<? extends Supplier>> var_172 = buildable.buildInjectivityChecker(var_171, 1, new int[] {0});
		final Object var_173 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://policy/1.0").getEClassifier("Permission"))).getEStructuralFeature("operations");
		final Stub<Address<? extends Supplier>> var_174 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"PERMISSION", "OPERATION"}), var_173);
		final TupleMask var_175 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_176 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_177 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_178 = buildable.buildBetaNode(var_172, var_174, var_175, var_176, var_177, false);
		final Stub<Address<? extends Supplier>> var_179 = buildable.buildInjectivityChecker(var_178, 2, new int[] {1});
		final Stub<Address<? extends Supplier>> var_180 = buildable.buildInjectivityChecker(var_179, 2, new int[] {0});
		final Object var_181 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://policy/1.0").getEClassifier("Session"))).getEStructuralFeature("roles");
		final Stub<Address<? extends Supplier>> var_182 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"SESSION", "ROLE"}), var_181);
		final TupleMask var_183 = new TupleMask(new int[] {0}, 3);
		final TupleMask var_184 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_185 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_186 = buildable.buildBetaNode(var_180, var_182, var_183, var_184, var_185, false);
		final Stub<Address<? extends Supplier>> var_187 = buildable.buildInjectivityChecker(var_186, 2, new int[] {3});
		final Stub<Address<? extends Supplier>> var_188 = buildable.buildInjectivityChecker(var_187, 1, new int[] {3});
		final Stub<Address<? extends Supplier>> var_189 = buildable.buildInjectivityChecker(var_188, 0, new int[] {3});
		final Object var_190 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://policy/1.0").getEClassifier("User"))).getEStructuralFeature("roles");
		final Stub<Address<? extends Supplier>> var_191 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"USER", "ROLE"}), var_190);
		final TupleMask var_192 = new TupleMask(new int[] {0}, 4);
		final TupleMask var_193 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_194 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_195 = buildable.buildBetaNode(var_189, var_191, var_192, var_193, var_194, false);
		final Stub<Address<? extends Supplier>> var_196 = buildable.buildInjectivityChecker(var_195, 2, new int[] {4});
		final Stub<Address<? extends Supplier>> var_197 = buildable.buildInjectivityChecker(var_196, 1, new int[] {4});
		final Stub<Address<? extends Supplier>> var_198 = buildable.buildInjectivityChecker(var_197, 0, new int[] {4});
		final Stub<Address<? extends Supplier>> var_199 = buildable.buildInjectivityChecker(var_198, 3, new int[] {4});
		final Object var_200 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://policy/1.0").getEClassifier("User"))).getEStructuralFeature("session");
		final Stub<Address<? extends Supplier>> var_201 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"USER", "SESSION"}), var_200);
		final TupleMask var_202 = new TupleMask(new int[] {3, 4}, 5);
		final TupleMask var_203 = new TupleMask(new int[] {1, 0}, 2);
		final TupleMask var_204 = new TupleMask(new int[] {}, 2);
		final Stub<Address<? extends Supplier>> var_205 = buildable.buildBetaNode(var_199, var_201, var_202, var_203, var_204, false);
		final Object var_206 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://policy/1.0").getEClassifier("Operation"))).getEStructuralFeature("objects");
		final Stub<Address<? extends Supplier>> var_207 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"OPERATION", "OBJECT"}), var_206);
		final TupleMask var_208 = new TupleMask(new int[] {2}, 5);
		final TupleMask var_209 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_210 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_211 = buildable.buildBetaNode(var_205, var_207, var_208, var_209, var_210, false);
		final Stub<Address<? extends Supplier>> var_212 = buildable.buildInjectivityChecker(var_211, 5, new int[] {2});
		final Stub<Address<? extends Supplier>> var_213 = buildable.buildInjectivityChecker(var_212, 5, new int[] {1});
		final Stub<Address<? extends Supplier>> var_214 = buildable.buildInjectivityChecker(var_213, 5, new int[] {0});
		final Stub<Address<? extends Supplier>> var_215 = buildable.buildInjectivityChecker(var_214, 5, new int[] {3});
		final Stub<Address<? extends Supplier>> var_216 = buildable.buildInjectivityChecker(var_215, 5, new int[] {4});
		final TupleMask var_217 = new TupleMask(new int[] {4, 0, 2, 5}, 6);
		final Stub<Address<? extends Supplier>> var_218 = buildable.buildTrimmer(var_216, var_217);
		buildable.buildConnection(var_218, var_164);
		return var_164;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("policy.userActivatedRoleRule".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("USER", 0);
			posMapping.put("ROLE", 1);
			posMapping.put("OPERATION", 2);
			posMapping.put("OBJECT", 3);

		}
		return posMapping;
	}
}
