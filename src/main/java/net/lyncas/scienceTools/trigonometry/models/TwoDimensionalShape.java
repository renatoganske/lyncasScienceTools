package net.lyncas.scienceTools.trigonometry.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Classe modelo abstrata que serve como contrato para as figuras geométricas 2D e irão herdá-las
 */

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Circle.class, name = "circle"),
        @JsonSubTypes.Type(value = Triangle.class, name = "triangle"),
        @JsonSubTypes.Type(value = Rectangle.class, name = "rectangle"),
        @JsonSubTypes.Type(value = Sphere.class, name = "sphere"),
        @JsonSubTypes.Type(value = Pyramid.class, name = "pyramid"),
        })
public abstract class TwoDimensionalShape {

    /**
     * Esse método é responsável pela área da figura
     * @return Double - a área calculada
     */
    public abstract Double calculateArea();

    /**
     * Esse método é responsável pelo perímetro da figura
     * @return Double - o per[imetro calculado
     */
    public abstract Double calculatePerimeter();


}
