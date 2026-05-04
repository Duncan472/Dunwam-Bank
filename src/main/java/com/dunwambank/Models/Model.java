package com.dunwambank.Models;

import com.dunwambank.views.ViewFactory;

public class Model {
    private static Model model;
    private ViewFactory viewFactory;

    private Model() {this.viewFactory = new ViewFactory();}

    public synchronized static Model getInstance() {
        if (model == null) {
            model = new Model();

        }
        return model;
    }

    // Accessor for the shared ViewFactory instance
    public ViewFactory getViewFactory() {
        return viewFactory;
    }
}
