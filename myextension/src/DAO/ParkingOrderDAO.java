package DAO;

import myextension.model.CarModel;
import myextension.model.ParkingOrderModel;

import java.util.List;

public interface ParkingOrderDAO {

    public Integer getParkingOrderCount();

    public List<ParkingOrderModel> getAllParkingOrder();
}
