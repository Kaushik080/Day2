public class Main {
    public static void main(String[] args) {
        /*Employee emp = new Employee("Kaushik", 22, new Address("Mumbai", "Maharashtra", 40000), 102, "Dev", 77000f);
        Student st = new Student("Kaushik", 22, new Address("Mumbai", "Maharashtra", 40000), 12, "A");
        System.out.println("Emp details");
        emp.displayInfo();
        System.out.println("Student Details");
        st.displayInfo();*/
        /*int sum = 0;
        for (String arg: args){
            sum += Integer.parseInt(arg);
        }
        System.out.println("sum: " + sum);*/
        /*------------------------------------
        Animal animal = new Animal("animalName");
        animal.makeNoise();

        Cat cat = new Cat("catName");
        cat.makeNoise();

        Animal an = new Cat("cat");
        an.makeNoise();

        Cat c = (Cat)an;
        c.jump();

        Dog d = new Dog("Dog");

        AnimalUtils au = new AnimalUtils();
        au.addAnimal(d);
         */
        Bird br = new Parrot("Parrot");
        br.fly();
        br.eat();

        Animal an = new Cat("Cat");
        an.makeNoise();
        an.eat();

        Bird os = new Ostritch("Ost");
        os.fly();
    }
}

