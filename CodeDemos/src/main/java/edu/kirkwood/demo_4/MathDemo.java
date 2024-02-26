package edu.kirkwood.demo_4;

import edu.kirkwood.shared.Helpers;

import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
//        import math
//        import random
//
        System.out.println(Math.PI);//        print(math.pi)
        System.out.println(Math.abs(-1));//        print(math.fabs(-1))
        System.out.println(Math.ceil(1.23));//        print(math.ceil(1.23))
        System.out.println(Math.floor(1.23));//        print(math.floor(1.23))
        System.out.println(Math.round(1.23));//        print(round(1.23, 1))
        System.out.println(Helpers.round(1.23, 1));
        System.out.println(Math.max(1, 2));//        print(max(1, 2, 3))
        System.out.println(Math.min(1, 2));//        print(min(1, 2, 3))
        System.out.println(Math.pow(2, 3));//        print(math.pow(2, 3))
        System.out.println(Math.random());//        print(random.random())
        System.out.println(Math.sqrt(16));//        print(math.sqrt(16))
        System.out.println(Math.hypot(3, 4));//        print(math.hypot(3, 4))

        // Calculate the volume of a cylinder
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius? ");
        double radius = scanner.nextDouble();
        System.out.print("Height? ");
        double height = scanner.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.printf("The volume of the cylinder is %.4f", volume);
    }
}
