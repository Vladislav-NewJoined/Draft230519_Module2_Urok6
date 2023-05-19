import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

//  Задание и видеоурок здесь: https://lms.synergy.ru/student/updiscipline/4474947/1045153/1/1
//  Название урока: Урок 6. Ключевое слово final
public class Draft1_Task2_6_4 {

//        Пример _ ППППППППППППППППППППППППППППППППППП Предыдущий удавшийся пример переделываю под свое задание Пример из интернет:
//        https://overcoder.net/q/353789/%D1%83%D0%B4%D0%B0%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B4%D1%83%D0%B1%D0%BB%D0%B8%D0%BA%D0%B0%D1%82%D0%BE%D0%B2-%D0%B8%D0%B7-%D1%81%D1%82%D1%80%D0%BE%D0%BA%D0%B8-%D0%B2-java
    public static void main(String[] args) throws Exception {
        System.out.println("Задание: \n4.\tПользователь вводит слово, подсчитайте количество уникальных букв " +
        "\nв этом слове. (Повторяющиеся считаем за одну, в слове окно - три уникальные буквы, окн). Используйте " +
        "\nтолько final-переменные. Подсказка: используйте массив.\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово на кириллице, пример 'абракадабра': ");
        String word = scanner.nextLine();


        /*//  Объявляем и заполняем массив из букв слова
        final String[] letters = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = String.valueOf(word.charAt(i));
        }
        System.out.println(Arrays.toString(letters));*/

        /*//  Объявляем массив из уникальных букв
        List<String> unique_Letters = new ArrayList<>();*/


        //  Далее из примера из интернета: Прогоняем через массив для удаления дубликатов
        //  Прогоняем через массив для удаления дубликатов
        /*String word = "aabbccdefatafaz";*/

        final char[] chars = word.toCharArray();
        final Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        final StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.print("Уникальные буквы: " + sb.toString() + "\n");
        System.out.print("Количество уникальных букв: " + sb.length() + "\n");



    }
//        Конец Примера _ ККККККККККККККК







////        Пример 8 ППППППППППППППППППППППППППППППППППП УДАЛСЯ ДО ЭТОГО ЭТАПА !!!!!!!!!!!!!!!!!! Пример из интернет:
////        https://overcoder.net/q/353789/%D1%83%D0%B4%D0%B0%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B4%D1%83%D0%B1%D0%BB%D0%B8%D0%BA%D0%B0%D1%82%D0%BE%D0%B2-%D0%B8%D0%B7-%D1%81%D1%82%D1%80%D0%BE%D0%BA%D0%B8-%D0%B2-java
//    public static void main(String[] args) throws Exception {
//        System.out.println("Задание: \n4.\tПользователь вводит слово, подсчитайте количество уникальных букв " +
//        "\nв этом слове. (Повторяющиеся считаем за одну, в слове окно - три уникальные буквы, окн). Используйте " +
//        "\nтолько final-переменные. Подсказка: используйте массив.\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите слово на кириллице, пример 'панама': ");
//        String word = scanner.nextLine();
//
//
//        //  Объявляем и заполняем массив из букв слова
//        final String[] letters = new String[word.length()];
//        for (int i = 0; i < word.length(); i++) {
//            letters[i] = String.valueOf(word.charAt(i));
//        }
//        System.out.println(Arrays.toString(letters));
//
//        //  Объявляем массив из уникальных букв
//        List<String> unique_Letters = new ArrayList<>();
//
//
//        //  Далее из примера из интернета: Прогоняем через массив для удаления дубликатов
//        String string = "aabbccdefatafaz";
//
//        final char[] chars = string.toCharArray();
//        final Set<Character> charSet = new LinkedHashSet<Character>();
//        for (char c : chars) {
//            charSet.add(c);
//        }
//
//        final StringBuilder sb = new StringBuilder();
//        for (Character character : charSet) {
//            sb.append(character);
//        }
//        System.out.println(sb.toString());
//        System.out.println(sb.length());
//
//
//
//    }
////        Конец Примера 8 ККККККККККККККК








////        Пример 7 ППППППППППППППППППППППППППППППППППП Предыдущий пример подгоняю под String Пример из интернет:
////        https://translated.turbopages.org/proxy_u/en-ru.ru.027e866b-64676e88-0454d3a0-74722d776562/https/stackoverflow.com/questions/17967114/how-to-efficiently-remove-duplicates-from-an-array-without-using-set
//    public static void main(String[] args) throws Exception {
//        System.out.println("Задание: \n4.\tПользователь вводит слово, подсчитайте количество уникальных букв " +
//        "\nв этом слове. (Повторяющиеся считаем за одну, в слове окно - три уникальные буквы, окн). Используйте " +
//        "\nтолько final-переменные. Подсказка: используйте массив.\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите слово на кириллице, пример 'панама': ");
//        String word = scanner.nextLine();
//
//
//        //  Объявляем и заполняем массив из букв слова
//        final String[] letters = new String[word.length()];
//        for (int i = 0; i < word.length(); i++) {
//            letters[i] = String.valueOf(word.charAt(i));
//        }
//        System.out.println(Arrays.toString(letters));
//
//        //  Объявляем массив из уникальных букв
//        List<String> unique_Letters = new ArrayList<>();
//
//
//        //  Далее из примера из интернет: Прогоняем через массив для удаления дубликатов
//        final String[] original = new String[]{"п", "а", "н", "а", "м", "а"};
//        System.out.println("Массив original: " + Arrays.toString(original));
//        final int[] buckets = new int[1001];
//        for (final String i : original) {
//            System.out.println(i);
//            /*buckets[i]++;*/
//        }
//        final String[] unique = new String[original.length];
//        int count = 0;
//        for (int i = 0; i < buckets.length; ++i) {
//            if (buckets[i] > 0) {
//                unique[count++] = String.valueOf(i);
//            }
//        }
//        final String[] compressed = new String[count];
//        System.arraycopy(unique, 0, compressed, 0, count);
//        System.out.println(Arrays.toString(compressed));
//
//
//
//
//        /*// если foreach
//        int[] A = { 0, 1, 2, 3, 4 };
//        for (int i: A) {
//            System.out.println(i);
//        }*/
//
//
//
//        final String[] original2 = new String[]{"п", "а", "н", "а", "м", "а"};
//        for (String i: original2) {
//            System.out.println(i);
//        }
//
//        /*//  или как по старому fpr
//        System.out.println();
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }*/
//
//
//
//
//    }
////        Конец Примера 7 ККККККККККККККК








