package by.oksana.L10.BookShop;

//Демаршаллизация: получение из файла корректно созданного экземпляра класса BooksList

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;

public class MainShopUnmarshaller {
    public static void main(String[] args) {
        File file = new File("books.xml");
        try {
            JAXBContext context = JAXBContext.newInstance(BooksList.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            BooksList book = (BooksList) unmarshaller.unmarshal(file);
            System.out.println(book);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
