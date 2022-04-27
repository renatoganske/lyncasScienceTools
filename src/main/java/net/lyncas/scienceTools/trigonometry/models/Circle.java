package net.lyncas.scienceTools.trigonometry.models;


import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter

@JsonTypeName("circle")
public class Circle extends TwoDimensionalShape {

    private Double radius;

    @Override
    public Double calculateArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public Double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

}
