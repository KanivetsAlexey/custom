package DAO;

import myextension.jalo.ParkingPlace;
import myextension.model.CarModel;
import myextension.model.ParkingPlaceModel;

import java.util.List;

public interface ParkingPlaceDAO {

    public Integer getParkingPlaceCount();

    public List<ParkingPlaceModel> getAllParkingPlace();
}
