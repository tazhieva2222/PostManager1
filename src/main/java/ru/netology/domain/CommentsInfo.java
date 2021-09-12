package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;


    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count = count;
    }

    public boolean getCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }
}
