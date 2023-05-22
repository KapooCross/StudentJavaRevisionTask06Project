package by.itstep.javatraining.revision.task;

/*	Task 06. The Count of Min Number Digits [количество наименьших цифр числа]
 *
 *	Дано целое число. Необходимо определить, какое количество цифр
 *	заданного числа равны его наименьшей цифре с использованием эффективного алгоритма.
 *
 *	Примечание
 *	Постарайтесь при решении задания использовать только одну циклическую конструкцию.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено число, которое является решение задачи.
 *
 *	[ input 1]: 1234
 *	[output 1]: 1
 *
 *	[ input 2]: 4112
 *	[output 2]: 2
 *
 *	[ input 3]: 100
 *	[output 3]: 2
 *
 *	[ input 4]: -2222
 *	[output 4]: 4
 */

public class Task06 {
    public static int task06(long number) {

//        System.out.println("retyhju");
//
//        number = 647657783;
//
//        char[] ch = Long.toString(Math.abs(number)).toCharArray();
//        int var = 1;
//        int count = 0;
//
//        for (int i = 0; i < ch.length; i++) {
//            if (ch[i] == var) {
//                count++;
//            }
//            if (i == ch.length - 1) {
//                i = 0;
//                var++;
//            }
//        }
//        System.out.println(var);
        if (number == 0) {
            return 1;
        }

        number = Math.abs(number);

        int count = 0;
        long digit = 10;

        while (number > 0) {
            long num = number % 10;
            if (num == digit) {
                count++;
            }
            if (num < digit) {
                digit = num;
                count = 1;
            }
            number /= 10;
        }
        return count;
    }
}
