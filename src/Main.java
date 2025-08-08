import enums.OrderStatus;
import enums.Role;
import interfaces.Flyable;
import interfaces.MathOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static <list> void main(String[] args) {
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

        Bird br = new Parrot("Parrot");
        br.fly();
        br.eat();

        Animal an = new Cat("Cat");
        an.makeNoise();
        an.eat();

        Bird os = new Ostritch("Ost");
        os.fly();

        System.out.println(printNum(5,5));*/
        Role log = Role.ADMIN;

        switch (log){
            case ADMIN:
                System.out.println("Welcome Admin");
                break;
            case USER:
                System.out.println("Welcome User");
                break;
            case GUEST:
                System.out.println("Welcome Guest");
                break;
            default:
                System.out.println("No log in");
        }

        Order or = new Order(101, OrderStatus.PENDING);
        or.printStatus();

        //MathOperation add = new Add();
        //System.out.println(add.operate(3,4));

        MathOperation mt = new Multiply();
        System.out.println(mt.operate(3,4));

        MathOperation add1 = (a,b) -> a + b;
        System.out.println(add1.operate(7,7));

        Flyable f = (S) -> System.out.println(S);
        f.fly2("Parrot");

        MathOperation add2 = Integer::sum;
        System.out.println(add2.operate(10,2));

        Predicate<Integer> isEven = (n) ->n%2==0;
        System.out.println(isEven.test(4));

        Function<Integer, String> concatInt = (Integer n) -> "Number - " + n;
        System.out.println(concatInt.apply(120));

        Supplier<Double> getRandomGeneratedValue = () -> Math.random();
        System.out.println(getRandomGeneratedValue.get());

        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<String> newNames = names.stream().filter(n ->n.startsWith("A"))
                      .map(String::toUpperCase)
                      .sorted()
                      .collect(Collectors.toList());
        System.out.println(newNames);

        FilterNum fil = new FilterNum();
        fil.setEvenNumbers();

        List<Employees> emp = new ArrayList<>();

        emp.add(new Employees("Rakesh",101,"Dev",10_00_000));
        emp.add(new Employees("Rahul",102,"cyber sec",9_00_000));

        List<String> developers = emp.stream()
                .filter(e -> e.getRole().equals("Dev"))
                .map(Employees::getEmpName)
                .toList();
        System.out.println(developers);

        List<String> words = Arrays.asList("Apple","Ball","Ant", "Bat");

        long count = words.stream()
                .filter(w -> w.startsWith("A"))
                .count();

        System.out.println(count);

        List<Integer> uniqueList = unique();
        System.out.println(uniqueList);

        List<Employees> salary = emp.stream()
                .sorted(Comparator.comparing(Employees::getSalary))
                .toList();

        System.out.println(salary);

    }/**varargs**/
    /*
    public static int printNum(int...num){
        int total = 0;
        for (int n: num){
            total += n;
        }
        return total;

    }*/

    public static List<Integer> unique(){
        List <Integer> list = Arrays.asList(2,3,4,2,4,5,6);
        return list.stream()
                .distinct()
                .toList();
    }


}



