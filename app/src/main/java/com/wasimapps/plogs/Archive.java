package com.wasimapps.plogs;

/**
 * Created by wasim on 2015-12-03.
 */
public class Archive {
    private String title, description, dateTime, category, type;
    private int id;

    public Archive(String title, String description, String dateTime, String category, String type, int id) {
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
        this.category = category;
        this.type = type;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

}