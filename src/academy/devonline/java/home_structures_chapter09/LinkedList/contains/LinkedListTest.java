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

package academy.devonline.java.home_structures_chapter09.LinkedList.contains;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.contains(0));
        System.out.println(list.contains(2));

        System.out.println(list.contains(100));
        System.out.println(list.contains(-3));
    }
}
