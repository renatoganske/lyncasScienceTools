package net.lyncas.scienceTools.trigonometry.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CalculatedAreaAndPerimeterDTO(

        @JsonProperty("Forma geométrica")
        String shape,

        @JsonProperty("área")
        Double area,

        @JsonProperty("perímetro")
        Double perimeter
) {
}
