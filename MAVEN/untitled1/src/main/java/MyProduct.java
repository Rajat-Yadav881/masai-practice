import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "product_type",discriminatorType = DiscriminatorType.INTEGER)
public class MyProduct {
    @Id
    private long productId;
    private String name;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyProduct(String name) {
        this.name = name;
    }
    public MyProduct() {

    }

    @Override
    public String toString() {
        return "MyProduct{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                '}';
    }
}
