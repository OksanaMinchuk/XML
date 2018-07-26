package by.oksana.L10.BookShop;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement (name = "SHOP")
    public class BooksList {

    @XmlElement (name = "nameOfShop")
    private String shop = "OZ.by";
    @XmlElement
    private String  phone = "8-017-222-22-22";

    @XmlElementWrapper(name =  "books")
    @XmlElement(name = "book")

    private ArrayList <Book> list = new ArrayList<Book>();

    public BooksList() {
        super();
    }

    public void setList(ArrayList<Book> list) {
        this.list = list;
    }

    public boolean add(Book book) {
        return list.add(book);
    }

    @Override
    public String toString() {
        return "BooksList{" +
                "list=" + list +
                '}';
    }
}
