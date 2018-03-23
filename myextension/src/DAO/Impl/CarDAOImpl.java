package DAO.Impl;

import DAO.CarDAO;
import com.google.common.collect.Lists;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.impl.DefaultFlexibleSearchService;
import myextension.enums.CarType;
import myextension.model.CarModel;
import myextension.model.OwnerModel;
import de.hybris.platform.servicelayer.search.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

public class CarDAOImpl extends AbstractItemDao implements CarDAO {


//    private FlexibleSearchService flexibleSearchService;

    //private ModelService modelService = getModelService();

//    @Resource
//    private ModelService modelService;

    @Override
    public Integer getCarsCount() {

        String query = "SELECT count(*) FROM {Car}";
        final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);

        return (Integer)getFlexibleSearchService().search(fQuery).getResult().get(0);
    }

    @Override
    public List<CarModel> getAllCars() {

        String query = "SELECT * FROM {Car}";
        final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
        System.out.println("before" + fQuery.toString());
        SearchResult<CarModel> cars = getFlexibleSearchService().search(fQuery);
        System.out.println("after");

        return getFlexibleSearchService().<CarModel>search(fQuery).getResult();
    }

//    public Integer insertCar() {nfv
//        final CarModel carModel = new CarModel();
//
//        carModel.setCarName("TestCar");
//        carModel.setGovernmentNumber(21231);
//        carModel.setType(CarType.HATCHBACK);
//        carModel.setCarName("testName");
//
//        modelService.save(carModel);
//
//
//        return getCarsCount();
//    }

    @Override
    public OwnerModel getCarOwner(CarModel car) {

        String query = "SELECT {PK} FROM {owner AS o LEFT JOIN car AS c ON {c.carOwner} = {o.PK}} WHERE {c.governmentNumber} = " + car.getGovernmentNumber();
        final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
        SearchResult<OwnerModel> searchResult = flexibleSearchService.search(fQuery);

        final List<OwnerModel> result = searchResult.getResult();

        return result.get(0);
    }

//
//    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
//        this.flexibleSearchService = flexibleSearchService;
//    }


}
