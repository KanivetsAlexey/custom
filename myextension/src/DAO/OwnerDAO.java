package DAO;

import myextension.model.CarModel;
import myextension.model.OwnerModel;

import java.util.List;

public interface OwnerDAO {

    public Integer getOwnerCount();

    public List<OwnerModel> getAllOwners();
}
