package DZ4.task2;

public class program {
    public static void main(String[] args) {
         PrintArray printArr = new PrintArray();

        String[] arrString = {"Hello", "World"};
        Integer[] arrInt = {1, 10, 20, 30};

        printArr.printArray(arrString);
        printArr.printArray(arrInt);

    }
   

}
