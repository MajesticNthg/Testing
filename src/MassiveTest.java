import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;


import static org.junit.Assert.*;

public class MassiveTest {

    @Test
    public void randomMassive() {
        Massive massive = new Massive();
        int[] resultArray = massive.randomMassive(new int[]{1, 0, 1, 1});

        int[] expectedArray = new int[]{0, 1, 1, 1};
        assertTrue(java.util.Arrays.equals(resultArray, expectedArray)); // тест на правильную сортировку (конечный результат)

        for (int x = 0; x < resultArray.length; x++)
            assertFalse(resultArray[x] > 10); // значения элементов массива не должны быть больше 10

        boolean actual = resultArray.length > 0;
        assertTrue(actual); //  размер массива не должен быть нулевым

        boolean palindrome = true;
        for (int z = 0, y = resultArray.length - 1; z < resultArray.length / 2; z++, y--) {
            if (resultArray[z] != resultArray[y])
                palindrome = false;

        }
            assertFalse(palindrome); // массив не должен представлять из себя палиндром

    }
}

