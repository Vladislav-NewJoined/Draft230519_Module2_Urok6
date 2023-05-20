import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//  Задание и видеоурок здесь: https://lms.synergy.ru/student/updiscipline/4474947/1045153/1/1
//  Название урока: Урок 6. Ключевое слово final
public class Draft1_Task2_6_3 {

//        Пример _ ППППППППППППППППППППППППППППППППППП Предыдущий удавшийся пример переделываю под свое задание Пример из интернет:
//        https://overcoder.net/q/353789/%D1%83%D0%B4%D0%B0%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B4%D1%83%D0%B1%D0%BB%D0%B8%D0%BA%D0%B0%D1%82%D0%BE%D0%B2-%D0%B8%D0%B7-%D1%81%D1%82%D1%80%D0%BE%D0%BA%D0%B8-%D0%B2-java
    public static void main(String[] args) throws Exception {
        System.out.println("Задание: \n3.\tИзмените final переменную. Получилось?\n\nРешение: ");

        System.out.println("Переменную final нельзя изменить. Примеры: фрагменты кодов ниже. ");
        final int x = 10;
        final String y = "one";
        System.out.println("Инициализированы переменные x и y: ");
        System.out.println("final int x = 10;");
        System.out.println("final String y = \"one\";");
        System.out.println("Попытка присвоить им другие значения приводит к ошибке.");
        /*x = 20;
        y = "two";*/
    }
}
