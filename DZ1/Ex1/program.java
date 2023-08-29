package DZ1.Ex1;


public class program{
    public static void main(String[] args) {
        int count = 1;
        
        Cat cat = new Cat("Barsik", 2, "Maikl");

        System.out.print(count + ":");
        cat.displayInfo();
        cat.makeSound();
        System.out.println("--------------------------");
        System.out.println("Owner: " + cat.get_Owner_name());
        System.out.println("--------------------------");
        System.out.println("Name: " + cat.getName());
        System.out.println("--------------------------");
        System.out.println("Age: " + cat.getAge());
        
        count += 1;

        Cat cat2 = new Cat("Murka", 1, "Max");

        System.out.print(count + ":");
        cat2.displayInfo();
        cat2.makeSound();
        System.out.println("--------------------------");
        System.out.println("Owner: " + cat2.get_Owner_name());
        System.out.println("--------------------------");
        System.out.println("Name: " + cat2.getName());
        System.out.println("--------------------------");
        System.out.println("Age: " + cat2.getAge());
        System.out.println("--------------------------");
        count += 1;
        

        Cat cat3 = new Cat("Hvostik", 2);

       System.out.print(count + ":");
       cat3.displayInfo(); 
       cat3.makeSound();
       System.out.println("--------------------------");
       System.out.println("Name: " + cat3.getName());
       System.out.println("--------------------------");
       System.out.println("Age: " + cat3.getAge());
       System.out.println("--------------------------");


    }
}