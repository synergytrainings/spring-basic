package base.service;

import base.domain.baseDomain.BaseClassifier;

import java.util.List;

/**
 * Created by Satenik.Gevorgyan on 8/25/2015.
 */
public interface BaseClassifierDao {


    public List<BaseClassifier> getStatuses();

    public List<BaseClassifier> getUsageStatuses();

    public List<BaseClassifier> getCounties();

    public List<BaseClassifier> getBrands();

    public List<BaseClassifier> getCategories();

    public List<BaseClassifier> getRoles();

}
