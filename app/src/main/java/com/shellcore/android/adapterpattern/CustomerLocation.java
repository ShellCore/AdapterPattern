package com.shellcore.android.adapterpattern;

/**
 * Created by Shell on 18/11/2017.
 */

public class CustomerLocation implements OldLocation {

    private String building;
    private int floor;
    private String office;
    private int desk;

    @Override
    public String getBuilding() {
        return building;
    }

    @Override
    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public int getFloor() {
        return floor;
    }

    @Override
    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String getOffice() {
        return office;
    }

    @Override
    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public int getDesk() {
        return desk;
    }

    @Override
    public void setDesk(int desk) {
        this.desk = desk;
    }
}
