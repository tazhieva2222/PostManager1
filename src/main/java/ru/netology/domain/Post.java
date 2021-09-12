package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId; // поле из документации
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int signerId;

    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private Copyright copyright;
    private CommentsInfo commentsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс CommentsInfo
    private Geo geo;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId() {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId() {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy() {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate() {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }
}
