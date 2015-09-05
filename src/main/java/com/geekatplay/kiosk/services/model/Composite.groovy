package com.geekatplay.kiosk.services.model

public class Composite {
    def long id
    def Foreground foreground;
    def String photo;
    def Background background;

    Composite(long id, String photo) {
        this.id = id
        this.photo = photo
    }
}
