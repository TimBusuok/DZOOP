package DZ3;

public interface SoundMarker {
    void makeSound();
    default void callAnimal() {
        System.out.println("Все счастливы!");
    }
}
