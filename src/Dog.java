public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog noise");
    }

    public void play(){
        System.out.println("playing");
    }
}
