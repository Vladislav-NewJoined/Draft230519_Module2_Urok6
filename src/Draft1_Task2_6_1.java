import java.util.Scanner;

//  Задание и видеоурок здесь: https://lms.synergy.ru/student/updiscipline/4474947/1045153/1/1
//  Название урока: Урок 6. Ключевое слово final
public class Draft1_Task2_6_1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Задание: \n1.\tСоздайте final массив чисел. Увеличьте каждый его элемент вдвое.\n\nРешение: ");
        Scanner scanner = new Scanner(System.in);

        final int size = 5;
        final int[] a = new int[size];

        System.out.println("Enter five array's element, as integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Multiply the elements in the array by two:");
        for (int i = 0; i < size; i++) {
            /*a[i] = a[i]*2;*/
            System.out.print("The variable a[" + i + "] has become: " + (a[i]*2) + "\n");

        }
        System.out.println("\nВывод: Программа позволила изменить элементы внутри массива final, однако программа не позволит " +
                "\nперезаписать содержимое массива a, под другим названием. Программа не позволит изменить " +
                "\nразмер массива 'size', поскольку он тоже объявлен, как final");
    }
}
