/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tarea7.url;

/**
 *
 * @author roman
 */
public class url {

    private String url;
    private String title;

    public url(String url, String title) {
        this.url = url;
        this.title = title;
    }

    public String geturl() {
        return url;
    }

    public void seturl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
