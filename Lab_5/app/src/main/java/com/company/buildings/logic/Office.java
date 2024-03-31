package com.company.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
       
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;
    public Office (int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        this.sTotalOffices++;
    }
    public Office (int length, int width, int lotLength, int lotWidth, String businessName){
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.sTotalOffices++;
    }
    public Office (int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpace){
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = parkingSpace;
        this.sTotalOffices++;
    }
    public String getBusinessName(){
        return this.mBusinessName;
    }
    public int getParkingSpaces(){
        return this.mParkingSpaces;
    }
    public void setBusinessName(String businessName){
        this.mBusinessName = businessName;
    }
    public void setParkingSpaces(int parkingSpaces){
        this.mParkingSpaces = parkingSpaces;
    }
    public String toString(){
        return "Business: unoccupied (total offices: " + this.sTotalOffices + ")";
    }
    public boolean equals(Office a){
        if((a.calcBuildingArea() == this.calcBuildingArea()))
            return true;
        else
            return false;
    }
}
