package com.example.onskelisteprojekt.model;



public class ├śnskeliste {

    private String wish;

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public ├śnskeliste(String wish) {
        this.wish = wish;



    }

    @Override
    public String toString() {
        return "├śnskeliste{" +
                "wish='" + wish + '\'' +
                '}';
    }
}
