public class BookShelfIterator implements Iterator<book>{
    private BookShelf bookShelf;
    private int index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return bookShelf.getLength() > index;
    }

    @Override
    public book next() {
        book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}