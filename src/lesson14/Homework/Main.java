package lesson14.Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Integer> array = new ArrayList<>();
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        LinkedList<Integer> linked = new LinkedList<>();
        linked.add(4);
        linked.add(5);
        linked.add(6);
        linked.add(7);

        CollectionUtils utils = new CollectionUtils();
        Collection<Integer> utilsResult= utils.union(array, linked);
        System.out.println(utilsResult);

        Collection<Integer> intersecrionResult= utils.union(array, linked);
        System.out.println(utilsResult);
    }
}