////        Пример 6 ППППППППППППППППППППППППППППППППППП УДАЛСЯ ДО ЭТОГО ЭТАПА !!!!!!!!!!!!!!!!!! Пример из интернет:
////        https://translated.turbopages.org/proxy_u/en-ru.ru.027e866b-64676e88-0454d3a0-74722d776562/https/stackoverflow.com/questions/17967114/how-to-efficiently-remove-duplicates-from-an-array-without-using-set
//    public static void main(String[] args) throws Exception {
//        System.out.println("Задание: \n4.\tПользователь вводит слово, подсчитайте количество уникальных букв " +
//        "\nв этом слове. (Повторяющиеся считаем за одну, в слове окно - три уникальные буквы, окн). Используйте " +
//        "\nтолько final-переменные. Подсказка: используйте массив.\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите слово на кириллице, пример 'панама': ");
//        String word = scanner.nextLine();
//
//
//        //  Объявляем и заполняем массив из букв слова
//        final String[] letters = new String[word.length()];
//        for (int i = 0; i < word.length(); i++) {
//            letters[i] = String.valueOf(word.charAt(i));
//        }
//        System.out.println(Arrays.toString(letters));
//
//        //  Объявляем массив из уникальных букв
//        List<String> unique_Letters = new ArrayList<>();
//
//
//        //  Далее из примера из интернет: Прогоняем через массив для удаления дубликатов
//        final int[] original = new int[]{1, 1, 2, 8, 9, 8, 4, 7, 4, 9, 1, 1000, 1000};
//        System.out.println(Arrays.toString(original));
//        final int[] buckets = new int[1001];
//        for (final int i : original) {
//            System.out.println("i = :" + i); // todo в оригинале не было
//            buckets[i]++;
//            System.out.println("buckets[i] = :" + buckets[i]); // todo в оригинале не было
//        }
//        final int[] unique = new int[original.length];
//        int count = 0;
//        for (int i = 0; i < buckets.length; ++i) {
//            if (buckets[i] > 0) {
//                unique[count++] = i;
//            }
//        }
//        final int[] compressed = new int[count];
//        System.arraycopy(unique, 0, compressed, 0, count);
//        System.out.println(Arrays.toString(compressed));
//
//
//
//
//    }
////        Конец Примера 6 ККККККККККККККК








