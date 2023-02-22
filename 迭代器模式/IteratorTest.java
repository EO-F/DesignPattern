public class IteratorTest {

    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new book("文城", 55.0,"余华"));
        bookShelf.appendBook(new book("机器学习", 63.0,"周志华"));
        bookShelf.appendBook(new book("统计学习方法", 82.0,"李航"));
        
        Iterator<book> iterator = bookShelf.getIterator();
        while (iterator.hasNext()){
            book book = iterator.next();
            System.out.println("book = " + book);
        }
    }

}