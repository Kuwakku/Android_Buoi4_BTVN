package com.example.android_buoi4_btvn;

public class User {
    private String userName, content, image, avatar;

    public User() {
    }

    public User(String userName, String content, String image, String avatar) {
        this.userName = userName;
        this.content = content;
        this.image = image;
        this.avatar = avatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
