
package DZ3;




import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main implements Constants {
    public static void main(String[] args) {
        Cat cat = new Cat();
        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Мурзик", 10, "Стёпа"));
        cats.add(new Cat("Люся", 1, "Дима"));
        cats.add(new Cat("Борис", 2, "Лёша"));
        cats.add(new Cat("Хвостик ", 3, "Миша"));

        

        cat.setName(CAT_NAME);
        cat.setAge(CAT_AGE);
        cat.setOwnerName(OWNER_NAME);
        
        

        cat.greet();
        
        

        Predicate<Integer> howOldCat = ageValue -> ageValue > OLD_CAT_AGE;
        boolean result = howOldCat.test(cat.getAge());
        if (result) {
            System.out.println(cat.getName() + ", пора пройти диспансеризацию!");
        }

        cat.makeSound();
        cat.makeStep();
        cat.careAnimal();
        cat.callAnimal();

        System.out.println("\nКотики до сортировки: ");
        for (Cat item : cats) {
            System.out.println(item);
        }

        Comparator<Cat> ageComparator = Comparator.comparingInt(item -> item.getAge());
        Collections.sort(cats, ageComparator);

        System.out.println("\nПосле сортировки котиков по возрасту: ");
        for (Cat item : cats) {
            System.out.println(item);
        }
    }
}