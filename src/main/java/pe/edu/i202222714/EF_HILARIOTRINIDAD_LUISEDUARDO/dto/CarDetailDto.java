package pe.edu.i202222714.EF_HILARIOTRINIDAD_LUISEDUARDO.dto;

import java.util.Date;

public record CarDetailDto(
        Integer carId,
        String make,
        String model,
        Integer year,
        String licensePlate,
        String ownerName,
        String ownerContact,
        Date purchaseDate,
        Integer mileage,
        String engineType,
        String color,
        String insuranceCompany,
        String insurancePolicyNumber,
        Date registrationExpirationDate,
        Date serviceDueDate
) {
}
