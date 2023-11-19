package po.entities;

import po.laboratorium1.Currency;

public class Product {
    private String name ="";
    private Category category;
    private float price = 0.F;
    private Currency currency = Currency.PLN;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name ==""){
            System.out.println("Nazwa nie może być pusta");
            this.name = null;
        }else {
            this.name = name;
        }
    }



    public void setCategory(Category category) {
        this.category = category;
        if (category == null){
            System.out.println("Kategoria nie może być pusta");
            this.category = null;
        }
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {

        if (price < 0){
            System.out.println("Cena nie może być ujemna.");
            this.price = 0;
        }else {
            this.price = (Math.round(price * 100.0F) / 100.0F);
        }

    }

    @Override
    public String toString() {
        return "Nazwa przedmiotu: " + name + ", "  + category + ", " + "Cena przedmiotu: " + price;
    }

    private Product(String name, float price){
        this.name = name;
        setName(name);
        this.price = price;
        setPrice(price);
    }
    private Product(String name, Category category, float price){
        this.name = name;
        setName(name);
        this.category = category;
        setCategory(category);
        this.price = price;
        setPrice(price);
    }
    private Product(String name, Category category, float price, Currency currency) {
        setName(name);
        setCategory(category);
        setPrice(price);
        setCurrency(currency);
    }
    public static ProductBuilder builder(){
        return new ProductBuilder();
    }

    public static class ProductBuilder{
        private String name ="";
        private Category category;
        private float price = 0.F;
        private Currency currency = Currency.PLN;

        public ProductBuilder name(String name){
            this.name = name;
            return this;
        }
        public ProductBuilder category(Category category){
            this.category = category;
            return this;
        }
        public ProductBuilder price(float price){
            this.price = price;
            return this;
        }
        public ProductBuilder currency(Currency currency){
            this.currency = currency;
            return this;
        }
        public Product build(){
            return  new Product(name, category, price, currency);
        }
    }
}