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

package academy.devonline.java.home_section021_inheritance_and_polymorphism;

/**
 * @author devonline
 * @link http://devonline.academy/java
 *
 * #222
 * Исправить код
 * получить ссылку на мнимый объект родительского класса method1,
 * вызвать метод из родительсого класса для этого используется ключевое слово...
 *
 * Далее в методе method3 вызывать метод method1 из этого же класса...
 * (есть два способа),  применить оба способа
 */
public class SuperMethod {

    private static class Parent {

        void method1() {
            System.out.println("класс Родитель Parent method1\n");
        }

        void method2() {
            System.out.println("класс Родитель Parent method2\n");
        }
    }

    private static class Child extends Parent{

        @Override
        void method1() {
            super.method1();
            System.out.println("класс наследник Child method1\n");
        }

        void method3() {
            method1();
            this.method1();
            System.out.println("класс наследник Child method2\n");
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();
    }
}
