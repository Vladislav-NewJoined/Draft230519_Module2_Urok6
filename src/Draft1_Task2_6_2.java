import java.util.InputMismatchException;
import java.util.Scanner;

//  Задание и видеоурок здесь: https://lms.synergy.ru/student/updiscipline/4474947/1045153/1/1
//  Название урока: Урок 6. Ключевое слово final
public class Draft1_Task2_6_2 {

//        Пример _ ППППППППППППППППППППППППППППППППППП сделано на основании из видеоурока мин. 06.20
    public static void main(String[] args) throws Exception {
        System.out.println("Задание: \n2.\tНайдите наибольшее число из трех, используя только final-переменные.\n\nРешение: ");
        Scanner scanner = new Scanner (System.in);
        //  Задаем три переменные
        /*int a = 3;
        int b = 8;
        int c = 5;*/

        try {


            /*final int[] a = new int[3];*/
            System.out.print("Enter integer a: ");
            final int a = scanner.nextInt();
            System.out.print("Enter integer b: ");
            final int b = scanner.nextInt();
            System.out.print("Enter integer c: ");
            final int c = scanner.nextInt();
            System.out.println();

            /*int max;*/
            if (a == b || a == c || b == c) {
                System.out.println("Input is incorrect");
                System.exit(0);
            }
            if (a > b && a > c) {
                System.out.println("The maximal number is a, i.e.: " + a);
            } else if (b > c) {
                System.out.println("The maximal number is b, i.e.: " + b);
            } else {
                System.out.println("The maximal number is c, i.e.: " + c);
            }
        } catch (InputMismatchException ex) {
            System.out.println("Input is incorrect");
        }

        /*for (int i = 0; i < 3; i++)*/








//        System.out.println("Enter array's size:");
//        Scanner scanner = new Scanner(System.in);
//        final int size = scanner.nextInt();
//        int[] a = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            System.out.print("a[i]: ");
//            a[i] = scanner.nextInt();
//        }
//
//        int max = a[0];
//        for (int i = 1; i < size; i++) {
//            if (a[i] > max) {
//                max = a[i];
//            }
//        }
        /*System.out.println("Max is " + max);*/
    }
//        Конец Примера _ ККККККККККККККК









//
////        Пример 1 ППППППППППППППППППППППППППППППППППП сделано на основе видеоурока мин. 06.20
//    public static void main(String[] args) throws Exception {
//        System.out.println("Задание: \n2.\tНайдите наибольшее число из трех, используя только final-переменные.\n\nРешение: ");
//
//        System.out.println("Enter array's size:");
//        Scanner scanner = new Scanner(System.in);
//        final int size = scanner.nextInt();
//        int[] a = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            System.out.print("a[i]: ");
//            a[i] = scanner.nextInt();
//        }
//
//        int max = a[0];
//        for (int i = 1; i < size; i++) {
//            if (a[i] > max) {
//                max = a[i];
//            }
//        }
//        System.out.println("Max is " + max);
//    }
////        Конец Примера 1 ККККККККККККККК
















}
