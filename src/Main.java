import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 5:");
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
        for (int[] row : array) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        System.out.println("Задача 6:");
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] resArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resArr[resArr.length - 1 - i] = arr[i];
        }
        arr = resArr;
        System.out.println(Arrays.toString(arr));

        System.out.println("Задача 7:");
        arr = new int[]{5, 8, 2, 3, 9};
        System.out.print(Arrays.toString(arr) + " -> ");
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] += arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1 - i];
            arr[i] -= arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr));

        // ищу уникальные пары, ведь от перестановки местами слагаемых сумма не меняется, правда? :)
        System.out.println("Задача 8:");
        arr = new int[]{-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int i = 0;
        boolean found = false;
        while (arr[i] < 0 && !found) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println(arr[i] + " + " + arr[j] + " = -2");
                    found = true;
                    break;
                }
            }
            i++;
        }

        System.out.println("Задача 9:");
        Arrays.sort(arr);
        i = 0;
        while (arr[i] < 0) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println(arr[i] + " + " + arr[j] + " = -2");
                }
            }
            i++;
        }
    }
}