package com.yto.bean;

import java.util.Date;
import java.util.List;

/**
 * @author  czw
 */

public class Diary {


    private int id;
    private String title;
    private String content;
    private Date pubTime;
    private int userId;
    private User user; //作者信息
    private List<Tag> tag; //所处的标签，一个文章可以属于不同的标签

    public Diary(String title, String content, Date pubTime, int userId) {
        this.title = title;
        this.content = content;
        this.pubTime = pubTime;
        this.userId = userId;
    }

    public List<Tag> getTags() {
        return tag;
    }

    public void setTags(List<Tag> tags) {
        this.tag = tags;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getUserId() {

        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getPubTime() {

        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public String getContent() {

        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Diary() {

    }
}