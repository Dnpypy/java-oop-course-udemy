package academy.devonline.java.home_section001_classes.dyna_array;


/**
 * Создать класс HomeMinusArray в этом же пакете dyna_array, в нем объявить один int[] массив и одну переменную int
 * Создать в классе HomeSolution объект класса HomeMinusArray и этому объекту присвоить ссылку на метод getNegativeNumbers(array);
 * Создать метод getNegativeNumbers(array) в котором необходимо найти все числа меньше нуля
 * и возвращает переменную типа HomeMinusArray(дин массив)
 * Удалить решение
 */
public class HomeSolution {
    public static void main(String[] args) {
        int[] array = {1, -2, -3, 4, -5};

        HomeMinusArray hm = getNegativeNumbers(array);

        for (int i = 0; i < hm.count; i++) {
            System.out.print(hm.result[i] + " ");
        }
    }

    private static HomeMinusArray getNegativeNumbers(int[] array) {
        int[] newArray = new int[array.length];
        var count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                newArray[count] = array[i];
                count++;
            }
        }
        HomeMinusArray temp = new HomeMinusArray();
        temp.result = newArray;
        temp.count = count;
        return temp;
    }

}