////        Пример 5 ППППППППППППППППППППППППППППППППППП УДАЛСЯ ДО ЭТОГО ЭТАПА !!!!!!!!!!!!!!!!!! Пример из интернет:
////        https://codippa.com/how-to-remove-duplicate-characters-from-string-in-java/
//    public static void main(String[] args) {
//        System.out.println("Задание: \n4.\tПользователь вводит слово, подсчитайте количество уникальных букв " +
//        "\nв этом слове. (Повторяющиеся считаем за одну, в слове окно - три уникальные буквы, окн). Используйте " +
//        "\nтолько final-переменные. Подсказка: используйте массив.\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите слово на кириллице, пример 'панама': ");
//        String word = scanner.nextLine();
//
//
//        //  Объявляем и заполняем массив из букв слова
//        String[] letters = new String[word.length()];
//        for (int i = 0; i < word.length(); i++) {
//            letters[i] = String.valueOf(word.charAt(i));
//        }
//        System.out.println(Arrays.toString(letters));
//
//        //  Объявляем массив из уникальных букв
//        List<String> unique_Letters = new ArrayList<>();
//
//
//        //  Далее из примера из интернет: Прогоняем через массив для удаления дубликатов
//                char[] characters = word.toCharArray();
//                int length = characters.length;
//                System.out.println("Строка с возможными дубликатами букв: " + word);
//                for (int i = 0; i < length; i++) {
//                    for (int j = i + 1; j < length; j++) {
//                        if (characters[i] == characters[j]) {
//                            int duplicate_Element_Index = j;//set duplicate element index
//                            //delete the duplicate element by shifting the elements to left
//                            for (int k = duplicate_Element_Index; k < length - 1; k++) {
//                                characters[k] = characters[k + 1];
//                            }
//                            j--;
//                            length--;//reduce char array length
//                        }
//                    }
//                }
//                String stringWithOutDuplicates = new String(characters);
//                stringWithOutDuplicates = stringWithOutDuplicates.substring(0, length);
//                System.out.println("Уникальные буквы следующие: " + stringWithOutDuplicates);
//                System.out.println("Количество уникальных букв: " + stringWithOutDuplicates.length());
//
//
//    }
////        Конец Примера 5 ККККККККККККККК








////        Пример 4 ППППППППППППППППППППППППППППППППППП Пример из интернет: Работает (второй for, но выводит не в том порядке), но удаляет первый тоже
////        https://ru.stackoverflow.com/questions/1359329/%D0%9F%D0%BE%D0%BB%D1%83%D1%87%D0%B8%D1%82%D1%8C-%D0%B8%D0%B7-%D1%81%D1%82%D1%80%D0%BE%D0%BA%D0%B8-%D1%82%D0%BE%D0%BB%D1%8C%D0%BA%D0%BE-%D1%83%D0%BD%D0%B8%D0%BA%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5-%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82%D1%8B
//    public static void main(String[] args) {
//        System.out.println("Задание: \n4.\tПользователь вводит слово, подсчитайте количество уникальных букв " +
//        "\nв этом слове. (Повторяющиеся считаем за одну, в слове окно - три уникальные буквы, окн). Используйте " +
//        "\nтолько final-переменные. Подсказка: используйте массив.\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите слово на кириллице с маленькой буквы, пример 'панама': ");
//        String word = scanner.nextLine();
//
//
//        //  Создаём массив из букв слова
//        String[] letters = new String[word.length()];
//        for (int i = 0; i < word.length(); i++) {
//            letters[i] = String.valueOf(word.charAt(i));
//        }
//        System.out.println(Arrays.toString(letters));
//
//        //  Создаём массив из уникальных букв
//        List<String> unique_Letters = new ArrayList<>();
//
//        //  Далее прогоняем через массив
//        for (int i = 0; i < letters.length; i++) {
//            String currentLetter = letters[i];
//            int flag = 1;
//            for (int j = 0; j < letters.length; j++) {
//                if ((i!=j) && (letters[j].equals(currentLetter))){
//                    flag = 0;
//                    break;
//                }
//            }
//            if (flag==1) {
//                unique_Letters.add(currentLetter);
//            }
//        }
//        System.out.println(unique_Letters);
//
//
//
//
//
//
//////        // Просто для интереса 'склеиваем' строковые элементы массива в одну строку
//////        String str = letters[0];
//////        for (int i = 1; i < letters.length; i++) {
//////            str = str + letters[i];
//////        }
//////        System.out.println(str);
////
////        //  Сравниваем буквы и заполняем счётчик
////        //  Инициализируем массив из уникальных букв
////        List<String> unique_Letters = new ArrayList<>();
////
////        //  Инициализируем счётчик
////        for (int i = 0; i < letters.length; i++) {
////            String currentLetter = String.valueOf(word.charAt(i));
////            unique_Letters.add(currentLetter);
////
////
////
////            for (int num = 0; num <= i-1; num++) {
////                if (currentLetter.equals(String.valueOf(word.charAt(num)))) {
////                    /*counter = i;*/
////
////                    break;
////                }
////                break;
////            }
////            System.out.println(unique_Letters);
////        }
////
////
//////        for (int i = 0; i < letters.length; i++) {
//////            counter = counter + 1;
//////            String currentLetter = String.valueOf(word.charAt(i));
//////            for (int num = i + 1; num < word.length(); num++) {
//////                if (currentLetter.equals(String.valueOf(word.charAt(num)))) {
//////                    /*counter = i;*/
//////                    break;
//////                }
//////            }
//////        }
//
//
//
//
//    }
////        Конец Примера 4 ККККККККККККККК








