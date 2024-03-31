package com.company.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;
    public Building(int length, int width, int lotLength, int lotWidth){
        this.mLength = length;
        this.mWidth = width;
        this.mLotLength = lotLength;
        this.mLotWidth = lotWidth;
    }
    public Building(){
        this.mLength = 10;
        this.mWidth = 20;
        this.mLotLength = 30;
        this.mLotWidth = 40;
    }
    public int getLength(){
        return mLength;
    }
    public int getWidth(){
        return mWidth;
    }
    public int getLotLength(){
        return mLotLength;
    }
    public int getLotWidth(){
        return mLotWidth;
    }
    public void setLength(int length){
        mLength = length;
    }
    public void setWidth(int width){
        mWidth = width;
    }
    public void setLotLength(int length){
        mLotLength = length;
    }
    public void setLotWidth(int width){
        mLotWidth = width;
    }
    public int calcBuildingArea(){
        return mLength * mWidth;
    }
    public int calcLotArea(){
        return mLotLength * mLotWidth;
    }
    public String toString(){
        return "";
    }
}