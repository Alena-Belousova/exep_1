public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        try {
            int a = met1(7);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("ошибка");
        }
        try {
            met2(4);
            System.out.println("успех");
        } catch (Exception e) {
            System.out.println("нет такой позиции в массиве");
        }
        try {
            met3(8);

        } catch (Exception e) {
            System.out.println("превышение");
        }
    }

    public static int met1(int b) throws Exception {
        if (b < 10) {
            b = b + 1;
        } else {
            throw new Exception();
        }
        return b;
    }

    public static void met2(int b) throws Exception {
        int[] mass1 = new int[5];
        mass1[b] = 0;
    }

    public static void met3(int c) throws Exception {
        int[] mass1 = new int[c];
        if (mass1.length < 10) {
            System.out.println("ок");
        } else {
            throw new Exception();
        }
    }
}