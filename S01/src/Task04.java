import java.util.ArrayList;
import java.util.List;

/*Задание №4
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
“подсветить”*/
public class Task04 {
    public static void main(String[] args) {
        Integer[] arr = {1, null, 2, null};
        List<Integer> nullElements = checkArray(arr);
        if (nullElements.size() > 0) {
            System.out.println("Массив содержит пустые элементы на позициях" + nullElements);
        } else {
            System.out.println("Массив не содержит пустых элементов!");
        }
    }
    public static List<Integer>  checkArray(Integer[] arr){
        List<Integer> nullElements = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                nullElements.add(i);
            }
            }
        return nullElements;
        }

    }
