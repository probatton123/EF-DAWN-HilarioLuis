package pe.edu.i202222714.EF_HILARIOTRINIDAD_LUISEDUARDO.service;
import pe.edu.i202222714.EF_HILARIOTRINIDAD_LUISEDUARDO.dto.CarDetailDto;
import pe.edu.i202222714.EF_HILARIOTRINIDAD_LUISEDUARDO.dto.CarDto;
import pe.edu.i202222714.EF_HILARIOTRINIDAD_LUISEDUARDO.dto.CarUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {

    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto CarDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarUpdateDto carUpdateDto) throws Exception;
}
