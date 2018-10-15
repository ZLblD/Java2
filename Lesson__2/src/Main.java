
import java.util.Arrays;

/**
 * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
 * при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * <p>
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось
 * (например, в ячейке лежит символ или текст вместо числа),
 * должно быть брошено исключение MyArrayDataException,
 * с детализацией в какой именно ячейке лежат неверные данные.
 * <p>
 * 3. В методе main() вызвать полученный метод,
 * обработать возможные исключения MySizeArrayException и MyArrayDataException,
 * и вывести результат расчета.
 */


public class Main {
    static int sum = 0;

    public static void main(String[] args) {

        String[][] mass = new String[4][5];
        int count = 0;

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                mass[i][j] = Integer.toString(count);
                count++;
            }
        }

        mass[1][4] = "a";
        mass[3][2] = "b";

        try{
            arrSize(mass);
        } catch (MyArraySizeException e){
            System.out.println("Ошибка размерности");
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                try{
                    arrSum(mass, i, j);
                } catch (MyArrayDataException e){
                    System.out.println("Ошибка ввода данных в ячейке " + e.i + " " + e.j);
                }
            }
        }
        System.out.println("Сумма чисел в массиве " + sum);

    }

    static void arrSum(String[][] mass, int i, int j) throws MyArrayDataException {
        try {
            sum += Integer.parseInt(mass[i][j]);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(i,j);
        }
    }

    static void arrSize(String[][] mass) throws MyArraySizeException {
        try{
            if(mass.length !=4){
                throw new MyArraySizeException(mass.length, mass[0].length);
            }
        } catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }

        for (String[] strings : mass) {
            if(strings.length !=4){
                throw new MyArraySizeException(mass.length, strings.length);
            }
        }
    }
}




