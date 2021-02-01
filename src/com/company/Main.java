package com.company;

import java.util.Arrays;
import java.util.List;

class Print {

    void print(String s) {
        if (s == null) {
            throw new NullPointerException("Ошибка: null!");
        }
        System.out.println("Выполнен первый метод: " + s);
    }

    public static void main(String[] args) {
        Print print = new Print();

        List<String> list= Arrays.asList("Строка 1", null, "Строка 3");

        for (String s:list) {
            try {
                print.print(s);
            }
            catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Ошибка обработанна, catch. Программа рабоатает дальше");
            }
            finally {
                System.out.println("Запуск finally");
            }
            System.out.println("оборот цикла пройден....");
            System.out.println("-----------------");
        }

    }
}

/*
    ArithmeticException
        Возникла исключительная ситуация, связанная с ошибкой при выполнении арифметического
        вычисления (например, с попыткой целочисленного деления на нуль).
                Класс ArithmeticalException унаследован от RuntimeException.

    ArrayIndexOutOfBoundsException
        Задано значение индекса массива, не принадлежащее допустимому диапазону. Имеется
        дополнительный конструктор, принимающий в качестве параметра ошибочное значение индекса
        и включающий его в текст описательного сообщения.
                Класс ArrayIndexOutOfBoundsException унаследован от IndexOutOfBoundException

    ArrayStoreException
        Предпринята попытка сохранения в массиве объекта недопустимого типа.
        Возникает, если попытаться записать в ячейку массива ссылку на объект неправильного типа.
                Класс ArrayStoreException унаследован от RuntimeException.

    ClassCastException
        Выполнена неверная операция преобразования типов (ошибка приведения типов).
            Класс ClassCastException унаследован от RuntimeException.

    ConcurrentModificationException
        Осуществлена попытка изменения объекта конкурирующим потоком вычислений
        (thread) с нарушением контракта класса (тип определен в пакете jav.util).
        Также исключение может происходить при работе с коллекциями при обычной однопоточной работе.
        ConcurrentModificationException возникает когда коллекция модифицируется «одновременно»
         с проходом по коллекции итератором любыми средствами кроме самого итератора.
                Класс ConcurrentModificationException унаследован от RuntimeException.

    EmptyStackException
        Возникает при попытке извлечения объекта из пустого стека. Тип обладает только конструктором
        без параметров, поскольку причина ситуации очевидна без дополнительных разъяснений (тип определен в пакете java.util).
                Класс EmptyStackExceptionунаследован от RuntimeException.

    IllegalArgumentException
        Методу передано неверное значение аргумента (например, отрицательное, когда метод
        предполагает задание положительных значений).
                Класс IllegalArgumentExceptionунаследован от RuntimeException.

    IllegalMonitorStateException
        Выполнено обращение к методу wait, notifyAll или notify объекта, когда текущий поток
        вычислений не обладает блокировкой (lock) этого объекта.
                Класс IllegalMonitorStateException унаследован от RuntimeException.

    IllegalStateException
        Предпринята попытка выполнения операции в то время, когда объект не находится в
        соответствующем состоянии (например при регистрации или удалении ловушки события
        закрытия исполняющей системы (shutdown hook) после начала процедуры закрытия).
                Класс IllegalStateExceptionунаследован от RuntimeException.

    IllegalThreadStateException
        Предпринята попытка выполнения операции в то время, когда объект потока вычислений не
         находится в соответствующем состоянии (например, вызван метод start для потока, который уже приступил к работе).
                Класс IllegalThreadStateException унаследован от IllegalArgumentException

    IndexOutOfBoundsException
        Задано значение индекса массива или содержимого строки типа String, не принадлежащее допустимому диапазону.
                Класс IndexOutOfBoundsException унаследован от RuntimeException

    MissingResourceException
        Не найден требуемый ресурс или пакет ресурсов (resource bundle). Единственный конструктор типа
        предусматривает задание трех аргументов: строки описательного сообщения, наименования класса ресурсов
        и объекта ключа, отвечающего отсутствующему ресурсу. Для получения строк наименования класса
        и ключа применяются методы detClassName и getKey соответственно (тип определен в пакете java.util).
                Класс MissingResourceExceptionунаследован от RuntimeException.

    NegativeArraySizeException
        Предпринята попытка создания массива с размером, значение которого задано отрицательным числом.
                Класс NegativeArraySizeException унаследован от RuntimeException.

    NoSuchElementException
        Операция поиска элемента в объекте одного из контейнерных классов завершилась
        неудачей (тип определен в пакете java.util).
                Класс NoSuchElementException унаследован от RuntimeException.

    NullPointerException
        Возникает при попытке обращения к полю, методу или объекту по ссылке, равной null.
        Также исключение выбрасывается, когда метод, не допускающий передачи аргумента null,
        был вызван с заданием значения null. В последнем случае может быть сгенерировано и исключение типа IllegalArgumentException.
                Класс NullPointerException унаследован от RuntimeException.

    NumberFormatException
        Строка, которая, как предполагалось должна содержать представление числа, не отвечает
         этому требованию. Исключение выбрасывается такими методами, как, например, Integer.parseInt.
                Класс NumberFormatException унаследован от IllegalArgumentException.

    SecurityException
        Предпринята попытка выполнения операции, запрещенной системой обеспечения безопасности
        в соответствии с действующей политикой безопасности.
                Класс SecurityException унаследован от RuntimeException.

    StringIndexOutOfBoundsException
        Задано значение индекса содержимого строки типа String, не принадлежащее допустимому диапазону.
         Имеется дополнительный конструктор, принимающий в качестве параметра ошибочное значение
         индекса и включающий его в текст описательного сообщения.
                Класс StringIndexOutOfBoundsException унаследован от IndexOutOfBoundsException.

    UndeclaredThrowableException
        Выбрасывается при обращении к методу целевого объекта посредством объекта рефлективного класса Proxy,
        если метод invoke объекта InvocationHandler генерирует объявляемое исключение, которое не допускает
         присваивания ни одному из типов исключений, упомянутых в предложении throws метода целевого объекта.
          Рассматриваемое исключение содержит ссылку на исключение, генерируемое методом invoke, которое может
           быть получено с помощью метода getUndeclaredThrowable. Класс исключений UndeclaredThrowableException
           поддерживает два конструктора: оба принимают в качестве параметров ссылку на объект Throwable, а один из них,
           помимо того, строку описания (тип определен в пакете java.lang.reflect).
                    Класс UndeclaredThrowableException унаследован от RuntimeException.

    UnsupportedOperationException
        Предпринята попытка выполнения операции над объектом, который ее не поддерживает (например, модификация объекта,
        обозначенного признаком «только для чтения»). используется также классами коллекций из состава пакета java.util
        как реакция на вызов методов производного класса, реализация которых не обязательна.
                    Класс UnsupportedOperationException унаследован от RuntimeException.

 */