package DZ1.Ex1;


public class program{
    public static void main(String[] args) {
        int count = 1;
        
        Cat cat = new Cat("Barsik", 2, "Maikl");

        System.out.print(count + ":");
        cat.displayInfo();
        cat.makeSound();
        cat.get_Owner_name();
        
        count += 1;

        Cat cat2 = new Cat("Murka", 1, "Max");

        System.out.print(count + ":");
        cat2.displayInfo();
        cat2.makeSound();
        cat2.getName();
        count += 1;
        

        Cat cat3 = new Cat("Hvostik", 2);

       System.out.print(count + ":");
       cat3.displayInfo(); 
       cat3.makeSound();
       cat3.getAge();


    }
}