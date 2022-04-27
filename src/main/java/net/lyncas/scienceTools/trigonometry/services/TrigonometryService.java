package net.lyncas.scienceTools.trigonometry.services;

import net.lyncas.scienceTools.trigonometry.dtos.CalculatedAreaAndPerimeterDTO;
import net.lyncas.scienceTools.trigonometry.dtos.TwoDimensionalShapeDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrigonometryService {

    public List<CalculatedAreaAndPerimeterDTO> calculateAreaAndPerimeter(TwoDimensionalShapeDto twoDimensionalShapeDTO){

        var dtos = new ArrayList<CalculatedAreaAndPerimeterDTO>();

        twoDimensionalShapeDTO.shapes().stream().forEach(shape -> {
            var area = shape.calculateArea();
            var perimeter = shape.calculatePerimeter();

            dtos.add(new CalculatedAreaAndPerimeterDTO(shape.toString(), area, perimeter));
        });

        return dtos;
    }

}
