public class Pen extends Product{

    private String color;

    public Pen() {

    }

    public Pen(long productId, String name, String color) {
        super(productId, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
