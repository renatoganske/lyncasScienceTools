package net.lyncas.scienceTools.trigonometry.models;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@JsonTypeName("triangle")
public class Triangle extends TwoDimensionalShape {

    private Double baseLength;
    private Double height;

    @Override
    public Double calculateArea() {
        return (baseLength * height)/2;
    }

    @Override
    public Double calculatePerimeter() {
        var minorCathetusSquared = Math.pow(baseLength, 2);
        var majorCathetusSquared = Math.pow(height, 2);

        return Math.sqrt(minorCathetusSquared + majorCathetusSquared) + majorCathetusSquared + minorCathetusSquared;
    }
}
