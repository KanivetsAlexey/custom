package DAO;

import myextension.model.CarModel;
import myextension.model.OwnerModel;

import java.util.List;

public interface CarDAO {

    public Integer getCarsCount();

    public List<CarModel> getAllCars();

    public OwnerModel getCarOwner(CarModel car);

//    public Integer insertCar();
}
