public class Parrot extends Bird{

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("parrot noise");
    }


    @Override
    public void fly() {
        System.out.println("Parrot fly");
    }
}
