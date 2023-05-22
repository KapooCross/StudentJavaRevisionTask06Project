package by.itstep.javatraining.revision.task;

/*	Task 08. The Number of Fibonacci Number [порядковый номер числа Фибоначчи]
 *
 *	Последовательность Фибоначчи определяется так:
 *	F(1) = 0, F(2) = 1, F(3) = 1, F(4) = 2, F(5) = 3, …, F(n) = F(n−1) + F(n−2).
 *	Дано натуральное число A. Необходимо определить, каким по счету числом Фибоначчи оно является,
 *	т.е. выведите такое число N, что F(N) = A. Если А не является числом Фибоначчи или
 *	данные заданы некорректно, то должно быть возвращено число -1.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должен быть возвращён порядковый номер N-го числа числового ряда Фибоначчи или число -1.
 *
 *	[ input 1]: 0
 *	[output 1]: 1
 *
 *	[ input 2]: 1
 *	[output 2]: 2 или 3 (оба варианта подходят)
 *
 *	[ input 3]: 2
 *	[output 3]: 4
 *
 *	[ input 4]: 55
 *	[output 4]: 11
 *
 *	[ input 5]: 7'778'742'049
 *	[output 5]: 50
 *
 *	[ input 6]: 1'779'979'416'004'714'189
 *	[output 6]: 90
 *
 *	[ input 7]: 0
 *	[output 7]: -1
 *
 *	[ input 8]: 4
 *	[output 8]: -1
 *
 *	[ input 9]: 7
 *	[output 9]: -1
 *
 *	[ input 10]: -144
 *	[output 10]: -1
 */

public class Task08 {
    public static int task08(long number) {

//        System.out.println("werthyjhtgfd");
//
//        if (number < 0) {
//            return -1;
//        }
//
//        int n1 = 0;
//        int n2 = 1;
//        int fib = 0;
//        int count = 3;
//
//        for (int i = 2; i <= number; i++) {
//            fib = n1 + n2;
//            n1 = n2;
//            n2 = fib;
//            count++;
//        }
//
//        if (Task04.task04((int) number) != count && number != 2) {
//            count = -1;
//        }
//
//
//        if (number == 0) {
//            count = 1;
//        }
//
//        if (number == 1) {
//            count = 2;
//        }
//
//        return count;
//    }

//        System.out.println("dsfegrhtjykui");

//

        int a = 1, b = 0, index = 1;

        if (number == 0){
            return 1;
        }

        while (number != b) {
            a = a + b;
            b = a - b;
            index++;
            if (number < b) {
                index = -1;
                break;
            }
        }
//работает долго считает число 1_779_979_416_004_714_189L из теста
      return index;
    }
}

