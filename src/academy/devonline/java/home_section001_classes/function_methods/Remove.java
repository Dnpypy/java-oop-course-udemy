/*
 * Copyright 2022. http://devonline.academy
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package academy.devonline.java.home_section001_classes.function_methods;

import java.util.Arrays;

/**
 * Создать три метода removeInt, removeByIndex, indexOf
 * Создать объект Remove удалить любое число из массива numbers
 * asString() показывает элементы до count
 * toString() тоже строковое представление вообще весь массив независимо от count
 *
 * @author devonline
 * @link http://devonline.academy/java
 */
public class Remove {
    // private int[] numbers = {1, 23, 55, 35, 12, 111, 444};
    private int[] numbers;
    private int count;

    public static void main(String[] args) {
        // Тесты
        Remove rmv = new Remove();
        rmv.add(1);
        System.out.println(rmv.count);
        System.out.println(Arrays.toString(rmv.numbers));
        rmv.add(23);
        rmv.add(55);
        rmv.add(35);
        System.out.println(Arrays.toString(rmv.numbers));
        rmv.removeInt(1);
        System.out.println(Arrays.toString(rmv.numbers));
        System.out.println(Arrays.toString(rmv.numbers));

        rmv.removeInt(23);
        System.out.println(Arrays.toString(rmv.numbers));
        System.out.println(Arrays.toString(rmv.numbers));
        System.out.println(rmv.asString());
        System.out.println(Arrays.toString(rmv.numbers));
        rmv.removeInt(55);

        System.out.println(rmv.asString());
        System.out.println(Arrays.toString(rmv.numbers));
        rmv.removeInt(35);

        System.out.println(rmv.asString());
        System.out.println(Arrays.toString(rmv.numbers));
    }

    /**
     * конструкторы
     */
    public Remove() {
        this(5);
    }

    public Remove(int size) {
        numbers = new int[size];
    }

    /**
     * @param value целое число
     */
    public void add(int value) {
        if (count == numbers.length) {
            grow(numbers.length == 0 ? 5 : numbers.length * 2);
        }
        numbers[count++] = value;
    }

    /**
     * приватная функция grow, которая увеличивает наш массив
     *
     * @param length длина значение
     */
    private void grow(int length) {
        int[] newArray = new int[length];
        System.arraycopy(numbers, 0, newArray, 0, numbers.length);
        numbers = newArray;
    }

     boolean removeInt(int value) {
         // если элемент присутствует то переменная индекс будет хранить индекс элемента от 0 до значения count
         //если элемент отсутствует от индекс будет равен -1
         var index = indexOf(value);
         if (index != -1) {
             removeByIndex(index);
             return true;
         } else {
             return false;
         }
     }

    /**
     * method remove -
     * | - removeByIndex
     * При удалении посл элемента ничего делать не нужно,
     * но при удалении первого элемента, нужно все элементы сдвинуть на 1 индекс влево
     * Проверка как раз определяет нужно ли делать сдвигание или не нужно(Операция сдвига)
     *
     * @param index принимает индекс элемента
     */
    private void removeByIndex(int index) {
        // [0,1,2,3,4]  Пример index = 0
        // 0 < 5 - 1
        if (index < numbers.length - 1) {
//            for (int i = index; i < count - 1; i++) {
//                result[i] = result[i + 1];
//            }
            // (0,1,2,3,4) , 0 + 1 позиция начала нового массива, (1,2,3,4) массив-назначения, 0 начальным положением целевого массива,
            //это количество элементов, которые будут скопированы 5 - 1 - 0 = 4
            System.arraycopy(numbers, index + 1, numbers, index, count - 1 - index);
        }
        count--; // с 5 до 4

    }

    /**
     * method remove -
     * | - method indexOf
     * метод приватный для внутренного использования, реализация обычный линейный поиск
     *
     * @param value целое число
     * @return индекс элемента или -1
     */
    private int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if (numbers[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @return строковое представления массива [....]
     */
    public String asString() {
        final StringBuilder stringBuilder = new StringBuilder().append('[');
        for (int i = 0; i < count; i++) {
            stringBuilder.append(numbers[i]);
            if (i < count - 1) {
                stringBuilder.append(',').append(' ');
            }
        }
        return stringBuilder.append(']').toString();
    }
}
