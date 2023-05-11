import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        Подсчитать количество всех элементов списка/массива и вернуть ассоциативных массив,
        где ключ – элемент списка, значение – количество этих элементов в списке. Порядок не имеет значения.
        Пример: [1, 3, 4, 5, 1, 5, 4] -> {1 : 2, 3 : 1, 4 : 2, 5 : 2}
         */
        var result = elementCount(Arrays.asList(1, 3, 4, 5, 1, 5, 4));
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry);
        }
    }

    public static HashMap<Integer, Integer> elementCount(List<Integer> elements){
        var result = new HashMap<Integer, Integer>();
        for (Integer element : elements) {
            result.put(element, result.getOrDefault(element, 0) + 1);
        }
        return result;
    }
}