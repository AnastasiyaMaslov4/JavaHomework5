import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, 
 * учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Task1 {

    public static void main(String[] args) {
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        Map<Integer, String> list = new HashMap<>();
        for(int i=0; i<5; i++){
            System.out.print("Введите номер телефона и Фамилию через пробел: ");
            String[] input = iScanner.nextLine().split(" ");
            list.put(Integer.parseInt(input[0]) , input[1]);
        }
        for(var el: list.entrySet()){
            System.out.print(el.getKey() +" : "+ el.getValue() + "\n");
        }
        System.out.print("Введите фамилию для поиска телефона: ");
        String fam = iScanner.next();
        iScanner.close();
        if (list.containsValue(fam)) {
            for(var el: list.entrySet()){
                if (el.getValue().equals(fam)) System.out.println(el.getKey() +" : "+ el.getValue() + "\n");
            }
        }
        else System.out.println("Такой фамилии нет.");
    }
    
}