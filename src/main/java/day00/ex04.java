package day00;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        Integer[] count = new Integer[ch.length];
    for (int i = 0; i < ch.length; i++) {
        for (int j = 1; j < ch.length; j++) {
            if (ch[i] == ch[j]) {

            }
        }
    }

    }
}

    /*    Map<Character, Integer> map = new HashMap<>();

        for (Character c : ch) {
            if (map.containsKey(c)) {
                map.put(c, (map.get(c) + 1));
            } else { map.put(c, 1); }
        }

        map.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
        // сортировка
        // вывод графика
            // масштабировать Value/10



    }
}*/
