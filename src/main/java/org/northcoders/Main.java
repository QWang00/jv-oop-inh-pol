package org.northcoders;

import org.northcoders.shapes.Circle;
import org.northcoders.shapes.Rectangle;
import org.northcoders.shapes.Shape;
import org.northcoders.shapes.Triangle;
import org.northcoders.vehicles.Car;
import org.northcoders.vehicles.Motorcycle;
import org.northcoders.vehicles.Vehicle;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(2, 5),
                new Triangle(3, 7)
        );

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area = " + shape.calculateArea());
        }
    }
}