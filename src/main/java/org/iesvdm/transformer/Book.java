package org.iesvdm.transformer;

public class Book {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

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
