
/**
 * 149
 *  Ошибка возникает изза этого result.length * 2 (если длина 0 *2 = 0)((150 урок объяснение)
 *
 * Практика: Исправить ошибку в реализации класса DynaArray
 * В текущей реализации класса DynaArray есть ошибка:
 *
 * Если в качестве начального значения размера массива DynaArray.result указать 0,
 *
 *
 *
 * class DynaArrayTest {
 *     public static void main(String[] args) {
 *         DynaArray dynaArray = new DynaArray(0);
 *         dynaArray.add(0);
 *     }
 * }
 * , то при добавлении нового элемента в динамический массив возникает ошибка:
 *
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
 * 	at academy.devonline.java.structures.DynaArray.add(DynaArray.java:23)
 * 	at academy.devonline.java.structures.DynaArrayTest.main(DynaArrayTest.java:6)
 * Ваша задача исправить данную ошибку!
 *
 *
 *
 * P.S. Что значит значение 0 в качестве начального значения массива DynaArray.result - это значит, что разработчик не хочет чтобы выделялась память под хранение 5 элементов в динамическом массиве. Вместо этого разработчик желает чтобы создавался пустой массив. Но как только в данный массив добавляются элементы, необходимо, чтобы массив автоматически расширялся до размера равного 5, а затем увеличивался вдвое при добавлении новых элементов, если места недостаточно!
 *
 * --------------------------------------------
 */
package academy.devonline.java.home_section001_classes.methods_dyna_array.dyna_array_zero;

import java.util.Arrays;

public class DynaArray {
    private int[] result;

    private int count;

    public DynaArray() {
        this(5);
    }

    public int[] getResult() {
        return result;
    }

    public int getCount() {
        return count;
    }

    public DynaArray(int size) {
        result = new int[size];
    }

    /**
     *
     * @param value целое число
     */
    public void add(int value) {
        if(count == result.length) {
            grow(result.length == 0 ? 5 : result.length * 2);
        }
        result[count] += value;
    }

    public void add(int[] array) {
        add(array, array.length);
    }

    public void add(DynaArray dynaArray) {
        add(dynaArray.result, dynaArray.count);
    }

    private void add(int[] array, int length) {
        if (result.length - count < length) {
            grow(count + length);
        }
        System.arraycopy(array, 0, result, count, length);
        count += length;
    }

    private void grow(int newLength) {
        int[] newArray = new int[newLength];
        System.arraycopy(result, 0, newArray, 0, result.length);
        result = newArray;
    }

    public int[] toArray() {
        return Arrays.copyOf(result, count);
    }

    public String asString() {
        final StringBuilder stringBuilder = new StringBuilder().append('[');
        for (int i = 0; i < count; i++) {
            stringBuilder.append(result[i]);
            if (i < count - 1) {
                stringBuilder.append(',').append(' ');
            }
        }
        return stringBuilder.append(']').toString();
    }
}
