package DAO;

import myextension.model.CarModel;
import myextension.model.ParkingModel;

import java.util.List;

public interface ParkingDAO {

    public Integer getParkingCount();

    public List<ParkingModel> getAllParkings();
}
