abstract public class Animal{
    private String name;

    public Animal(){
        System.out.println("non para");
    }

    public Animal(String name){
        this.name = name;
        System.out.println("animal name is " + name);
    }

    public void eat(){
        System.out.println("eating");
    }

    public abstract void makeNoise();

    public void roam(){
        System.out.println("is roaming");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}