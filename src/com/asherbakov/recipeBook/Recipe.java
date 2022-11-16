package com.asherbakov.recipeBook;

import java.util.*;

public class Recipe {
    private String recipeName;
    private final Map<Product, Double> productSet = new HashMap<>();

    public Recipe(String recipeName, Product... products) {
        setProductName(recipeName);
        for (Product p : products) {
            productSet.put(p, p.getCount());
        }
    }

    private void setProductName(String recipeName) {
        if (recipeName != null && !recipeName.isBlank()) {
            this.recipeName = recipeName;
        } else {
            throw new IllegalArgumentException("Наименование рецепта не задано, либо не корректно.");
        }
    }

    public double getProductsPrice() {
        double fullPrice = 0;
        for (Map.Entry<Product, Double> entry : productSet.entrySet()) {
            fullPrice += entry.getKey().getPrice() * entry.getValue();
        }
        return fullPrice;
    }

    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return recipeName.equals(recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }

    @Override
    public String toString() {
        return recipeName + "\n\tнеобходимые продукты: " + productSet + "\n";
    }
}