////        Пример 3 ППППППППППППППППППППППППППППППППППП Пример из интернет:
////        https://ru.stackoverflow.com/questions/109622/%D0%A3%D0%B4%D0%B0%D0%BB%D0%B8%D1%82%D1%8C-%D0%B4%D1%83%D0%B1%D0%BB%D0%B8%D0%BA%D0%B0%D1%82%D1%8B-%D0%B2-%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D0%B5-string-%D0%B2-java
//    public static void main(String[] args) {
//        System.out.println("Задание: \n4.\tПользователь вводит слово, подсчитайте количество уникальных букв " +
//        "\nв этом слове. (Повторяющиеся считаем за одну, в слове окно - три уникальные буквы, окн). Используйте " +
//        "\nтолько final-переменные. Подсказка: используйте массив.\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите слово на кириллице с маленькой буквы, пример 'панама': ");
//        String word = scanner.nextLine();
//
//
//        //  Создаём массив из букв слова
//        String[] letters = new String[word.length()];
//        for (int i = 0; i < word.length(); i++) {
//            letters[i] = String.valueOf(word.charAt(i));
//        }
//        System.out.println(Arrays.toString(letters));
//
//        //  Создаём массив из уникальных букв
//        List<String> unique_Letters = new ArrayList<>();
//
//        /*String[] str = {"aa", "bb", "cc", "aa"};*/
//        Set<String> set = new HashSet<String>(Arrays.asList(letters));
//        System.out.println("Печатаем set: " + set);
//        String[] result = set.toArray(new String[set.size()]);
//        System.out.println(Arrays.toString(result));
//        System.out.println(result.length);
//
//
//
////        //  Далее прогоняем через массив
////        for (int i = 0; i < letters.length; i++) {
////            String temp = letters[i];
////            int flag = 1;
////            for (int j = 0; j < letters.length; j++) {
////                if ((i!=j) && (letters[j].equals(temp))){
////                    flag = 0;
////                    break;
////                }
////            }
////            if (flag==1) {
////                unique_Letters.add(temp);
////            }
////        }
////        System.out.println(unique_Letters);
//
//
//////        // Просто для интереса 'склеиваем' строковые элементы массива в одну строку
//////        String str = letters[0];
//////        for (int i = 1; i < letters.length; i++) {
//////            str = str + letters[i];
//////        }
//////        System.out.println(str);
////
////        //  Сравниваем буквы и заполняем счётчик
////        //  Инициализируем массив из уникальных букв
////        List<String> unique_Letters = new ArrayList<>();
////
////        //  Инициализируем счётчик
////        for (int i = 0; i < letters.length; i++) {
////            String currentLetter = String.valueOf(word.charAt(i));
////            unique_Letters.add(currentLetter);
////
////
////
////            for (int num = 0; num <= i-1; num++) {
////                if (currentLetter.equals(String.valueOf(word.charAt(num)))) {
////                    /*counter = i;*/
////
////                    break;
////                }
////                break;
////            }
////            System.out.println(unique_Letters);
////        }
////
////
//////        for (int i = 0; i < letters.length; i++) {
//////            counter = counter + 1;
//////            String currentLetter = String.valueOf(word.charAt(i));
//////            for (int num = i + 1; num < word.length(); num++) {
//////                if (currentLetter.equals(String.valueOf(word.charAt(num)))) {
//////                    /*counter = i;*/
//////                    break;
//////                }
//////            }
//////        }
//
//
//
//
//    }
////        Конец Примера 3 ККККККККККККККК








