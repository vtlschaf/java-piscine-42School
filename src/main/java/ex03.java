import java.util.*;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        String str2;
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        String min;

        for (int i = 1; i <= 18; i++ ) {
            str1 = sc.nextLine();
            if (str1.contains("42")) {
                break;
            } else {
                int digit = Integer.parseInt(str1.replaceAll("\\D+", ""));
                if (i == digit) {
                    str2 = sc.nextLine();
                    list.addAll(Arrays.asList(str2.split(" ")));
                    min = Collections.min(list);
                    list2.add(min);
                    list.clear();
                } else {
                    System.out.println("IllegalArgument");
                    System.exit(-1);
                }
            }
        }
        for (int i = 0 ; i < list2.size() ; i++ ) {
            StringBuilder sb = new StringBuilder();
            sb.append("Week ");
            sb.append(i+1);
            for (int j = 1 ; j <= Integer.parseInt(list2.get(i)); j++ ) {
               sb.append('=');
            }
            sb.append('>');
            System.out.println(sb.toString());
        }
    }
}
