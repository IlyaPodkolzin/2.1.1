package com.company;

public class LittleBell extends Bell {
    public String getLength() {
        return "Длина - " + length + " см";
    }

    public String getWidth() {
        return "Ширина - " + width + " см";
    }

    public String getHeight() {
        return "Высота - " + height + " см";
    }

    public String makeSound() {
        return "Ding";
    }
}
