package com.dunwambank.Models;

import com.dunwambank.views.ViewFactory;

public class Models {
    // Singleton instance of Models
    private static final Models instance = new Models();

    // Shared instance of ViewFactory
    private final ViewFactory viewFactory = new ViewFactory();

    // Private constructor to prevent external instantiation
    private Models() { }

    // Accessor for the singleton instance
    public static Models getInstance() {
        return instance;
    }

    // Accessor for the shared ViewFactory instance
    public ViewFactory getViewFactory() {
        return viewFactory;
    }
}
