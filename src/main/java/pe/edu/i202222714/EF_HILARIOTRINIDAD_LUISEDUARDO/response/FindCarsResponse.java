package pe.edu.i202222714.EF_HILARIOTRINIDAD_LUISEDUARDO.response;

import pe.edu.i202222714.EF_HILARIOTRINIDAD_LUISEDUARDO.dto.CarDto;

import java.util.List;

public record FindCarsResponse(
        String code,
        String error,
        List<CarDto> cars
) {
}
