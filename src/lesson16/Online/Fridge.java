package lesson16.Online;

import java.util.HashMap;
import java.util.Map;

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


    
    public void printAllProducts (){
        for (Map.Entry<String, Integer> pr : products.entrySet()
                ) {
            System.out.println(pr.getKey() + " - " + pr.getValue());
        }
        
    }
    public void printAllProducts2 (){
        for (String productName: products.keySet()
        ) {
            System.out.println(productName + " - " + products.get(productName));
        }

    }

}
