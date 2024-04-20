package lesson15.Online;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main1 {

    public static void main(String[] args) {
        //
        TreeSet<String> set = new TreeSet<>();
        set.add("www");
        set.add("rrr");
        set.add("ttt");
        set.add("fff");
        set.add("fff");

        // мы можем объекты только перебрать, не можем модифицировать или удалять
        for (String s : set
             ) {
            System.out.println(s);
        }

        //если мы хотим использовать remove и остальное
        //мы можем сделать это с пощью итератор
                                                          //выдает булеановский ответ,
                                                        // есть следующий элемень или нет
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }






    }
}
