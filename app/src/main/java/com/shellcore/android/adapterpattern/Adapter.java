package com.shellcore.android.adapterpattern;

/**
 * Created by Shell on 18/11/2017.
 */

public class Adapter implements NewLocation {

    private final OldLocation location;

    private String building;
    private int floor;
    private int desk;

    public Adapter(OldLocation location) {
        this.location = location;
        setBuilding(location.getBuilding());
        setFloor(location.getFloor());
        setDesk(location.getDesk());
    }

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
    public int getDesk() {
        return desk;
    }

    @Override
    public void setDesk(int desk) {
        this.desk = desk;
    }
}
