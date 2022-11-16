package com.asherbakov.recipeBook.exceptions;

public class ExistingRecipeException extends RuntimeException {
    public ExistingRecipeException() {
    }

    public ExistingRecipeException(String message) {
        super(message);
    }
}
