package com.example.food;

public class food {
    int id;
    String title,content;
    float price;

    public food() {
    }

    public food(int id, String title, String content, float price) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
