package academy.devonline.java.home_section001_classes.function_methods;

import java.util.Arrays;

/**
 *  копирования элементов из одного массива в другой.
 *   // 1 вариант [1, 2, 3, 0, 0, 0]
 *         // 2 вариант [2, 3, 0, 0, 0, 0]
 *  Метод System.arraycopy() принимает несколько параметров.
 * Первым параметром является массив-источник.
 * Вторым параметром является позиция начала нового массива.
 * Третий параметр — массив-назначения.
 * Четвертый параметр является начальным положением целевого массива.
 *
 * Последний параметр это количество элементов, которые будут скопированы.
 *
 * Еще пример:
 * System.arrayCopy(from, fromIndex, to, toIndex, count);
 *
 * from - массив, который копируем
 * to - массив в которой копируем
 * fromIndex - индекс в массиве from начиная с которого берем элементы для копирования
 * toIndex - индекс в массиве to начиная с которого вставляем элементы
 * count - количество элементов которые берем из массива from и вставляем в массив to
 * Массив to должен иметь достаточный размер, чтобы в нем уместились все копируемые элементы
 */
public class HomeArrayCopy {
    public static void main(String[] args) {

        int[] bbb = {1, 2, 3};
        int[] arr = new int[bbb.length * 2]; // размер массива * 2
        int[] arr2 = new int[bbb.length * 2]; // размер массива * 2

        System.arraycopy(bbb, 0, arr, 0, 3);
        System.arraycopy(bbb, 1, arr2, 0, 2);
        // 1 вариант [1, 2, 3, 0, 0, 0]
        // 2 вариант [2, 3, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
