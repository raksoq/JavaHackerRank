package CarsRents.business;

import CarsRents.model.Cars;

import java.util.List;

public interface CarService {
    List<Cars> getAllCars();
    String getCarNameById(Integer id);
    Cars getCarById(Integer id);
    boolean deleteCarById(Integer id);
    boolean addCar(Cars car);
    boolean updateCarById(Integer id);
}
