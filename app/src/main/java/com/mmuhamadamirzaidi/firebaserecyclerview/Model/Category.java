package com.mmuhamadamirzaidi.firebaserecyclerview.Model;

public class Category {
    String Name, Image, Description, Key;

    public Category() {
    }

    public Category(String name, String image, String description, String key) {
        Name = name;
        Image = image;
        Description = description;
        Key = key;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }
}



