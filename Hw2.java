import java.util.Random;

public class Hw2 {
    public static void main(String[] args) {

        String str1 = "наворован";
        String str2 = "вор";
        int num1 = 3;
        int num2 = 56;
     
        System.out.println("Проверка вхождения: " + checkIns(str1, str2));
        System.out.println("Проверка строк на вращение друг к другу: " + palindrom(str1, str2));
        System.out.println("Произвольная строка из заданых чисел: " + numString(num1, num2));
        System.out.println("Метод insert и delete: " + delInsSimbol(numString(num1, num2)));
        System.out.println("Метод replace: " + repSimbol(numString(num1, num2)));
     

    }

    //Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
    public static boolean checkIns(String one, String two) {
        if (one.length() > two.length()) {
            return one.contains(two);
        } else return two.contains(one);
    }
    
    //Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
    public static boolean palindrom(String one, String two) {
        StringBuilder tempStr = new StringBuilder(two.toLowerCase()).reverse();
        String newStringReverse = tempStr.toString();
        return one.equalsIgnoreCase(newStringReverse);
    }


    //Получение строки из заданных чисел:
        public static StringBuilder numString(int firstNum, int secondNum) {
       
        StringBuilder finalString = new StringBuilder();
        finalString.append(firstNum);
        String mathSimbol = null;
        int calculation = 0;
        String equally = " = ";
        int randomIndex = new Random().nextInt(3);
        switch (randomIndex) {
            case 0:
                mathSimbol = " + ";
                calculation = firstNum + secondNum;
                break;
            case 1:
                mathSimbol = " - ";
                calculation = firstNum - secondNum;
                break;
            case 2:
                mathSimbol = " * ";
                calculation = firstNum * secondNum;
                break;
        }
        finalString.append(mathSimbol);
        finalString.append(secondNum);
        finalString.append(equally);
        finalString.append(calculation);

        return finalString;
    }

    //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
    public static StringBuilder delInsSimbol(StringBuilder mathString) {
        int index = mathString.indexOf("=");
        mathString.deleteCharAt(index);
        mathString.insert(index, "равно");
        return mathString;
    }

    //*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
    public static StringBuilder repSimbol(StringBuilder mathString) {
        int index = mathString.indexOf("=");
		mathString.replace(index, index + 1, "равно");
        return mathString;
    }
}
