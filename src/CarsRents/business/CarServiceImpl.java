package CarsRents.business;

import CarsRents.model.Cars;
import CarsRents.model.Status;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class CarServiceImpl implements CarService{

    private List<Cars> cars = asList(
            new Cars(1,"Kia", Status.FREE_TO_USE, BigDecimal.valueOf(100)),
            new Cars(2,"Ford", Status.FREE_TO_USE,BigDecimal.valueOf(90)),
            new Cars(3,"Volvo", Status.IN_USE,BigDecimal.valueOf(210), Collections.singletonList("red, automatic, hybrid"))
    );

    @Override
    public List<Cars> getAllCars() {
        return null;
    }

    @Override
    public String getCarNameById(Integer id) {
        return null;
    }

    @Override
    public Cars getCarById(Integer id) {
        return null;
    }

    @Override
    public boolean deleteCarById(Integer id) {
        return false;
    }

    @Override
    public boolean addCar(Cars car) {
        return false;
    }

    @Override
    public boolean updateCarById(Integer id) {
        return false;
    }
}
