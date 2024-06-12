import java.util.Arrays;
/*Задание №7 (доп)
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива и
возвращающий новый массив, каждый элемент которого равен сумме элементов двух
входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя*/
public class Task07 {
    public static void main(String[] args) throws IllegalAccessException {
        int [] arr1 = {1,2};
        int [] arr2 = {4,5, 6};
       try{
           int [] result = sumArrays(arr1, arr2);
           System.out.println(Arrays.toString(result));
       }
       catch (IllegalAccessException e){
           System.out.println(e.getMessage());
       }
    }
    public static int[] sumArrays(int []arr1, int []arr2) throws IllegalAccessException {
        if(arr1.length != arr2.length){
            throw new IllegalAccessException("Массивы имеют разную длинну!");
        }
        int[]result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i]+arr2[i];
        }
        return result;

    }
}
