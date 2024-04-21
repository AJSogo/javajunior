package lesson14.Homework;

import java.util.*;

public class CollectionUtils implements ICollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        ArrayList<Integer> result = new ArrayList<>();

        //при использовании цикла foreach вместо переменной встраивается значение массива, не индекс
        for (Integer numFromA : a) {
            if (b.contains(numFromA)) {
                result.add(numFromA);
            }

        }
        for (Integer numFromB : b) {
            if (a.contains(numFromB)) {
                result.add(numFromB);
            }

        }
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        LinkedHashSet<Integer> thirdMassive = new LinkedHashSet<>();

        if (a == null || b == null){
            System.out.println("Пустой массив, операция невозможна");
            return null;
        }

        for (Integer numsFromA :a
             ) {
            thirdMassive.add(numsFromA);
        }
        for (Integer numsFromB :b
        ) {
            thirdMassive.add(numsFromB);
        }


        return thirdMassive;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        if (a == null || b == null){
            System.out.println("Пустой массив, операция невозможна");
            return null;
        }

        LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>();

        for (Integer numsFromA: a
             ) {
            if(b.contains(numsFromA)){
                linkedHashSet.add(numsFromA);
            }

        }
        return linkedHashSet;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        if (a == null || b == null){
            System.out.println("Пустой массив, операция невозможна");
            return null;
        }

        ArrayList <Integer> arrayList= new ArrayList<>();

        arrayList.addAll(a);

        for (Integer numsFromA: arrayList
        ) {
            if(b.contains(numsFromA)){
                arrayList.remove(numsFromA);
            }

        }
        return arrayList;
    }


}
