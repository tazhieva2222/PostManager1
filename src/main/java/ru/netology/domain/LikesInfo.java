package ru.netology.domain;

public class LikesInfo {
    public int count;
    private boolean userLikes;
    private boolean canLike;


    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count = count;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }


}
