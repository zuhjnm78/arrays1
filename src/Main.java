
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }


    public static void task1() {

        System.out.println("Задача 1");

        // Пишем код для задачи 1
        int [] array1;
        array1 = new int[] {1,2,3};
        double [] array2;
        array2 = new double[] {1.57, 7.654, 9.986};

        int [] array3 = {-5, 2, 0};






    }
    public static void task2() {

        System.out.println("Задача 2");

        // Пишем код для задачи 1
        int [] array1;
        array1 = new int[] {1,2,3};
        double [] array2;
        array2 = new double[] {1.57, 7.654, 9.986};

        int [] array3 = {-5, 2, 0};

        System.out.print(array1[0]+ ", " + array1[1]+ ", " + array1[2]);
        System.out.println();
        System.out.print(array2[0]+ ", " + array2[1]+ ", " + array2[2]);
        System.out.println();
        System.out.print(array3[0]+ ", " + array3[1]+ ", " + array3[2]);
        System.out.println();
    }
    public static void task3() {

        System.out.println("Задача 3");

        // Пишем код для задачи 1
        int [] array1;
        array1 = new int[] {1,2,3};
        double [] array2;
        array2 = new double[] {1.57, 7.654, 9.986};

        int [] array3 = {-5, 2, 0};

        System.out.print(array1[2]+ ", " + array1[1]+ ", " + array1[0]);
        System.out.println();
        System.out.print(array2[2]+ ", " + array2[1]+ ", " + array2[0]);
        System.out.println();
        System.out.print(array3[2]+ ", " + array3[1]+ ", " + array3[0]);
        System.out.println();

    }
    public static void task4() {

        System.out.println("Задача 4");
    int[] array4 = new int[] {1, 2, 3};
for (int i = 0; i < array4.length; i++) {
        if (array4[i] % 2 != 0) {
            array4[i]++;
        }
    }
        System.out.println(Arrays.toString(array4));
}
    }
