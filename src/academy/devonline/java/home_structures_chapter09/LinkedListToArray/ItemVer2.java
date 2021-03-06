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

package academy.devonline.java.home_structures_chapter09.LinkedListToArray;

/**
 * @author devonline
 * @link http://devonline.academy/java
 *
 * #180 Метод LinkedList.toArray Home
 */
public class ItemVer2 {
    //Значение
    int value;

    //объявляется ссылка, она введет на след элемент
    //т.к. каждый элемент у нас представляется типом ItemVer2
    ItemVer2 next;


    // С помощью конструктора можно сразу задать значение
    // public у конструктора не имеет смысла, если класс не публичный

    public ItemVer2(int value) {
        this.value = value;
    }
}
