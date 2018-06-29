package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by pallavi on 27/6/18.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;



    public Earthquake (double magnitude, String location, long timeinmillisecond){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeinmillisecond;
    }
public double getmMagnitude() {
        return mMagnitude;
    }
    public String getmLocation(){
        return  mLocation;

    }
    public long getmTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }
}
