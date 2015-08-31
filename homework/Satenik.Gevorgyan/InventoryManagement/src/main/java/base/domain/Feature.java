package base.domain;

import base.domain.baseDomain.BaseClassifier;

/**
 * Created by Satenik.Gevorgyan on 7/30/2015.
 */
public class Feature{

    private Integer featureID;
    private BaseClassifier featureType;
    private String featureDetails;

    //----------- Getters and Setters -----------//


    public Integer getFeatureID() {
        return featureID;
    }

    public void setFeatureID(Integer featureID) {
        this.featureID = featureID;
    }

    public BaseClassifier getFeatureType() {
        return featureType;
    }

    public void setFeatureType(BaseClassifier featureType) {
        this.featureType = featureType;
    }

    public String getFeatureDetails() {
        return featureDetails;
    }

    public void setFeatureDetails(String featureDetails) {
        this.featureDetails = featureDetails;
    }
}
