package po.laboratorium1;

public class main {
    public static void main(String[] args) {
        Product produkt = new Product();
        Category kategoria = new Category();

        kategoria.setName("przedmiot");

        produkt.setCategory(kategoria);
        produkt.setPrice(2.69F);
        System.out.println(produkt.getPrice());
        produkt.setPrice(-12);
        produkt.setPrice(3.271F);
        System.out.println(produkt.getPrice());
        produkt.setPrice(3.277F);
        System.out.println(produkt.getPrice());
        produkt.setName("Kubek");
        System.out.println(produkt);
        System.out.println(produkt.getName());
        produkt.setName("");
    }
}
