package com.lizheblogs.databinding.ui.list;

import com.lizheblogs.databinding.data.Product;
import com.lizheblogs.databinding.ui.base.BaseListViewModel;

import java.util.ArrayList;

public class ListViewModel extends BaseListViewModel<Product> {

    public ArrayList<Product> getData() {
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            Product product = new Product();
            product.setName("商品的名字" + i);
            product.setCode(i);
            product.setPrice(1.34 * i);
            product.setQuantity(i);
            products.add(product);
        }
        return products;
    }
}
