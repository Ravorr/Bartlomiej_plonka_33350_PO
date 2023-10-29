package po.laboratorium1;

public class Product {
    private String name ="";
    private Category category;
    private float price = 0.F;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name ==""){
            System.out.println("Nazwa nie może być pusta");
        }else {
            this.name = name;
        }
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

        if (price < 0){
            System.out.println("Cena nie może być ujemna.");
        }else {
            this.price = (Math.round(price * 100.0F) / 100.0F);
        }

    }

    @Override
    public String toString() {
        return "Nazwa przedmiotu: " + name + ", "  + category + ", " + "Cena przedmiotu: " + price;
    }
}
