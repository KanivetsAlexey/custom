package DAO.test;
import DAO.CarDAO;
import DAO.Impl.CarDAOImpl;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import myextension.model.CarModel;
import myextension.model.OwnerModel;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

import static org.jgroups.util.Util.assertEquals;
import static org.jgroups.util.Util.assertTrue;

public class CarTestService extends ServicelayerTransactionalTest {

    private CarDAO carDAO;

    public Integer carCountTest() {

        List<CarModel> carModelList = carDAO.getAllCars();

 //       assertTrue("Cars are present", carModelList.size() == 2);
//         assertTrue("",2==2);
        return carModelList.size();
    }

    public void setCarDAO(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public CarDAO getCar() {
        return carDAO;
    }
}
