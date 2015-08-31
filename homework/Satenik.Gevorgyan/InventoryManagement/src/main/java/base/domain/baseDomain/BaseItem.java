package base.domain.baseDomain;

import base.domain.Diameters;
import base.domain.Location;
import base.domain.Price;

import java.util.Date;

/**
 * Created by Satenik.Gevorgyan on 7/27/2015.
 */
public class BaseItem {

    private BaseClassifier brand;
    private BaseClassifier category;
    private BaseClassifier status;
    private BaseUser owner;
    private Diameters diameters;
    private Location location;
    private Price price;

    private Date purchaseDate;
    private Date utilizeDate;
    private Integer itemID;
    private String itemName;
    private String itemDescription;
    private String itemComment;
    private String itemUniqueNumber;



    //----------- Getters and Setters -----------//


    public BaseClassifier getBrand() {
        return brand;
    }

    public void setBrand(BaseClassifier brand) {
        this.brand = brand;
    }

    public BaseClassifier getCategory() {
        return category;
    }

    public void setCategory(BaseClassifier category) {
        this.category = category;
    }

    public BaseClassifier getStatus() {
        return status;
    }

    public void setStatus(BaseClassifier status) {
        this.status = status;
    }

    public BaseUser getOwner() {
        return owner;
    }

    public void setOwner(BaseUser owner) {
        this.owner = owner;
    }

    public Diameters getDiameters() {
        return diameters;
    }

    public void setDiameters(Diameters diameters) {
        this.diameters = diameters;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getUtilizeDate() {
        return utilizeDate;
    }

    public void setUtilizeDate(Date utilizeDate) {
        this.utilizeDate = utilizeDate;
    }

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemComment() {
        return itemComment;
    }

    public void setItemComment(String itemComment) {
        this.itemComment = itemComment;
    }

    public String getItemUniqueNumber() {
        return itemUniqueNumber;
    }

    public void setItemUniqueNumber(String itemUniqueNumber) {
        this.itemUniqueNumber = itemUniqueNumber;
    }
}
