
public class Client {

    public static void main(String[] args) {
        // 1.构建书本对象
        Book book1 = new Book();
        // 2.编辑书本，添加图片
        book1.setTitle("书1");
        book1.addImage("图1");
        book1.showBook();

        // 以原型文档为原型，拷贝一份副本
        // 浅拷贝
        Book book2 = book1.clone();
        book2.showBook();
        // 修改图书副本，不会影响原始书本
        book2.setTitle("书2");
        book2.addImage("图2");
        book2.showBook();

        // 再次打印原始书本
        book1.showBook();

        /**
         * 最后两个书本内容输出是一致的。引用类型的新对象book2的image只是单纯指向了this.image引用，并没有重新构造一个image对象，
         * 然后将原始书本的图片添加到新的image对象中
         * ，这样导致book2中的image与原始书本中的是同一个对象。因此，修改其中一个书本的图片，另一个书本也会受到影响。
         */


    }
}