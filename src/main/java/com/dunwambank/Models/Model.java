package com.dunwambank.Models;

import com.dunwambank.views.ViewFactory;

public class Model {
    // Singleton instance of Models
    private static final Model instance = new Model();

    // Shared instance of ViewFactory
    private final ViewFactory viewFactory = new ViewFactory();

    // Private constructor to prevent external instantiation
    private Model() { }

    // Accessor for the singleton instance
    public static Model getInstance() {
        return instance;
    }

    // Accessor for the shared ViewFactory instance
    public ViewFactory getViewFactory() {
        return viewFactory;
    }
}
