package WorksForTesting;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        //trying to see the difference between collections
        //Set collections : (HashSet LinkedHashSet) (TreeSet)

        System.out.println("(HashSet // LinkedHashSet) (TreeSet)");

        HashSet <String> hashSet = new HashSet<>();
        LinkedHashSet <String> linkedHashSet = new LinkedHashSet<>();

        hashSet.add("B");
        hashSet.add("A");
        hashSet.add("F");
        hashSet.add("G");

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");

        //разброс
        hashSet.add("W");
        hashSet.add("L");
        hashSet.add("K");
        hashSet.add("F");



        System.out.println("Printing HashSet");
        for (String printingHashSet: hashSet
        ) {
            System.out.println(printingHashSet);
        }
        System.out.println();


        linkedHashSet.add("B");
        linkedHashSet.add("A");
        linkedHashSet.add("F");
        linkedHashSet.add("G");

        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("D");

        linkedHashSet.add("W");
        linkedHashSet.add("L");
        linkedHashSet.add("K");
        linkedHashSet.add("F");

        System.out.println("Printing LinkedHashSet");

        for (String printingLinkedHashSet: linkedHashSet
        ) {
            System.out.println(printingLinkedHashSet);
        }
        System.out.println();

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("F");
        treeSet.add("G");

        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");

        //разброс
        treeSet.add("W");
        treeSet.add("L");
        treeSet.add("K");
        treeSet.add("F");



        System.out.println("Printing TreeSet");
        for (String printingTreeSet: treeSet
        ) {
            System.out.println(printingTreeSet);
        }
        System.out.println();

        //List collections (ArrayList LinkedList) (Vector)

        System.out.println("(ArrayList // LinkedList)");

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        arrayList.add("W");
        arrayList.add("L");
        arrayList.add("K");
        arrayList.add("F");



        System.out.println("Printing ArrayList");
        for (String printingArrayList: arrayList
             ) {
            System.out.println(printingArrayList);
        }
        System.out.println();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        linkedList.add("W");
        linkedList.add("L");
        linkedList.add("K");
        linkedList.add("F");

        System.out.println("Printing LinkedList");
        for (String printingLinkedList: linkedList
        ) {
            System.out.println(printingLinkedList);

        }
        System.out.println();

        System.out.println("Проверка: есть ли у LinkedList индексы");
        System.out.println(linkedList.get(2));

    }
}