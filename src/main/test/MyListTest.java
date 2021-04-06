import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import task1.collection.Product;
import task1.entities.MyList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyListTest {
    private MyList<Product> products;

    @BeforeEach
    void initProducts() {
        products = new MyList<>();
    }

    @Test
    @DisplayName("test size() after initialization")
    void testSizeAfterInit(){
        assertEquals(0,products.size(),"should return 0");
    }
}
