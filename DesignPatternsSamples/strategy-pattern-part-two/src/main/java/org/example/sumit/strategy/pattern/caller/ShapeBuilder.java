package org.example.sumit.strategy.pattern.caller;

import org.example.sumit.strategy.pattern.factory.ShapeFactory;
import org.example.sumit.strategy.pattern.factory.ShapeFactoryImpl;
import org.example.sumit.strategy.pattern.model.Circle;
import org.example.sumit.strategy.pattern.model.Shape;
import org.example.sumit.strategy.pattern.model.ShapeType;

public class ShapeBuilder {
    public static void main(String[] args) {
        ShapeFactory shapeFactory= new ShapeFactoryImpl();
        Shape circle= shapeFactory.getShapeByType(ShapeType.CIRCLE);
        circle.draw();
    }
}
