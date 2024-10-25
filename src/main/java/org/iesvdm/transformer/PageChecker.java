package org.iesvdm.transformer;
//EJ7 this method will implement the checker , in our case comprobador of the book
public class PageChecker implements Comprobador<Book> {
    //We will see the min of Pages
    private int minPages;

    public PageChecker(int minPages) {
        this.minPages = minPages;
    }

    @Override
    public boolean check(Book item) {
        return item.getPages() > minPages;
    }
}
