import java.util.Arrays;

/**Тапшырма-4
 * Создайте массив из слов, чтоб были палиндром слова.
 * 1. Напишите метод для поиска самой длинной строки в массиве.
 * 2. Напишите метод, который проверяет является ли слово палиндромом(зеркальные слова).
 * 3. Напишите метод, заменяющий в тексте все вхождения слова «   » на «        ».
 * 4. Имеются две строки. Напишите метод, возвращающий количество вхождений одной строки в другую.*/
public class Word {
    String[] polindrom;

    public Word(String[] polindrom) {
        this.polindrom = polindrom;
    }

    public void setPolindrom(String[] polindrom) {
        this.polindrom = polindrom;
    }

    public String[] getPolindrom() {
        int max = 0;
        for (int i = 0; i < polindrom.length; i++) {
            if (polindrom[i].length() > max) {
                max = polindrom[i].length();
            }
        }
        for (int i = 0; i < polindrom.length; i++) {
            if (polindrom[i].length() == max) {
                System.out.print(polindrom[i] + " ");
            }
        }
        System.out.println("-это длинные слова из массива ");
        return polindrom;
    }
    public String[] newArray(String []polindromArray) {
        for (int i = 0; i < polindromArray.length; i++) {
            polindromArray[i] = polindromArray[i].replaceAll(polindromArray[i], "words");
        }
        return  polindromArray;
    }

    public String [] getAllArray() {
        String[] array1 = new String[]{"one", "two", "three"};
        String[] array2 = new String[]{"four", "five", "six"};
        String[] array3 = new String[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[index] = array3[index] + array1[i];
            index += 1;
        }
        for (int i = 0; i < array2.length; i++) {
            array3[index] = array3[index] + array2[i];
            index += 1;
        }
        return array3;
        }

     public boolean isPolyndrome(String [] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0)==array[i].charAt(array.length - 1)) {
               array[i]=array[i].substring(1, array[i].length() - 1);
               // return true;
            }
//            if (array[i].length() == 1 || array[i].length() == 0) {
//                return true;
//            }
        }
        return false;
    }
}

