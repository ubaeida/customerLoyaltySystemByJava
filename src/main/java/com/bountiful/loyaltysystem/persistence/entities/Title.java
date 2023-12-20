package com.bountiful.loyaltysystem.persistence.entities;

public enum Title {
    MS("Ms"), MR("Mr"), MISS("Miss"), MRS("Mrs");
    String title;

    Title(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title{" + "title='" + title + '\'' + '}';
    }
}