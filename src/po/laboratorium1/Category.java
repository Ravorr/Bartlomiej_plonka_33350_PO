package po.laboratorium1;

public class Category {
    private String name = "";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.length()==0){
            System.out.println("nieprawidłowa nazwa");
        }else {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return "Nazwa kategotii to: "+name;
    }

    public static void main(String[] args) {
        Category kat = new Category();

        kat.setName("Bartek");
        System.out.println(kat.getName());
        System.out.println(kat);
        kat.setName(null);
        kat.setName("");
    }
}

