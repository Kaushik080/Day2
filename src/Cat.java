public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("cat noise");
    }

    public void jump(){
        System.out.println(getName()+ " is jumping");
    }
}
