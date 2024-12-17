package pe.edu.i202222714.EF_HILARIOTRINIDAD_LUISEDUARDO.dto;

public record CarDto(
        Integer carId,
        String make,
        String model,
        String licensePlate,
        String ownerName,
        String ownerContact,
        String insuranceCompany
) {
}
