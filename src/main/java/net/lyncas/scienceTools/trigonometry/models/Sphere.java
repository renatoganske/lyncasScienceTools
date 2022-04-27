package net.lyncas.scienceTools.trigonometry.models;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Essa classe representa um modelo geom[etrico de esfera
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@JsonTypeName("sphere")
public class Sphere extends ThreeDimensionalShape{

    private Double radius;

    @Override
    public Double calculateVolume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public Double calculateArea() {
        return 4* Math.PI* Math.pow(radius, 4);
    }

    @Override
    public Double calculatePerimeter() {
        return null;
    }
}
