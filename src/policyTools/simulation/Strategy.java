package policyTools.simulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sun.tools.javac.util.Pair;

public enum Strategy {
	SIMPLE("Simple"),
	USER_SPLIT("Split_by_User"),
	ROLE_SPLIT("Split_by_Role"),
	ROLE_USER_SPLIT("Split_by_Role_and_User");
	
	private final String type; 

	Strategy(String type) {
		this.type = type;  
	}

	public String getType() {
		return type;
	}

	public String toString() {
		return type;
	}
	
	public static Set<Set<Strategy>> powerSetsOfTwo() {
		
		/*Set<Strategy> strategy = new Set();
		for (Strategy s: Strategy.values())
			strategy.add(s);
		List<Strategy> list = new ArrayList<Strategy>(strategy);
		Set<Set<Strategy>> sets = new HashSet<Set<Strategy>>();
       
		Strategy head = list.get(0);
		
        Set<Strategy> rest = new HashSet<Strategy>(list.subList(1, list.size()));
        for (Set<Strategy> set : powerSet(rest)) {
            Set<Strategy> newSet = new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }*/
        return null;
    }
}
