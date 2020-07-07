package com.example.leaderboard;

public class Friend {

    private String imageURL;
    private String name;
    private String pts;
    private String level;
    private int placeNumber;
    private int progress;

    public Friend(String imageURL, String name, int progress, String pts, String level, int placeNumber){
        this.imageURL = imageURL;
        this.name = name;
        this.pts = pts;
        this.level = level;
        this.progress = progress;
        this.placeNumber = placeNumber;
    }

    public String getImageURL(){
        return imageURL;
    }

    public String getName(){
        return name;
    }

    public String getPts(){
        return pts;
    }

    public String getLevel(){
        return level;
    }

    public int getProgress(){
        return progress;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }
}
