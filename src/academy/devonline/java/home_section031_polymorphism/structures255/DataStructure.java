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

package academy.devonline.java.home_section031_polymorphism.structures255;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public abstract class DataStructure {

    abstract public void add(int value);

    abstract public void add(int[] array);

    abstract public void add(DynaArray dynaArray);

    abstract public void add(LinkedList list);

    abstract public int size();

    abstract public int[] toArray();

    abstract public void clear();

    abstract public boolean contains(int value);

    abstract public boolean remove(int value);
}
