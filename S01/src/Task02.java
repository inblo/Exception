/*Задание №2
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
ошибке.*/
public class Task02 {
    public static void main(String[] args) {
        int [][] matrix = {{1,0,1},{1,1,1},{0,1,0}};
        int sum = summElement(matrix);
        System.out.println(sum );
    }
    public static int summElement(int [][] matrix) {
        int n = matrix.length;
        for (int[] row : matrix) {
            if (row.length != n) {
                throw new RuntimeException("Колличество строк не равно колличеству столбцов!");
            }
        }
        for (int[] row : matrix) {
            for (int element : row) {
                if (element != 0 && element != 1) {
                    throw new RuntimeException("Массив должен содержать только 0 или 1!");
                }
            }
        }
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }
}
