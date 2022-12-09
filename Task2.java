import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Пусть дан список сотрудников:Иван Иванов 
// ( и остальные, полный текст дз будет на платформе)
// Написать программу, которая найдет и выведет повторяющиеся имена с
// количеством повторений. Отсортировать по убыванию популярности.

public class Task2 {
   public static void main(String[] args) {
    Map<String, String> list = new HashMap<>();
    list.put("Петров", "Василий");
    list.put("Иванов", "Иван");
    list.put("Копейкина", "Маргарита");
    list.put("Кучкин", "Иван");
    list.put("Уткин", "Василий");
    list.put("Лясов", "Иван");
    list.put("Редькина", "Анастасия");
    list.put("Кучеров", "Василий");
    list.put("Жучкина", "Маргарита");
    for(var el: list.entrySet()){
        System.out.print(el.getKey() +" : "+ el.getValue() + "\n");
    }

    Map<String, Integer> res = new HashMap<>();

    for(var elem: list.entrySet()){
        String name = elem.getValue();
        int count = 0;
        for (var element : list.entrySet()) {
            if (element.getValue().equals(name)) {
                count += 1;
            }
        }
        if (count > 1) {
            res.put(name, count);
        }
    }

    System.out.println();
    for(var el: res.entrySet()){
        System.out.print(el.getKey() +" : "+ el.getValue() + "\n");
    }

    List<Map.Entry<String, Integer>> result = res.entrySet().stream()
        .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
        .collect(Collectors.toList());
        System.out.println();
        for (var el : result) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }

   }
}
