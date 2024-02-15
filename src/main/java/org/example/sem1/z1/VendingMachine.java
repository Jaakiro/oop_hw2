package org.example.sem1.z1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    public List<Product> productList = new ArrayList<>();

    public void initProducts(List<Product> list) {
        productList = list;
    }

    public Product getProduct(String name){
        for (Product i : productList) {
            if(i.getName().equals(name))
                return i;
        }
        return null;
    }
}
