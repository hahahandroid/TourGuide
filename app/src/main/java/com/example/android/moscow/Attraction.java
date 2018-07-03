package com.example.android.moscow;

/**
 * Created by kate on 02/07/18.
 */

public class Attraction {
    private String mName;
    private String mDescription;
    private int mImageID;

    public Attraction(String name, String description, int imageID) {
        mName = name;
        mDescription = description;
        mImageID = imageID;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDescription='" + mDescription + '\'' +
                ", mName='" + mName + '\'' +
                ", mImageID=" + mImageID +
                '}';
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageID() {
        return mImageID;
    }
}