import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        System.out.println("task2");
        int[] mass1 = new int[10];
        int[] mass2 = new int[5];
        try {
            int[] a=Sum(mass1,mass2);
            System.out.println(Arrays.toString(a));
        } catch (Exception e) {
            System.out.println("размерность не совпадает");
        }
    }
    public static int[] Sum(int[] mass1, int[] mass2) {
        int[] mass3 = new int[10];
        for (int i = 0; i < mass1.length; i++) {
            mass3[i] = mass1[i] - mass2[i];
        }
        return mass3;
    }
}