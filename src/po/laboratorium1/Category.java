package po.laboratorium1;

public class Category {
    private String name = "";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.length()==0) throw new IllegalArgumentException ("Argumentt nie może mieć watrość 0 lub null");
        else          this.name = name;

        }

    @Override
    public String toString() {
        return "Nazwa kategotii to: "+name;
    }

    private Category(String name) {

        this.name = name;
        setName(name);
    }

    public static Category from(String name){
        return new Category(name);
    }
    public static void main(String[] args) {
        Category kat = new Category("cos");

//        kat.setName("Bartek");
        System.out.println(kat.getName());
        System.out.println(kat);
//        kat.setName(null);
//        kat.setName("");
    }
}

