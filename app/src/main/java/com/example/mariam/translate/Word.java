package com.example.mariam.translate;

public class Word {

    private String mDefaultTranslation ;

    private String mMiwokTranslation ;

    private int mImageResourceId = NO_IMAGE_PROVIDED ;

    private static final int NO_IMAGE_PROVIDED =-1;

    private int mAudio ;


    public Word(String DefaultTranslation, String MiwokTranslation, int Audio){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation ;
        mAudio = Audio ;

    }


    public Word(String DefaultTranslation, String MiwokTranslation, int ImageResourceId, int Audio){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation ;
        mImageResourceId = ImageResourceId;
        mAudio = Audio ;

    }

    public String getmDefaultTranslation(){

        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){

        return mMiwokTranslation ;
    }

    public int getmImageResourceId(){

        return mImageResourceId ;
    }

    public boolean hasImage(){

        return mImageResourceId != NO_IMAGE_PROVIDED ;
    }

    public int getmAudio(){

        return mAudio;
    }
}
