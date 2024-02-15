package org.example.sem1.z2;

import java.util.List;

public interface VendingMachine {
    public void initProducts(List<Product> list);

    public Product getProduct(String name);
}
