package DZ1.Ex1;

public class Cat extends Owner{
    private String name;
    private int age;

    public Cat(String name, int age, String owner_name){
        super(owner_name);
        this.name = name;
        this.age = age;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String get_Owner_name(){
        return owner_name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public void displayInfo() {
        if(owner_name == null){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
        else{
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Owner: " + owner_name);
        }
    }
    
    public void makeSound() {
        if(owner_name == null){
            System.out.println("Meow! My name is "+ name +". My "+ age + " years old");
        }
        else{
        System.out.println("Meow! My name is "+ name +". My "+ age + " years old.My owner's name " + owner_name);
        }
    }
}
