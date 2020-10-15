package com.company;

public class Bell {
    protected String name;
    protected int height;
    protected int width;
    protected int length;

    public String getName() {
        return name;
    }

    public String getHeight() {
        return "Высота - " + height + " м";
    }

    public String getWidth() {
        return "Ширина - " + width + " м";
    }

    public String getLength() {
        return "Длина - " + length + " м";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
