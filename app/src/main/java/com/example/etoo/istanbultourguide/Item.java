package com.example.etoo.istanbultourguide;

public class Item {

    private int mItemTitle;

    private int mImageResource = NO_IMAGE_PROVIDED;

    private int mItemDescription;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Item(int itemTitle, int imageResource,int itemDescription) {
        mItemTitle = itemTitle;
        mImageResource = imageResource;
        mItemDescription = itemDescription;
    }
    public int getItemDescription(){return mItemDescription;}
    //Get item title of the item
    public int getItemTitle() {
        return mItemTitle;
    }
    //Get image resource id of textView
    public int getImageResourceId() {
        return mImageResource;
    }
    //Check if there is image or not
    public boolean hasImage() {
        return mImageResource != NO_IMAGE_PROVIDED;
    }

}
