package lesson15.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListUtils implements IListUtils{
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {

        ArrayList <String> arrayList = new ArrayList<>();
        for (String a: strings
             ) {
            arrayList.add(a);
        }

        return arrayList;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {

        ArrayList<Double> arrayList= new ArrayList<>(data);

        Collections.sort(arrayList);
        Collections.reverse(arrayList);

        return arrayList;
    }
}
