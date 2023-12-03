import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;


import static org.junit.Assert.*;

public class MassiveTest {

    @Test
    public void randomMassive() {
        Massive massive = new Massive();
        int[] resultArray = massive.randomMassive(new int[]{2, 4, 8, 1});

        int[] expectedArray = new int[]{1, 2, 4, 8};
        assertTrue("Массивы не равны", java.util.Arrays.equals(resultArray, expectedArray)); // тест на правильную сортировку (конечный результат)

        for (int x = 0; x < resultArray.length; x++)
            assertFalse("Элемент массива больше 10", resultArray[x] > 10); // значения элементов массива не должны быть больше 10

        boolean actual = resultArray.length > 0;
        assertTrue(actual); //  размер массива не должен быть нулевым

        for (int z = 0, y = resultArray.length - 1; z < resultArray.length / 2; z++, y--) {
            boolean palindrome;
            if (resultArray[z] == resultArray[y]) {
                palindrome = true;
            } else {
                palindrome = false;
            }
            assertFalse(palindrome); // массив не должен представлять из себя палиндром
        }
    }
}

