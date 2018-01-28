package com.srikarmutnuri.tourguideapp;


public class InfoList {

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mName;
    private int mDesc;
    private int mAddress;
    private int mTime;

    public InfoList(int imageResourceId, int name, int desc, int address, int workHours) {
        mImageResourceId = imageResourceId;
        mName = name;
        mDesc = desc;
        mAddress = address;
        mTime = workHours;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getName() {
        return mName;
    }

    public int getDesc() {
        return mDesc;
    }

    public int getAddress() {
        return mAddress;
    }

    public int getWorkHours(){
        return mTime;
    }

}