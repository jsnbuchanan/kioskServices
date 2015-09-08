package com.geekatplay.kiosk.services.model;

public class Composite {

    private long id;
    private Foreground foreground;
    private String photo;
    private Background background;

    public Composite(long id, String photo) {
        this.id = id;
        this.photo = photo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Foreground getForeground() {
        return foreground;
    }

    public void setForeground(Foreground foreground) {
        this.foreground = foreground;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

}

