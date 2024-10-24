package org.iesvdm.transformer;
//EJ7
public class PageChecker implements Comprobador<Book> {
    private int minPages;

    public PageChecker(int minPages) {
        this.minPages = minPages;
    }

    @Override
    public boolean check(Book item) {
        return item.getPages() > minPages;
    }
}
