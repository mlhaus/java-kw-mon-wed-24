package edu.kirkwood.project_demo.view;

import java.util.Scanner;

public interface Menu {
    // What is an interface?
    // An interface is an abstract class with abstract methods

    // What is an abstract class?
    // An abstract class is a class that cannot be used to instantiate objects
    // It is used to create a hierarchy of classes.

    // What is an abstract method?
    // An abstract method declares a method name, inputs, and outputs, but has no implementation.
    // The child classes are expected to implement the method

    void show(Scanner scanner);

}
