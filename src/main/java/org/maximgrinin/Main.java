package org.maximgrinin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Level1:
        // Считывается 2 числа, произвести все арифметические операции с ними
        // (поделить, умножить, сложить, вычесть)
        calcNumbers();
    }

    public static void calcNumbers() {
        int inputValue1 = getNumber();
        int inputValue2 = getNumber();

        printResult(inputValue1, inputValue2);
    }

    /**
     * Считывает целое число из консоли.
     *
     * @return Введенное число.
     */
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputValue = scanner.nextInt();
        return inputValue;
    }

    /**
     * Суммирует два числа.
     *
     * @param firstValue Первое слогаемое
     * @param secondValue Второе слогаемое
     * @return Сумма.
     */
    public static int calcSum (int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    /**
     * Вычитает из первого числа второе.
     *
     * @param firstValue Уменьшаемое
     * @param secondValue Вычитаемое
     * @return Разность.
     */
    public static int calcDiff (int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    /**
     * Умножает первое число на второе.
     *
     * @param firstValue Множитель
     * @param secondValue Множитель
     * @return Произведение.
     */
    public static int calcMult (int firstValue, int secondValue) {
        return firstValue * secondValue;
    }

    /**
     * Делит первое число на второе.
     *
     * @param firstValue Делимое
     * @param secondValue Делитель
     * @return Частное.
     */
    public static double calcDiv (int firstValue, int secondValue) {
        return (double) firstValue / secondValue;
    }

    /**
     * Выводит на экран основные арифметические операции с двумя числами.
     *
     * @param firstValue первое число (слагаемое, уменьшаемое, множитель, делимое)
     * @param secondValue второе число (слагаемое, вычитаемое, множитель, делитель)
     */
    public static void printResult(int firstValue, int secondValue) {
        System.out.printf("%,d + %,d = %,d\n", firstValue, secondValue, calcSum(firstValue, secondValue));
        System.out.printf("%,d - %,d = %,d\n", firstValue, secondValue, calcDiff(firstValue, secondValue));
        System.out.printf("%,d * %,d = %,d\n", firstValue, secondValue, calcMult(firstValue, secondValue));
        System.out.printf("%,d / %,d = %,.2f\n", firstValue, secondValue, calcDiv(firstValue, secondValue));
    }
}
