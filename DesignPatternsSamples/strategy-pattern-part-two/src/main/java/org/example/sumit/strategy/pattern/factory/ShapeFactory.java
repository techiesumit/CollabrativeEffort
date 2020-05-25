package org.example.sumit.strategy.pattern.factory;

import org.example.sumit.strategy.pattern.model.Shape;
import org.example.sumit.strategy.pattern.model.ShapeType;

public interface ShapeFactory {
    Shape getShapeByType(ShapeType shapeType);
}
