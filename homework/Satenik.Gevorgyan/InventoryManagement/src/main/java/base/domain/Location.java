package base.domain;

/**
 * Created by Satenik.Gevorgyan on 7/29/2015.
 */
public class Location {
    private Integer country;
    private Integer building;
    private Integer floor;
    private Integer room;

    //----------- Getters and Setters -----------//


    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getBuilding() {
        return building;
    }

    public void setBuilding(Integer building) {
        this.building = building;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }
}
