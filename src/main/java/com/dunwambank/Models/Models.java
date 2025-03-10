package com.dunwambank.Models;

import com.dunwambank.views.ViewFactory;

public class Models {
    private static Models instance = new Models();
    private ViewFactory viewFactory = new ViewFactory(); // Added ViewFactory instance

    private Models() { }

    public static Models getInstance() {
        return instance;
    }

    public ViewFactory getViewFactory() { // Added getter for ViewFactory
        return viewFactory;
    }
}
