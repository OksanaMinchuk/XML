package by.oksana.L10.BookShop;

//Маршализация: создание JAXB контекста на основе класса BooksList,
//создание на его основе экземпляра типа Marshaller и сохранение информации в файл

import javax.xml.bind.*;
import java.io.File;


public class MainShopMarshaller {
    public static void main(String[] args) {
        File file = new File("books.xml");

        try {
            JAXBContext context = JAXBContext.newInstance(BooksList.class);
            Marshaller marshaller = context.createMarshaller();

            BooksList book = new BooksList() {
                {
                    Book b = new Book(111, "Java_Methods_Programming", "Blinov", 2013);
                    this.add(b);
                    b = new Book(222, "Java_for_children", "Yakov_Fain", 2011);
                    this.add(b);
                    b = new Book(333, "Java_2", "Shildt", 2000);
                    this.add(b);
                }
            };
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(book, file);
            marshaller.marshal(book, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
