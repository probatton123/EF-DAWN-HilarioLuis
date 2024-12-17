package pe.edu.i202222714.EF_HILARIOTRINIDAD_LUISEDUARDO.response;

import pe.edu.i202222714.EF_HILARIOTRINIDAD_LUISEDUARDO.dto.CarDetailDto;

public record FindCarResponse(
        String code,
        String error,
        CarDetailDto carDetailDto
) {
}
