// Составить частотный словарь элементов одномерного массива
// Частотный словарь содержит информацию о том, сколько раз встречается элемент входных данных.

// Пример:
// Есть набор данных

// { 1, 9, 9, 0, 2, 8, 0, 9 }
import java.util.Arrays;

public class dz_01 {
    public static void main(String[] args) {
        int[] array = new int[0];
        array = fill(array);
        print(array);
        sorting(array);
    }

    static int[] fill(int[] array) {
        int[] result = new int[] { 1, 9, 9, 0, 2, 8, 0, 9 };
        return result;
    }

    static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d", array[i]);
        }
        System.out.println();
    }

    static void sorting(int[] array) {
        int count = 1;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                count = 1;
                for (int j = 0; j < array.length; j++) {
                    if (i != j) {
                        if (array[i] == array[j]) {
                            count++;
                        }
                    }
                }
                System.out.println("Число " + array[i] + "встречается " + count + "раз");
            } 
            else if (array[i] != array[i - 1]) {
                count = 1;
                for (int j = 0; j < array.length; j++) {
                    if (i != j) {
                        if (array[i] == array[j]) {
                            count++;
                        }
                    }
                }
                System.out.println("Число " + array[i] + "встречается " + count + "раз");
            }
        }
    }
}