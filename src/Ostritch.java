public class Ostritch extends Bird{

    public Ostritch(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("ostritch noise");
    }

    @Override
    public void fly() {
        System.out.println("Can't fly");
    }
}
