package www.xiaojin.interface_.collection_;

import java.util.ArrayList;
import java.util.Iterator;

public class collectionIterator {
    public static void main(String[] args) {
        ArrayList<Book> list =new ArrayList<>();
        list.add(new Book("三国演义","罗贯中",20.1));

        Iterator iterator= list.iterator();//迭代器

//        while(iterator.hasNext()){//遍历集合元素
//            Object object=iterator.next();
//            System.out.println(object);
//        }
        while (iterator.hasNext()) {//快捷间itit
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
