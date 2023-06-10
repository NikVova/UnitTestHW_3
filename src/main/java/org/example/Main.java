package org.example;
import org.junit.Test;
import static org.junit.Assert.*;


public class Main {
//2) Нужно покрыть тестами метод на 100%
//Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false)
//
//public boolean evenOddNumber(int n) {
//if (n % 2 == 0) {
//return true;
//} else {
//return false;
//}


    public static class EvenOddNumberTest {
        @Test
        public void testEvenNumber() {
            EvenOddNumber en = new EvenOddNumber();
            boolean result = en.evenOddNumber(10);
            assertTrue(result);
        }

        @Test
        public <EvenOddNumber> void testOddNumber() {
            EvenOddNumber en = new EvenOddNumber();
            boolean result = en.evenOddNumber(7);
            assertFalse(result);
        }
    }
//3) Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) возвращает true,
// если попадает и false - если нет, покрыть тестами метод на 100%
//
//public boolean numberInInterval(int n) { … }



    public static class NumberInIntervalTest {
        @Test
        public void testNumberInInterval() {
            NumberInInterval ni = new NumberInInterval();
            boolean result = ni.numberInInterval(50);
            assertTrue(result);
        }

        @Test
        public void testNumberBelowInterval() {
            NumberInInterval ni = new NumberInInterval();
            boolean result = ni.numberInInterval(10);
            assertFalse(result);
        }

        @Test
        public void testNumberAboveInterval() {
            NumberInInterval ni = new NumberInInterval();
            boolean result = ni.numberInInterval(200);
            assertFalse(result);
        }
    }


}