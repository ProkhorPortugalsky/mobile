package com.company.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here
    public static final int OUT = -1;
    public static final int IN = 1;
    public static final int CLOSED = 0;
    private int mSwing = CLOSED;
    public int getSwingDirection(){
        return mSwing;
    }
    public boolean setSwing(int direction){
        if ((direction == OUT) || (direction == IN) || (direction == CLOSED)){
            mSwing = direction;
            return true;
        }

        else return false;
    }
    public boolean open (int direction){
        if ((direction == OUT) || (direction == IN)){
            setSwing(direction);
            return true;
        }

        else return false;
    }
    public int thru (int count){
        if (getSwingDirection() == IN) return count;
        if (getSwingDirection() == OUT) return -count;
        return 0;
    }
    public void close(){
        setSwing(CLOSED);
    }

    public String toString (){
        if (getSwingDirection() == IN) return "This gate is open and swings to enter the pen only";
        if (getSwingDirection() == OUT) return "This gate is open and swings to exit the pen only";
        if (getSwingDirection() == CLOSED) return "This gate is closed";
        return "This gate has an invalid swing direction";
    }
}
