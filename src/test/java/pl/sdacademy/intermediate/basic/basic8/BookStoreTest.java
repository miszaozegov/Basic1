package pl.sdacademy.intermediate.basic.basic8;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class BookStoreTest<pivate> {

    public static final int NUMBER_OF_BOOKS_ANDRZEJ_SAPKOWASKI = 8;
    private static final int NUMBER_OF_BOOKS_AFTER_INITIALIZATION = 36;
    private static final double BOOKS_WITCH_PRICE_29_99 = 29.99;
    private static BookStore bookStore;

    @BeforeClass
    public static void setUpClass() {
        bookStore = new BookStore();
    }

    @Test
    public void testBookStoreInitializer() {
        Assert.assertEquals(NUMBER_OF_BOOKS_AFTER_INITIALIZATION, bookStore.getBooks().size());
    }

    @Test

    public <Book> void testfindBookBytitle() {
        List<Book> bookByTitle = (List<Book>) bookStore.findBooksByTitle("Long Lost");
        Assert.assertEquals(1, bookByTitle.size());
        //Assert.assertEquals(longLostBook);
    }
    // @Test

    // public void testFinfBookByAuthor(){
    //  String
    //  List<Book> bookByAuthor = bookStore.findBooksByAuthor("Andrzej Sapkowski");
    // Assert.assertEquals(NUMBER_OF_BOOKS_ANDRZEJ_SAPKOWASKI, bookByAuthor.size());
    // Assert.assertTrue(bookByAuthor.stream)
    // .all
    // }
    @Test
    public void testFindBookByPrice() {
        double price = 29.99;
        List<Book> bookByPrice = bookStore.findBooksByPrice(price);
        Assert.assertEquals(BOOKS_WITCH_PRICE_29_99, bookByPrice.size());


    }

}
