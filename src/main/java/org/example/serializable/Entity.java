package org.example.serializable;

import java.io.Serializable;

public class Entity implements Serializable {

    public String name;
    public boolean gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
