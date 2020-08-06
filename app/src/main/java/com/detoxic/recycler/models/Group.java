package com.detoxic.recycler.models;

import java.util.List;

public class Group {

    private String title;
    private List<Baby> babies = null;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Baby> getBabies() {
        return babies;
    }

    public void setBabies(List<Baby> babies) {
        this.babies = babies;
    }

}
