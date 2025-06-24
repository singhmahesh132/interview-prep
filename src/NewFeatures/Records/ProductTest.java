package src.NewFeatures.Records;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ProductTest {

    @Test
    void createProduct(){
        var product = new Product("Iphone", new BigDecimal("99999.99"), "Mobile");

        System.out.print("Product : "+product);
        assertEquals("Iphone",product.name());
        assertEquals("Mobile",product.type());
    }

    @Test
    void createProduct_nameNotValid(){
        var exception = assertThrows(IllegalArgumentException.class, ()-> new Product("", new BigDecimal("99999.99"), "Mobile"));

        assertEquals("Name is not valid",exception.getMessage());
    }

    @Test
    void createProduct_costNotValid(){
        var exception = assertThrows(IllegalArgumentException.class, ()-> new Product("Iphone", new BigDecimal("-99999.99"), "Mobile"));

        assertEquals("Cost is not valid",exception.getMessage());
    }
}