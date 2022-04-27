package net.lyncas.scienceTools.trigonometry.controllers.implementation;

import lombok.RequiredArgsConstructor;
import net.lyncas.scienceTools.trigonometry.controllers.IShapeController;
import net.lyncas.scienceTools.trigonometry.dtos.CalculatedAreaAndPerimeterDTO;
import net.lyncas.scienceTools.trigonometry.dtos.TwoDimensionalShapeDto;
import net.lyncas.scienceTools.trigonometry.services.TrigonometryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ShapeController implements IShapeController {

    private final TrigonometryService service;

    @Override
    public ResponseEntity<List<CalculatedAreaAndPerimeterDTO>> calculateAreaAndPerimeterOfShape(
            TwoDimensionalShapeDto twoDimensionalShapeDTO) {
        List<CalculatedAreaAndPerimeterDTO> calculatedAreaAndPerimeterDTOS = service.calculateAreaAndPerimeter(twoDimensionalShapeDTO);
        return ResponseEntity.ok(calculatedAreaAndPerimeterDTOS);
    }
}
