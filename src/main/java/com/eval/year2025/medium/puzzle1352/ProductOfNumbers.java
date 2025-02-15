package com.eval.year2025.medium.puzzle1352;


import java.util.ArrayList;
import java.util.List;

class ProductOfNumbers {
    private final List<Integer> prefixProducts;

    public ProductOfNumbers() {
        prefixProducts = new ArrayList<>();
        prefixProducts.add(1); // Initial dummy product
    }

    public void add(int num) {
        if (num == 0) {
            prefixProducts.clear();
            prefixProducts.add(1); // Reset since any product involving zero is zero
        } else {
            int lastProduct = prefixProducts.getLast();
            prefixProducts.add(lastProduct * num);
        }
    }

    public int getProduct(int k) {
        int size = prefixProducts.size();
        if (k >= size) return 0; // If k exceeds available numbers, return 0
        return prefixProducts.get(size - 1) / prefixProducts.get(size - 1 - k);
    }
}

/*
  Your ProductOfNumbers object will be instantiated and called as such:
  ProductOfNumbers obj = new ProductOfNumbers();
  obj.add(num);
  int param_2 = obj.getProduct(k);
 */