package com.lizheblogs.databinding.ui.list;

import com.lizheblogs.databinding.data.Product;
import com.lizheblogs.databinding.ui.base.BaseListViewModel;

import java.util.ArrayList;

public class ListViewModel extends BaseListViewModel<Product> {
    //    // TODO: Implement the ViewModel
//    public final ObservableField<ArrayList<Product>> productData;
//    public final ArrayList<Product> products;
//
//    public ListViewModel() {
//        productData = new ObservableField<>();
//        products = new ArrayList<>();
//    }
//
//    public void initData() {
//        products.clear();
//        for (int i = 0; i < 300; i++) {
//            Product product = new Product();
//            product.setName("商品的名字" + i);
//            product.setCode(i);
//            product.setPrice(1.34 * i);
//            product.setQuantity(i);
//            products.add(product);
//        }
//        productData.set(products);
//    }
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
