package com.company.diamonds.logic;

import com.company.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size2) {

        // TODO -- add your code here
        int size=7;

        int h_border = size*2;
        int v_border = h_border-1;
        int pre,mid,p;
        int in=size*2-2;
        int str=v_border;
        String s = "";

        s=s+'+';
        for(int n=0;n<h_border;n++){
            s=s+'-';
        }
        s=s+'+';
        mOut.println(s);
        mid = 0;
        pre = (v_border-1)/2;
        while(str>0){
            s = "";
            s=s+'|';
            if(str==size){
                s=s+'<';
                p=in;
                while(p>0){
                    if(str%2==0) s=s+'-';
                    else s=s+'=';
                    p--;
                }
                s=s+'>';
                pre++;
                mid=mid-2;
            }
            else {
                if(str>size) {
                    p=pre;
                    while(p>0){
                        s=s+' ';
                        p--;
                    }
                    s=s+'/';
                    p=mid;
                    while(p>0){
                        if(str%2==0) s=s+'-';
                        else s=s+'=';
                        p--;
                    }
                    mid=mid+2;
                    s=s+'\\';
                    p=pre;
                    while(p>0){
                        s=s+' ';
                        p--;
                    }
                    pre--;
                }
                else {
                    p=pre;
                    while(p>0){
                        s=s+' ';
                        p--;
                    }
                    s=s+'\\';
                    p=mid;
                    while(p>0){
                        if(str%2==0) s=s+'-';
                        else s=s+'=';
                        p--;
                    }
                    mid=mid-2;
                    s=s+'/';
                    p=pre;
                    while(p>0){
                        s=s+' ';
                        p--;
                    }
                    pre++;
                }
            }
            s=s+'|';
            str--;
            mOut.println(s);
        }
        s = "";
        s=s+'+';
        for(int n=0;n<h_border;n++){
            s=s+'-';
        }
        s=s+'+';
        mOut.println(s);

    }

}
