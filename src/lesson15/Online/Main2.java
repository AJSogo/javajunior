package lesson15.Online;

import lesson15.Online.Coin;

import java.util.Comparator;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1999, "Zoloto", 2.5);
        Coin coin2 = new Coin(5, 1999, "Zoloto", 2.5);
        Coin coin3 = new Coin(10, 1990, "Zoloto", 2.5);
        Coin coin4 = new Coin(50, 1899, "Olovo", 5);
        Coin coin5 = new Coin(5, 1869, "Serebro", 10);

        System.out.println("-------Sorting By Nominal");
        TreeSet<Coin> coins = new TreeSet<>();

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin c: coins
             ) {
            System.out.println(c);

        }

        // теперь я хочу сортировать по другому критерию, допустим, году, для этого создаем новый ТриСет

        System.out.println("-------Sorting By Year--------");
        TreeSet <Coin> coinsSortingByYear = new TreeSet<>(new SortingByYearComparator());
        coinsSortingByYear.addAll(coins);

        for (Coin c: coinsSortingByYear
        ) {
            System.out.println(c);

        }

        //метод сортировки через внутренний класс

        System.out.println("-------Sorting By Year In Ascending--------");
        TreeSet <Coin> coinsSortingByYearInAscending = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {

                if (o1.getYear() != o2.getYear()) {
                    return o2.getYear() - o1.getYear(); // 5 - 10 = -5
                }
                if (!o1.getMetal().equals(o2.getMetal())) {
                    return o2.getMetal().compareTo(o1.getMetal());
                }
                if (o1.getNominal() != o2.getNominal()) {
                    return o2.getNominal() - o1.getNominal(); // 5 - 10 = -5
                }

                return Double.compare(o2.getDiameter(), o1.getDiameter());
            }
        });

        coinsSortingByYearInAscending.addAll(coins);

        for (Coin c: coinsSortingByYearInAscending
        ) {
            System.out.println(c);
        }


    }
}
