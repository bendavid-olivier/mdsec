/*******************************************************************************
 * Pattern builder for pattern kevoree.threeBuyers
 * Generated by EMF-IncQuery
 * Should contribute a pattern-builder to extension point
 * org.eclipse.viatra2.emf.incquery.codegen.patternmatcher.builder 
 *******************************************************************************/

package patternbuilders.kevoree;

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
 * Generated automatically from pattern kevoree.threeBuyers
 */
public class PatternBuilderForthreeBuyers implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("kevoree.threeBuyers".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("kevoree.threeBuyers");
		
		final Address<? extends Receiver> var_405 = buildable.patternCollector("kevoree.threeBuyers");
		final Stub<Address<? extends Supplier>> var_406 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_407 = EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("TypeDefinition");
		final Stub<Address<? extends Supplier>> var_408 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"TYPDEF2"}), var_407);
		final TupleMask var_409 = new TupleMask(new int[] {}, 0);
		final TupleMask var_410 = new TupleMask(new int[] {}, 1);
		final TupleMask var_411 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_412 = buildable.buildBetaNode(var_406, var_408, var_409, var_410, var_411, false);
		final Object var_413 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("NamedElement"))).getEStructuralFeature("name");
		final Stub<Address<? extends Supplier>> var_414 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"TYPDEF2", "TYPNAME2"}), var_413);
		final TupleMask var_415 = new TupleMask(new int[] {0}, 1);
		final TupleMask var_416 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_417 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_418 = buildable.buildBetaNode(var_412, var_414, var_415, var_416, var_417, false);
		final Stub<Address<? extends Supplier>> var_419 = buildable.buildInjectivityChecker(var_418, 0, new int[] {1});
		final AbstractEvaluator var_420 = new AbstractEvaluator(){ 
			@Override 
			public Object doEvaluate(Tuple tuple) throws Exception { 
				return VPMTermEvaluator.equals(tuple.get(1).toString(),"Buyer");
			}
		};
		final Stub<Address<? extends Supplier>> var_421 = buildable.buildPredicateChecker(var_420, null, new int[] {1}, var_419);
		final Object var_422 = EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("TypeDefinition");
		final Stub<Address<? extends Supplier>> var_423 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"TYPDEF3"}), var_422);
		final TupleMask var_424 = new TupleMask(new int[] {}, 2);
		final TupleMask var_425 = new TupleMask(new int[] {}, 1);
		final TupleMask var_426 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_427 = buildable.buildBetaNode(var_421, var_423, var_424, var_425, var_426, false);
		final Stub<Address<? extends Supplier>> var_428 = buildable.buildInjectivityChecker(var_427, 0, new int[] {2});
		final Stub<Address<? extends Supplier>> var_429 = buildable.buildInjectivityChecker(var_428, 2, new int[] {1});
		final Object var_430 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("NamedElement"))).getEStructuralFeature("name");
		final Stub<Address<? extends Supplier>> var_431 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"TYPDEF3", "TYPNAME3"}), var_430);
		final TupleMask var_432 = new TupleMask(new int[] {2}, 3);
		final TupleMask var_433 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_434 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_435 = buildable.buildBetaNode(var_429, var_431, var_432, var_433, var_434, false);
		final Stub<Address<? extends Supplier>> var_436 = buildable.buildInjectivityChecker(var_435, 0, new int[] {3});
		final Stub<Address<? extends Supplier>> var_437 = buildable.buildInjectivityChecker(var_436, 2, new int[] {3});
		final Stub<Address<? extends Supplier>> var_438 = buildable.buildInjectivityChecker(var_437, 1, new int[] {3});
		final AbstractEvaluator var_439 = new AbstractEvaluator(){ 
			@Override 
			public Object doEvaluate(Tuple tuple) throws Exception { 
				return VPMTermEvaluator.equals(tuple.get(3).toString(),"Buyer");
			}
		};
		final Stub<Address<? extends Supplier>> var_440 = buildable.buildPredicateChecker(var_439, null, new int[] {3}, var_438);
		final Object var_441 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("NamedElement"))).getEStructuralFeature("name");
		final Stub<Address<? extends Supplier>> var_442 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"TYPDEF1", "TYPNAME1"}), var_441);
		final TupleMask var_443 = new TupleMask(new int[] {}, 4);
		final TupleMask var_444 = new TupleMask(new int[] {}, 2);
		final TupleMask var_445 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_446 = buildable.buildBetaNode(var_440, var_442, var_443, var_444, var_445, false);
		final Stub<Address<? extends Supplier>> var_447 = buildable.buildInjectivityChecker(var_446, 4, new int[] {0});
		final Stub<Address<? extends Supplier>> var_448 = buildable.buildInjectivityChecker(var_447, 4, new int[] {2});
		final Stub<Address<? extends Supplier>> var_449 = buildable.buildInjectivityChecker(var_448, 4, new int[] {5});
		final Stub<Address<? extends Supplier>> var_450 = buildable.buildInjectivityChecker(var_449, 4, new int[] {1});
		final Stub<Address<? extends Supplier>> var_451 = buildable.buildInjectivityChecker(var_450, 4, new int[] {3});
		final Stub<Address<? extends Supplier>> var_452 = buildable.buildInjectivityChecker(var_451, 0, new int[] {5});
		final Stub<Address<? extends Supplier>> var_453 = buildable.buildInjectivityChecker(var_452, 2, new int[] {5});
		final Stub<Address<? extends Supplier>> var_454 = buildable.buildInjectivityChecker(var_453, 5, new int[] {1});
		final Stub<Address<? extends Supplier>> var_455 = buildable.buildInjectivityChecker(var_454, 5, new int[] {3});
		final AbstractEvaluator var_456 = new AbstractEvaluator(){ 
			@Override 
			public Object doEvaluate(Tuple tuple) throws Exception { 
				return VPMTermEvaluator.equals(tuple.get(5).toString(),"Buyer");
			}
		};
		final Stub<Address<? extends Supplier>> var_457 = buildable.buildPredicateChecker(var_456, null, new int[] {5}, var_455);
		final Object var_458 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("Instance"))).getEStructuralFeature("typeDefinition");
		final Stub<Address<? extends Supplier>> var_459 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"C1", "TYPDEF1"}), var_458);
		final TupleMask var_460 = new TupleMask(new int[] {4}, 6);
		final TupleMask var_461 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_462 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_463 = buildable.buildBetaNode(var_457, var_459, var_460, var_461, var_462, false);
		final Stub<Address<? extends Supplier>> var_464 = buildable.buildInjectivityChecker(var_463, 6, new int[] {4});
		final Stub<Address<? extends Supplier>> var_465 = buildable.buildInjectivityChecker(var_464, 6, new int[] {0});
		final Stub<Address<? extends Supplier>> var_466 = buildable.buildInjectivityChecker(var_465, 6, new int[] {2});
		final Stub<Address<? extends Supplier>> var_467 = buildable.buildInjectivityChecker(var_466, 6, new int[] {5});
		final Stub<Address<? extends Supplier>> var_468 = buildable.buildInjectivityChecker(var_467, 6, new int[] {1});
		final Stub<Address<? extends Supplier>> var_469 = buildable.buildInjectivityChecker(var_468, 6, new int[] {3});
		final Object var_470 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("Instance"))).getEStructuralFeature("typeDefinition");
		final Stub<Address<? extends Supplier>> var_471 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"C2", "TYPDEF1"}), var_470);
		final TupleMask var_472 = new TupleMask(new int[] {4}, 7);
		final TupleMask var_473 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_474 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_475 = buildable.buildBetaNode(var_469, var_471, var_472, var_473, var_474, false);
		final Stub<Address<? extends Supplier>> var_476 = buildable.buildInjectivityChecker(var_475, 6, new int[] {7});
		final Stub<Address<? extends Supplier>> var_477 = buildable.buildInjectivityChecker(var_476, 7, new int[] {4});
		final Stub<Address<? extends Supplier>> var_478 = buildable.buildInjectivityChecker(var_477, 7, new int[] {0});
		final Stub<Address<? extends Supplier>> var_479 = buildable.buildInjectivityChecker(var_478, 7, new int[] {2});
		final Stub<Address<? extends Supplier>> var_480 = buildable.buildInjectivityChecker(var_479, 7, new int[] {5});
		final Stub<Address<? extends Supplier>> var_481 = buildable.buildInjectivityChecker(var_480, 7, new int[] {1});
		final Stub<Address<? extends Supplier>> var_482 = buildable.buildInjectivityChecker(var_481, 7, new int[] {3});
		final Object var_483 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("Instance"))).getEStructuralFeature("typeDefinition");
		final Stub<Address<? extends Supplier>> var_484 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"C3", "TYPDEF1"}), var_483);
		final TupleMask var_485 = new TupleMask(new int[] {4}, 8);
		final TupleMask var_486 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_487 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_488 = buildable.buildBetaNode(var_482, var_484, var_485, var_486, var_487, false);
		final Stub<Address<? extends Supplier>> var_489 = buildable.buildInjectivityChecker(var_488, 6, new int[] {8});
		final Stub<Address<? extends Supplier>> var_490 = buildable.buildInjectivityChecker(var_489, 7, new int[] {8});
		final Stub<Address<? extends Supplier>> var_491 = buildable.buildInjectivityChecker(var_490, 8, new int[] {4});
		final Stub<Address<? extends Supplier>> var_492 = buildable.buildInjectivityChecker(var_491, 8, new int[] {0});
		final Stub<Address<? extends Supplier>> var_493 = buildable.buildInjectivityChecker(var_492, 8, new int[] {2});
		final Stub<Address<? extends Supplier>> var_494 = buildable.buildInjectivityChecker(var_493, 8, new int[] {5});
		final Stub<Address<? extends Supplier>> var_495 = buildable.buildInjectivityChecker(var_494, 8, new int[] {1});
		final Stub<Address<? extends Supplier>> var_496 = buildable.buildInjectivityChecker(var_495, 8, new int[] {3});
		final Object var_497 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("ContainerNode"))).getEStructuralFeature("components");
		final Stub<Address<? extends Supplier>> var_498 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"N1", "C1"}), var_497);
		final TupleMask var_499 = new TupleMask(new int[] {6}, 9);
		final TupleMask var_500 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_501 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_502 = buildable.buildBetaNode(var_496, var_498, var_499, var_500, var_501, false);
		final Stub<Address<? extends Supplier>> var_503 = buildable.buildInjectivityChecker(var_502, 6, new int[] {9});
		final Stub<Address<? extends Supplier>> var_504 = buildable.buildInjectivityChecker(var_503, 7, new int[] {9});
		final Stub<Address<? extends Supplier>> var_505 = buildable.buildInjectivityChecker(var_504, 8, new int[] {9});
		final Stub<Address<? extends Supplier>> var_506 = buildable.buildInjectivityChecker(var_505, 9, new int[] {4});
		final Stub<Address<? extends Supplier>> var_507 = buildable.buildInjectivityChecker(var_506, 9, new int[] {0});
		final Stub<Address<? extends Supplier>> var_508 = buildable.buildInjectivityChecker(var_507, 9, new int[] {2});
		final Stub<Address<? extends Supplier>> var_509 = buildable.buildInjectivityChecker(var_508, 9, new int[] {5});
		final Stub<Address<? extends Supplier>> var_510 = buildable.buildInjectivityChecker(var_509, 9, new int[] {1});
		final Stub<Address<? extends Supplier>> var_511 = buildable.buildInjectivityChecker(var_510, 9, new int[] {3});
		final Object var_512 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("ContainerNode"))).getEStructuralFeature("components");
		final Stub<Address<? extends Supplier>> var_513 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"N2", "C2"}), var_512);
		final TupleMask var_514 = new TupleMask(new int[] {7}, 10);
		final TupleMask var_515 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_516 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_517 = buildable.buildBetaNode(var_511, var_513, var_514, var_515, var_516, false);
		final Stub<Address<? extends Supplier>> var_518 = buildable.buildInjectivityChecker(var_517, 6, new int[] {10});
		final Stub<Address<? extends Supplier>> var_519 = buildable.buildInjectivityChecker(var_518, 7, new int[] {10});
		final Stub<Address<? extends Supplier>> var_520 = buildable.buildInjectivityChecker(var_519, 8, new int[] {10});
		final Stub<Address<? extends Supplier>> var_521 = buildable.buildInjectivityChecker(var_520, 9, new int[] {10});
		final Stub<Address<? extends Supplier>> var_522 = buildable.buildInjectivityChecker(var_521, 10, new int[] {4});
		final Stub<Address<? extends Supplier>> var_523 = buildable.buildInjectivityChecker(var_522, 10, new int[] {0});
		final Stub<Address<? extends Supplier>> var_524 = buildable.buildInjectivityChecker(var_523, 10, new int[] {2});
		final Stub<Address<? extends Supplier>> var_525 = buildable.buildInjectivityChecker(var_524, 10, new int[] {5});
		final Stub<Address<? extends Supplier>> var_526 = buildable.buildInjectivityChecker(var_525, 10, new int[] {1});
		final Stub<Address<? extends Supplier>> var_527 = buildable.buildInjectivityChecker(var_526, 10, new int[] {3});
		final Object var_528 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("ContainerNode"))).getEStructuralFeature("components");
		final Stub<Address<? extends Supplier>> var_529 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"N3", "C3"}), var_528);
		final TupleMask var_530 = new TupleMask(new int[] {8}, 11);
		final TupleMask var_531 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_532 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_533 = buildable.buildBetaNode(var_527, var_529, var_530, var_531, var_532, false);
		final Stub<Address<? extends Supplier>> var_534 = buildable.buildInjectivityChecker(var_533, 6, new int[] {11});
		final Stub<Address<? extends Supplier>> var_535 = buildable.buildInjectivityChecker(var_534, 7, new int[] {11});
		final Stub<Address<? extends Supplier>> var_536 = buildable.buildInjectivityChecker(var_535, 8, new int[] {11});
		final Stub<Address<? extends Supplier>> var_537 = buildable.buildInjectivityChecker(var_536, 9, new int[] {11});
		final Stub<Address<? extends Supplier>> var_538 = buildable.buildInjectivityChecker(var_537, 10, new int[] {11});
		final Stub<Address<? extends Supplier>> var_539 = buildable.buildInjectivityChecker(var_538, 11, new int[] {4});
		final Stub<Address<? extends Supplier>> var_540 = buildable.buildInjectivityChecker(var_539, 11, new int[] {0});
		final Stub<Address<? extends Supplier>> var_541 = buildable.buildInjectivityChecker(var_540, 11, new int[] {2});
		final Stub<Address<? extends Supplier>> var_542 = buildable.buildInjectivityChecker(var_541, 11, new int[] {5});
		final Stub<Address<? extends Supplier>> var_543 = buildable.buildInjectivityChecker(var_542, 11, new int[] {1});
		final Stub<Address<? extends Supplier>> var_544 = buildable.buildInjectivityChecker(var_543, 11, new int[] {3});
		final TupleMask var_545 = new TupleMask(new int[] {9, 6, 10, 7, 11, 8}, 12);
		final Stub<Address<? extends Supplier>> var_546 = buildable.buildTrimmer(var_544, var_545);
		buildable.buildConnection(var_546, var_405);
		return var_405;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("kevoree.threeBuyers".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("N1", 0);
			posMapping.put("C1", 1);
			posMapping.put("N2", 2);
			posMapping.put("C2", 3);
			posMapping.put("N3", 4);
			posMapping.put("C3", 5);

		}
		return posMapping;
	}
}
