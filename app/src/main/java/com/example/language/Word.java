package com.example.language;

import android.support.v4.os.IResultReceiver;

public class Word {
    private String mDefaultTranslation;
    private String mNumberTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    private int mAudioResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String numberTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mNumberTranslation = numberTranslation;
        mAudioResourceId = audioResourceId;
    }
    public Word(String defaultTranslation, String numberTranslation, int imageResoureId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mNumberTranslation = numberTranslation;
        mImageResourceId = imageResoureId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getNumberTranslation(){
        return mNumberTranslation;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage(){
        if(mImageResourceId==NO_IMAGE_PROVIDED){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mNumberTranslation='" + mNumberTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
