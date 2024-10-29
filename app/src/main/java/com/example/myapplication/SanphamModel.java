package com.example.myapplication;

import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;

public class SanphamModel implements Serializable {

    private String title;
    private String content;

    public SanphamModel(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
