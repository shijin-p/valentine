package com.shijin.sample.model;

public class PinBoardItemModel {

    private String id;
    private int likes;
    private UserModel user;

    public String getId() {
        return id;
    }

    public int getLikesCount() {
        return likes;
    }

    public UserModel getUser() {
        return user;
    }
}
