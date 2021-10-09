package nabila;

public class Main {

    public static void main(String[] args) {

        Gadget gadget = new Gadget();
        gadget.aboutGadget();
        Laptop laptop = new Laptop();
        Nabila nabila = new Nabila();
        System.out.println("Name of laptop : "+nabila.name);
        System.out.println("Price : "+nabila.price);
        nabila.aboutGadget();
    }
}
