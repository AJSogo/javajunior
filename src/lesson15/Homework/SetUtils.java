package lesson15.Homework;

import java.util.*;

public class SetUtils implements ISetUtils{
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {

        TreeSet <String> treeSet = new TreeSet<>();

        for (Integer x: collection1
             ) {
            treeSet.add(x + "");
        }

        treeSet.addAll(set2);

        return treeSet.descendingSet();
    }

    @Override

    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {

        LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(val1);
        linkedHashSet.add(val2);
        linkedHashSet.add(val3);
        linkedHashSet.add(val4);
        linkedHashSet.add(val5);


        return linkedHashSet;
    }
}
