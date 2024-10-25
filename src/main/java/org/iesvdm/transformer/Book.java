package org.iesvdm.transformer;

public class Book {
    //Attributtes
    private String title;
    private int pages;

    //Constructor
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    //Getters y Setters
    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " (" + pages + " pages)";
    }
}
