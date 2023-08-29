package DZ1.Ex2;

public class program {
    public static void main(String[] args) {
        Rectangle figur = new Rectangle(4, 2);
        figur.giveInfo();
        System.out.println("--------------------------");
        System.out.println("width: " + figur.getWidth());
        System.out.println("--------------------------");
        System.out.println("height: " + figur.getHeight());
        System.out.println("--------------------------");
        figur.calculateArea();
        figur.calculatePerimeter();

        System.out.println("------------------------------------------------------------------------");

        Rectangle figur2 = new Rectangle(12, 45);
        figur2.giveInfo();
        System.out.println("--------------------------");
        System.out.println("width: " + figur2.getWidth());
        System.out.println("--------------------------");
        System.out.println("height: " + figur2.getHeight());
        System.out.println("--------------------------");
        figur2.calculateArea();
        figur.calculatePerimeter();
        
    }
}
