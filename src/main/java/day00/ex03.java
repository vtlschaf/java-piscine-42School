package day00;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int numWeek = 0;
        int min = 2_147_483_647;
        int min1 = 0;
        int min2 = 0;
        int min3 = 0;
        int min4 = 0;
        int min5 = 0;
        int min6 = 0;
        int min7 = 0;
        int min8 = 0;
        int min9 = 0;
        int min10 = 0;
        int min11 = 0;
        int min12 = 0;
        int min13 = 0;
        int min14 = 0;
        int min15 = 0;
        int min16 = 0;
        int min17 = 0;
        int min18 = 0;
        int numWeekNew;

        for (int i = 1; i <= 18; i++) {
            if (sc.hasNextLine() && !sc.hasNextInt()) {
                str = sc.next();
                if (str.equals("Week")) {
                    numWeekNew = sc.nextInt();
                    if (numWeekNew == (numWeek + 1)) {
                        numWeek = numWeekNew;
                    } else {
                        System.out.println("IllegalArgument (Не верная нумерация или последовательность недель)");
                        System.exit(1);
                    }
                } else {
                    System.out.println("IllegalArgument (Неверное наименование недели)");
                    System.exit(2);
                }
            }
            if (sc.hasNextInt()) {
                    num1 = sc.nextInt();
                if (num1 != 42) {
                    num2 = sc.nextInt();
                    num3 = sc.nextInt();
                    num4 = sc.nextInt();
                    num5 = sc.nextInt();
                    if (num1 >= 1 && num1 <= 9
                            && num2 >= 1 && num2 <= 9
                            && num3 >= 1 && num3 <= 9
                            && num4 >= 1 && num4 <= 9
                            && num5 >= 1 && num5 <= 9
                    ) next();
                    else {
                            System.out.println("IllegalArgument (Значение оценки вне диапазона)");
                            System.exit(3);
                    }
                    if (min > num1) min = num1;
                    if (min > num2) min = num2;
                    if (min > num3) min = num3;
                    if (min > num4) min = num4;
                    if (min > num5) min = num5;
                    switch (i) {
                        case 1: min1 = min; break;
                        case 2: min2 = min; break;
                        case 3: min3 = min; break;
                        case 4: min4 = min; break;
                        case 5: min5 = min; break;
                        case 6: min6 = min; break;
                        case 7: min7 = min; break;
                        case 8: min8 = min; break;
                        case 9: min9 = min; break;
                        case 10: min10 = min; break;
                        case 11: min11 = min; break;
                        case 12: min12 = min; break;
                        case 13: min13 = min; break;
                        case 14: min14 = min; break;
                        case 15: min15 = min; break;
                        case 16: min16 = min; break;
                        case 17: min17 = min; break;
                        case 18: min18 = min; break;
                    }
                    min = 10;
                } else {
                    break;
                }
            }
        }
            for (int i = 1; i <= numWeek; i++) {
                switch (i) {
                    case 1: min = min1; break;
                    case 2: min = min2; break;
                    case 3: min = min3; break;
                    case 4: min = min4; break;
                    case 5: min = min5; break;
                    case 6: min = min6; break;
                    case 7: min = min7; break;
                    case 8: min = min8; break;
                    case 9: min = min9; break;
                    case 10: min = min10; break;
                    case 11: min = min11; break;
                    case 12: min = min12; break;
                    case 13: min = min13; break;
                    case 14: min = min14; break;
                    case 15: min = min15; break;
                    case 16: min = min16; break;
                    case 17: min = min17; break;
                    case 18: min = min18; break;
                }
                System.out.print("Week ");
                System.out.print(i);
                System.out.print(' ');
                switch (min) {
                    case 1: System.out.println("=>"); break;
                    case 2: System.out.println("==>"); break;
                    case 3: System.out.println("===>"); break;
                    case 4: System.out.println("====>"); break;
                    case 5: System.out.println("=====>"); break;
                    case 6: System.out.println("======>"); break;
                    case 7: System.out.println("=======>"); break;
                    case 8: System.out.println("========>"); break;
                    case 9: System.out.println("=========>"); break;
                }
            }
    }
    private static void next() {

    }
    public static void charAt() {
        
    }
}

               /*    int digit = Integer.parseInt(str1.replaceAll("\\D+", ""));
                    if (i == digit) {
                        str2 = sc.nextLine();
                        list.addAll(Arrays.asList(str2.split(" ")));
                        min = Collections.min(list);
                        list2.add(min);
                        list.clear();
                    } else {
                        System.out.println("IllegalArgument");
                        System.exit(-1);
                    } */

//        for (int i = 0 ; i < list2.size() ; i++ ) {
//            print(i);
//        }

//    public static void charAt () {
//        for (int i = 0; i < str.length(); i++) {
//            // Классический способ итерации символов строки.
//            System.out.print(str.charAt(i) + " ");
//    }
//    public static void print (int i) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Week ");
//        sb.append(i+1);
//        for (int j = 1 ; j <= Integer.parseInt(list2.get(i)); j++ ) {
//            sb.append('=');
//        }
//        sb.append('>');
//        System.out.println(sb.toString());
//    }
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        String str2;
        List<String> list = new ArrayList<>();  //
        List<String> list2 = new ArrayList<>(); //
        String min;
        for (int i = 1; i <= 18; i++ ) {
            str1 = sc.nextLine();
            str1.equals();
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
    }*/

