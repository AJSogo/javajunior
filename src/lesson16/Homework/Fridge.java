package lesson16.Homework;

import java.util.*;


public class Fridge {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProducts(String nameOfProduct, int value) {
        nameOfProduct = nameOfProduct.toLowerCase();

        if (products.containsKey(nameOfProduct)) {
            int currentValue = products.get(nameOfProduct);
            products.put(nameOfProduct, value + currentValue);

        } else {
            products.put(nameOfProduct, value);
        }


    }

    public void takeProduct(String nameOfProduct, int value) {
        nameOfProduct = nameOfProduct.toLowerCase();
        //продукта нет в холодильнике или есть

        if (products.containsKey(nameOfProduct)) {
            if (value < products.get(nameOfProduct)) {


                products.put(nameOfProduct, (products.get(nameOfProduct) - value));

                System.out.println("Вы взяли " + value + " грамм" + " продукта - " + nameOfProduct + ". Осталось " + products.get(nameOfProduct));


            } else if (value == products.get(nameOfProduct)) {

                System.out.println("Вы взяли " + value + " грамм" + " продукта - " + nameOfProduct + ". Продукта больше нет в холодильнике");
                products.remove(nameOfProduct);


            } else {
                System.out.println("В холодильнике нет " + value + " грамм продукта " + nameOfProduct + ". Есть только " + products.get(nameOfProduct) + ".");
            }

        } else {
            System.out.println("Такого продукта нет в холодильнике");
            System.out.println("В холодильнике есть ");
            printAllProducts2();
        }
    }

    public void theSmallestNumberOfProduct() {

        Integer min = Collections.min(products.values());

        for (Map.Entry<String, Integer> pr : products.entrySet()
        ) {
            if (pr.getValue() == min) {
                System.out.println("Меньше всего в холодильнике продукта " + pr.getKey() + ". Его всего " + pr.getValue() + " грамм.");
            }
        }

    }

    public void sortKeys (){
        TreeSet <String> treeSet = new TreeSet<>();

        for (Map.Entry<String, Integer> pr : products.entrySet()
        ) {
            treeSet.add(pr.getKey());
        }

        for (String tr: treeSet
             ) {
            System.out.println( tr + " " + products.get(tr));
        }

    }

    /*public void sortValue (){
        TreeSet <Integer> treeSet = new TreeSet<>();

        for ( Integer pr : products.values()
        ) {
            treeSet.add(pr);
        }


        for (Integer weight : arrayList
        ) {
            if(weight == )
        }

    }*/

    public void printAllProducts() {
        for (Map.Entry<String, Integer> pr : products.entrySet()
        ) {
            System.out.println(pr.getKey() + " - " + pr.getValue());
        }

    }

    public void printAllProducts2() {
        for (String productName : products.keySet()
        ) {
            System.out.println(productName + " - " + products.get(productName));
        }

    }

    public void printTheWeightOfAllProducts() {
        int weightOfAll = 0;

        for (Map.Entry<String, Integer> pr : products.entrySet()
        ) {
            weightOfAll = weightOfAll + pr.getValue();
        }
        System.out.println("В холодильнике всего " + weightOfAll + " грамм.");
    }

}

