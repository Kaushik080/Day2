public abstract class Bird extends Animal{
    public abstract void makeNoise();
    public abstract void fly();

    public Bird(String name) {
        super(name);
    }

    public void sleep(){
        System.out.println("sleeping");
    }

}
