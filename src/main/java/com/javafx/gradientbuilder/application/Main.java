package com.javafx.gradientbuilder.application;

import javafx.application.Application;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
        new Main().start(args);
    }

    private void start(String... args) {
            startGui(args);
    }


    private void startGui(final String[] args) {
       Application.launch(GradientBuilderApp.class, args);
    }
}

