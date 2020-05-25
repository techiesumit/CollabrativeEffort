package org.example.sumit.strategy.pattern.factory;

import org.example.sumit.strategy.pattern.model.*;

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShapeFactoryImpl implements ShapeFactory {

    private  Map<ShapeType, Shape> map = Stream.of(
            new AbstractMap.SimpleImmutableEntry<>(ShapeType.CIRCLE, new Circle()),
            new AbstractMap.SimpleImmutableEntry<>(ShapeType.SQUARE, new Square()),
            new AbstractMap.SimpleImmutableEntry<>(ShapeType.TRIANGLE,new Triangle()))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    @Override
    public Shape getShapeByType(ShapeType shapeType) {
        return map.get(shapeType);
    }
}
