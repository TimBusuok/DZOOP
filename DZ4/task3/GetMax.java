package DZ4.task3;

public class GetMax {

    public static <T extends Comparable<T>> void GetMax(T a, T b){
        if(a.compareTo(b) >= 0){
            System.out.println(a);
        }
        System.out.println(b);

}
}