////        Пример 2 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание: \n4.\tПользователь вводит слово, подсчитайте количество уникальных букв " +
//        "\nв этом слове. (Повторяющиеся считаем за одну, в слове окно - три уникальные буквы, окн). Используйте " +
//        "\nтолько final-переменные. Подсказка: используйте массив.\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите слово на кириллице с маленькой буквы, пример 'панама': ");
//        String word = scanner.nextLine();
//
//
//        //  Создаём массив из букв слова
//        String[] letters = new String[word.length()];
//        for (int i = 0; i < word.length(); i++) {
//            letters[i] = String.valueOf(word.charAt(i));
//        }
//        System.out.println(Arrays.toString(letters));
//
////        // Просто для интереса 'склеиваем' строковые элементы массива в одну строку
////        String str = letters[0];
////        for (int i = 1; i < letters.length; i++) {
////            str = str + letters[i];
////        }
////        System.out.println(str);
//
//        //  Сравниваем буквы и заполняем счётчик
//        //  Инициализируем массив из уникальных букв
//        List<String> unique_Letters = new ArrayList<>();
//
//        //  Инициализируем счётчик
//        for (int i = 0; i < letters.length; i++) {
//            String currentLetter = String.valueOf(word.charAt(i));
//            unique_Letters.add(currentLetter);
//
//
//
//            for (int num = 0; num <= i-1; num++) {
//                if (currentLetter.equals(String.valueOf(word.charAt(num)))) {
//                    /*counter = i;*/
//
//                    break;
//                }
//                break;
//            }
//            System.out.println(unique_Letters);
//        }
//
//
////        for (int i = 0; i < letters.length; i++) {
////            counter = counter + 1;
////            String currentLetter = String.valueOf(word.charAt(i));
////            for (int num = i + 1; num < word.length(); num++) {
////                if (currentLetter.equals(String.valueOf(word.charAt(num)))) {
////                    /*counter = i;*/
////                    break;
////                }
////            }
////        }
//
//
//
//
//    }
////        Конец Примера 2 ККККККККККККККК








////        Пример 1 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание: \n4.\tПользователь вводит слово, подсчитайте количество уникальных букв " +
//        "\nв этом слове. (Повторяющиеся считаем за одну, в слове окно - три уникальные буквы, окн). Используйте " +
//        "\nтолько final-переменные. Подсказка: используйте массив.\n\nРешение: ");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите слово на кириллице с маленькой буквы, пример 'панама': ");
//        String word = scanner.nextLine();
//
//
//        //  Создаём массив из букв слова
//        String[] letters = new String[word.length()];
//        for (int i = 0; i < word.length(); i++) {
//            letters[i] = String.valueOf(word.charAt(i));
//        }
//        System.out.println(Arrays.toString(letters));
//
////        // Просто для интереса 'склеиваем' строковые элементы массива в одну строку
////        String str = letters[0];
////        for (int i = 1; i < letters.length; i++) {
////            str = str + letters[i];
////        }
////        System.out.println(str);
//
//        //  Сравниваем буквы и заполняем счётчик
//        //  Инициализируем массив из уникальных букв
//        List<String> unique_Letters = new ArrayList<>();
//
//        //  Инициализируем счётчик
//        int counter = 0;
//        for (int i = 0; i < letters.length; i++) {
//            counter = counter + 1;
//            String currentLetter = String.valueOf(word.charAt(i));
//            for (int num = i + 1; num < word.length(); num++) {
//                if (currentLetter.equals(String.valueOf(word.charAt(num)))) {
//                    /*counter = i;*/
//                    break;
//                }
//            }
//        }
//
////        //  Сравниваем буквы и заполняем счётчик
////        String currentLetter = String.valueOf(word.charAt(0));
////        for (int i = 0; i < letters.length; i++) {
////            for (int num = 0; num < word.length(); num++) {
////                currentLetter = String.valueOf(word.charAt(i));
////                if (currentLetter.equals(String.valueOf(word.charAt(num+1)))) {
////                    counter = counter + 1;
////                    System.out.println(counter);
////                }
////
////            }
////        }
//
//        System.out.println(counter);
//    }
////        Конец Примера 1 ККККККККККККККК



}
