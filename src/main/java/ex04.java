import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : ch) {
            if (map.containsKey(c)) {
                map.put(c, (map.get(c) + 1));
            } else { map.put(c, 1); }
        }
        // сортировка по Key., по алфавиту
        // вывод графика
            // масштабировать Value/10
        System.out.println(map);


    }
}
