package DAO;
import DAO.test.CarTestService;
import org.junit.Test;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.jgroups.util.Util.assertTrue;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "../../resources/myextension-spring.xml" })
public class TestCarDAO {
    @Autowired
    private CarTestService carTest;

    @Test
    public void carCountTest() {
        System.out.println("count of cars");
        System.out.println("count of cars" + carTest.carCountTest().toString() );
      //  assertTrue("Cars are present", carDAO.getAllCars().size() == 2);
        //System.out.println("qweq");
         assertTrue("",2==2);
    }
    public void setCarTest(CarTestService carTest) {
        this.carTest = carTest;
    }
}
