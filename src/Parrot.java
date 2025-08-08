import interfaces.Flyable;

public class Parrot extends Bird implements Flyable{

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


    @Override
    public void fly2(String S) {

    }
}
