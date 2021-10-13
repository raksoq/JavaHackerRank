package CarsRents.controller;

import CarsRents.business.CarService;
import CarsRents.business.CarServiceImpl;
import CarsRents.model.Cars;
import CarsRents.model.Status;

import java.math.BigDecimal;

public class CarsController {
    public static void main(String[] args) {

        CarServiceImpl carService = new CarServiceImpl();

        System.out.println(carService.getAllCars());

    }



}
