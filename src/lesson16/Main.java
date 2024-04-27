package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList <String> arrayList = new ArrayList<>();

        arrayList.add("qqq");
        arrayList.add("ddd");
        arrayList.add("fff");
        arrayList.add("555");
        arrayList.add("uuu");

        Collections.sort(arrayList, new Comparator <String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.compareTo(o2);   //если хочешь сортировать в обратном порядке, то o2.compareTo(o1);
            }
        });

        System.out.println(arrayList);

    }
}
