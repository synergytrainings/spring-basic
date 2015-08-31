package unitTests;

import base.domain.baseDomain.BaseClassifier;
import base.service.BaseClassifierDao;
import base.service.BaseDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class TestInventory {

    @Autowired
    private BaseClassifierDao classifierDao;
    @Autowired
    private BaseDao dao;

    @Test
    public void testBrands(){
        List<BaseClassifier> brands = classifierDao.getBrands();
        assertNotNull("Brand list is Empty", brands);
    }

    @Test
    public void usageStatuses(){
        List<BaseClassifier> brands = classifierDao.getUsageStatuses();
        assertNotNull("Usage statuses list is Empty", brands);
    }

}
