package DZ1.Ex2;

public class program {
    public static void main(String[] args) {
        Rectangle figur = new Rectangle(4, 2);
        figur.giveInfo();
        System.out.print("area:  ");
        figur.calculateArea();
        System.out.print("Perimeter: ");
        figur.calculatePerimeter();

        System.out.println("------------------------------------------------------------------------");

        Rectangle figur2 = new Rectangle(12, 45);
        figur2.giveInfo();
        System.out.print("area:  ");
        figur2.calculatePerimeter();
        System.out.print("Perimeter: ");
        figur2.calculatePerimeter();
    }
}
