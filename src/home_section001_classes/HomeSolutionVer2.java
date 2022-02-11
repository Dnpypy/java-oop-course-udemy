package home_section001_classes;

import section001_classes.DynaArrayVer2;

/**
 * Создать класс HomeDynaArrayVer2 в этом же пакете home_section001_classes, в нем объявить одно поле int[]
 * массив и задать размер 5 и одно поле переменную int
 * Создать в классе HomeSolutionVer2 объект класса HomeDynaArrayVer2 и этому объекту присвоить ссылку на метод
 * getPositiveNumbers(array);
 * Создание функции (add) добавления элемента в динамический массив
 * Удалить решение
 */
public class HomeSolutionVer2 {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, -5, 4, 3, 2, 2, 2};

        HomeDynaArrayVer2 homeDynaArrayVer2 = getPositiveNumbers(array);

        for (int i = 0; i < homeDynaArrayVer2.count; i++) {
            System.out.print(homeDynaArrayVer2.result[i] + " ");
        }
    }


    /**
     * param array исходный массив,
     * return возвращается новый массив класса HomeDynaArrayVer2 с положительными числами
     */
    private static HomeDynaArrayVer2 getPositiveNumbers(int[] array) {
        HomeDynaArrayVer2 dynaArray = new HomeDynaArrayVer2();
        for (int value : array) {
            if (value > 0) {
                add(dynaArray, value);
            }
        }
        return dynaArray;
    }


    /**
     * функция, которая динамически расширяет наш динамический массив
     * param объект класса DynaArray
     * param полож число
     */
    private static void add(HomeDynaArrayVer2 dynaArray, int value) {
        // сравнение количество заполненных элементов и реального размера массива
        if (dynaArray.count == dynaArray.result.length) {
            // создание временного нового массива с элементами x2
            int[] newArray = new int[dynaArray.result.length * 2];
            // слияние двух массивов через for добавляя элементы или arraycopy
            System.arraycopy(dynaArray.result, 0, newArray, 0, dynaArray.result.length);
            //присвоение оригинальному массиву новый
            dynaArray.result = newArray;
        }
        // повышение счетчика у объекта класса HomeDynaArrayVer2
        dynaArray.result[dynaArray.count++] = value;

    }
}

