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

package academy.devonline.java.home_structures_chapter09.LinkedListA;


/**
 * @author devonline
 * @link http://devonline.academy/java
 * <p>
 * Создание односвязного списка  №176
 */
public class LinkedList {
    //У этого класса должно быть два поля, которые указывают на первый
    // элемент списка и на последний
    private Item first;
    private Item last;

    /**
     * добавляет элемент в списки
     * т.к. метод add является методом класса LinkedList, то он имеет доступ к полям этого класса
     *
     * @param value целое число
     */
    void add(int value) {
        //создаю объект элемента списка типа Item с одним аргументом конструктора
        Item item = new Item(value);
        //тут нужна проверка если элементов нет в списке, т.е. список пустой
        //по умолчани. внутр поля класс инициализируются null(если ничего не записано в них), задачи в пакете values
        // тут проверка первого элемента!
        if (first == null) {
            // операция присваивания является правосторонней справо на лево
            //сначала эта операция last = item, потом эта first = last
            first = last = item;
        } else {
            // если в списке есть хотя бы один элемент, нам нужно обновить ссылку last
            last.next = item; // напрямую к next не можем обратится, только через last
            last = item;
        }
    }

    /**
     * @author devonline
     * @link http://devonline.academy/java
     */
    private static class Item {

        //значение
        int value;

        //ссылка на след элемент
        //т.к. каждый элемент у нас представляется типом Item
        Item next;


        // с помощью конструктора можно сразу задать значение
        // public не имеет смысла класс не публичный
        Item(int value) {
            this.value = value;
        }
    }
}
