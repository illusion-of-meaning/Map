# Домашнее задание 1

### Задание 1

Напишите приложение «Телефонный справочник», используя HashMap:

В качестве ключа коллекция принимает значение «Имя и Фамилия»,  а в качестве

значения коллекции — номер телефона.

Добавьте 20 произвольных значений в мапу, выведите все значения в консоль.

- Критерии проверки
    - Создан новый класс.
    - Создан HashMap, который хранит в ключе имя и фамилию, в значении — номер телефона.
    - Добавлены 20 произвольных значений в HashMap.
    - Все значения выведены в консоль.

### Задание 2

Возвращаемся к заданию со списком продуктов и рецептов. Вам необходимо доработать класс рецептов так, чтобы для каждого продукта мы могли записать необходимое количество (например, бананы — 2 штуки).

Замените HashSet на HashMap, где в качестве ключа — продукт, а в качестве значения — необходимое количество. Если количество продукта не было передано, сохраните 1.
Доработайте подсчет суммарной стоимости рецепта — умножьте стоимость каждого продукта на его количество.

- Критерии проверки
    - HashSet заменен на HashMap.
    - В качестве ключа используется класс Product, в качестве значения — количество.
    - Количество продукта в рецепте не может быть меньше 1.
    - Переработан подсчет стоимости рецепта.
    - Остальная логика кода не была изменена.

### Задание 3

Создайте коллекцию Map<String, Integer>. Заполните ее произвольными значениями.

Напишите метод, который принимает строку (ключ) и целое число (значение) и пытается добавить ее в коллекцию по логике:

- Если такого ключа нет, то просто добавляет данные в коллекцию.
- Если такой ключ уже есть и значения совпадают, то необходимо бросить исключение.
- Если такой ключ уже есть, но значения разные, то обновите целое число в коллекции.

Пример: есть HashMap "str1" —> 2.
Если метод принимает "str2" —> 1, добавляем новое значение.
Если метод принимает "str1" —> 2, кидаем исключение.
Если метод принимает "str1" —> 5, обновляем коллекцию (теперь по ключу "str1" будет храниться значение 5).

# Домашнее задание 2

### Задание 1

Создайте Map<String, List<Integer>>. Заполните ее 5 элементами, где ключ — произвольное значение, а значение — список, состоящий из 3 случайных чисел в диапазоне от 0 до 1000.

Преобразуйте созданную коллекцию в новую — Map<String, Integer>, где ключи взяты из первой коллекции, а число — сумма чисел списка. Выведите результат в консоль.

Пример:

```java
"string1" —> [1, 6, 12]
"string2" —> [200, 150, 350]
```

Новая коллекция станет:

```java
"string1" —> 19
"string2" —> 700
```

- Критерии оценки
    - Изначальная коллекция заполняется 5 ключами, в каждом из которых список из 3 элементов. Элементы списка должны быть случайными значениями в указанном диапазоне.
    - Изначальную коллекцию необходимо преобразовать в новую согласно условиям.
    - Результат выводится в консоль.

### Задание 2

Создайте Map<Integer, String>, заполните ее 10 произвольными значениями. Выведите в консоль всё содержимое коллекции в порядке добавления (в формате ”ключ:значение").