import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate<book>{
    List<book> bookList = new ArrayList<>();

    @Override
    public Iterator<book> getIterator() {
        return new BookShelfIterator(this);
    }

    public Integer getLength(){
        return this.bookList.size();
    }

    public void appendBook(book book){
        bookList.add(book);
    }

    public book getBookAt(Integer position){
        return this.bookList.get(position);
    }

}