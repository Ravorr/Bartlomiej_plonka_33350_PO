package po.laboratorium1;

public class Product {
    private String name ="";
    private Category category;
    private float price = 0.F;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name" + name + ", " + "Category" + category + ", " + "Price" + price;
    }
}
