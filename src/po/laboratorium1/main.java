package po.laboratorium1;

import po.entities.Category;
import po.entities.Product;

public class main {
    public static void main(String[] args) {
//        Product produkt = new Product("RDR2", 22.5F);
//        Category kategoria = Category.from( "Gra");
//        Product product1  = new Product("Zeszyt", null,2.39F,Currency.PLN);
//        kategoria.setName("przedmiot");
//        Product
//
//
//
//        produkt.setCategory(kategoria);
//        produkt.setPrice(2.69F);
//        System.out.println(produkt.getPrice());
//        produkt.setPrice(-12);
//        produkt.setPrice(3.271F);
//        System.out.println(produkt.getPrice());
//        produkt.setPrice(3.277F);
//        System.out.println(produkt.getPrice());
//        produkt.setName("Kubek");
//        System.out.println(produkt);
//        System.out.println(produkt.getName());
//        produkt.setName("");
//        produkt.setName(null);
//
//        System.out.println(product1);
        Category artDom = Category.from("Artykułu domowe");
        Product product = Product
                .builder()
                .name("szklanka")
                .category(artDom)
                .price(12.67F)
                .currency(Currency.PLN)
                .build();

        System.out.println(product);
    }
}
