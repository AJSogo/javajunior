package lesson15.Online;

import java.util.Comparator;

public class SortingByYearComparator implements Comparator <Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        // просто переставляем ифы в значимости от того, как я хочу сортировать, если сначала по году, то певым идет
        // иф с годом

        if (o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear(); // 5 - 10 = -5
        }
        if (!o1.getMetal().equals(o2.getMetal())) {
            return o1.getMetal().compareTo(o2.getMetal());
        }
        if (o1.getNominal() != o2.getNominal()) {
            return o1.getNominal() - o2.getNominal(); // 5 - 10 = -5
        }
        
        return Double.compare(o1.getDiameter(), o2.getDiameter());
    }

}
