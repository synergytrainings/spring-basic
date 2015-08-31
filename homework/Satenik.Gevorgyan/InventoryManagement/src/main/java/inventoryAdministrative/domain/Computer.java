package inventoryAdministrative.domain;

import base.domain.Feature;
import base.domain.baseDomain.BaseItem;
import base.domain.baseDomain.BaseUser;

import java.util.ArrayList;

/**
 * Created by Satenik.Gevorgyan on 7/30/2015.
 */
public class Computer extends BaseItem {

    private String computerNumber;
    private BaseUser holder;
    private ArrayList<BaseItem> computerParts;
    private ArrayList<Feature>  additionalFeatures;

    public Computer() {
    }

    //----------- Getters and Setters -----------//


    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public BaseUser getHolder() {
        return holder;
    }

    public void setHolder(BaseUser holder) {
        this.holder = holder;
    }

    public ArrayList<BaseItem> getComputerParts() {
        return computerParts;
    }

    public void setComputerParts(ArrayList<BaseItem> computerParts) {
        this.computerParts = computerParts;
    }

    public ArrayList<Feature> getAdditionalFeatures() {
        return additionalFeatures;
    }

    public void setAdditionalFeatures(ArrayList<Feature> additionalFeatures) {
        this.additionalFeatures = additionalFeatures;
    }
}
