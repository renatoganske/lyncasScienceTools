package net.lyncas.scienceTools.trigonometry.dtos;

import net.lyncas.scienceTools.trigonometry.models.TwoDimensionalShape;

import java.util.List;

public record TwoDimensionalShapeDto(
        List<TwoDimensionalShape> shapes
) {
}
