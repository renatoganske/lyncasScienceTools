package net.lyncas.scienceTools.trigonometry.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Essa classe abstrata tende a representar um comportamento padrão entre objetos que irão herdá-la
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type"
)

public abstract class ThreeDimensionalShape extends TwoDimensionalShape{

    public abstract Double calculateVolume();
}
