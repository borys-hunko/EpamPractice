package task1.collection;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Product {
    public static final int PRICE_PRECISION = 2;
    private String name;
    private BigDecimal price;
    private LocalDate manufactureDate;

    public Product() {
    }

    public Product(String name, BigDecimal price, LocalDate manufactureDate) {
        this.name = name;
        this.price = price.movePointRight(PRICE_PRECISION);
        this.manufactureDate = manufactureDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price.movePointRight(PRICE_PRECISION);
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", manufactureDate=" + manufactureDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        return name.equals(product.name) && price.equals(product.price) && manufactureDate.equals(product.manufactureDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, manufactureDate);
    }
}
