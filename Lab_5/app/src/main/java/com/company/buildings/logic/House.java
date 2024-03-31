package com.company.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
       
    private String mOwner;
    private Boolean mPool;
    public House(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        this.mOwner = null;
        this.mPool = false;
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner){
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = false;
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool){
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    }
    public String getOwner(){
        return mOwner;
    }
    public boolean hasPool(){
        return mPool;
    }
    public void setOwner(String owner){
        this.mOwner = owner;
    }
    public void setPool(boolean pool){
        this.mPool = pool;
    }
    public int calcBuildingArea(){
        return super.calcBuildingArea();
    }
    public int calcLotArea(){
        return super.calcLotArea();
    }
    public String toString(){
        return "Owner: " + mOwner + "; has a big open space";
    }
    public boolean equals(House a){
        if((a.calcBuildingArea() == this.calcBuildingArea()) && (a.hasPool() == this.hasPool()))
            return true;
        else
            return false;
    }
}
