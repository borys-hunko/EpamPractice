import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import task1.collection.Product;
import task1.entities.MyList;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {
    private MyList<Product> products;

    @BeforeEach
    void initProducts() {
        products = new MyList<>();
    }

    @Test
    @DisplayName("test size() after initialization")
    void testSizeAfterInit() {
        assertEquals(0, products.size(), "should return 0");
    }

    @Test
    @DisplayName("test isEmpty()")
    void testIsEmpty() {
        assertTrue(products.isEmpty(), "list must be empty");
    }

    @Test
    @DisplayName("test add method. add element on one to list")
    void testAddingOneElementShouldReturnTrue() {
        Product product = new Product();
        product.setName("Pr");
        product.setPrice(BigDecimal.valueOf(122));
        product.setManufactureDate(LocalDate.of(2021, 1, 1));
        assertTrue(products.add(product));
    }

    @Test
    @DisplayName("test whether add method increases size of list")
    void testSizeAfterAddingElement() {
        products.add(null);
        assertEquals(1, products.size());
    }

    @Test
    @DisplayName("test whether add method increases size of list")
    void testMemoryAllocationInAdd() {
        for (int i = 0; i < 11; i++) {
            products.add(null);
        }
        assertEquals(11, products.size());
    }

    @Test
    void testAddingToTheBeginningOfList() {
        products.add(0, null);
        assertEquals(1, products.size());
    }

    @Test
    void testAddingToTheEndOfList() {
        products.add(products.size(), null);
        assertEquals(1, products.size());
    }

    @Test
    @DisplayName("insert element in somewhere in the middle of the list")
    void testAddingToTheMiddleOfList(){
        for (int i = 0; i < 5; i++) {
            products.add(null);
        }

        products.add(2, null);
        assertEquals(6, products.size());
    }
}
