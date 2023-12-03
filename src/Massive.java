import java.sql.SQLOutput;
import java.util.Random;
public class Massive {
    public static int[] randomMassive(int[] list1) {
        boolean xchange = true;
        int x;

        while (xchange) {
            xchange = false; // предполагаем, что массив уже отсортирован

            for (int i = 0; i < list1.length - 1; i++)
                if (list1[i] > list1[i + 1]) {
                    // нашли элементы,
                    // неупорядоченные по возрастанию:
                    // меняем их местами:
                    x = list1[i];
                    list1[i] = list1[i + 1];
                    list1[i + 1] = x;

                    // цикл проверки массива надо продожить снова:
                    xchange = true;
                }
        }
        return list1;
    }


    public static void main(String[] args) {

        int [] list1 = new int[] { 2 , 4, 8, 1 };

        System.out.println(randomMassive(list1));
    }
}
