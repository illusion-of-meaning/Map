package com.asherbakov;

import com.asherbakov.phoneBook.PhoneBook;
import com.asherbakov.phoneBook.TestFioData;
import com.asherbakov.phoneBook.TestPhoneData;
import com.asherbakov.recipeBook.Product;
import com.asherbakov.recipeBook.Recipe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // HW 1 - 1
        PhoneBook phoneBook = new PhoneBook();
        List<TestFioData> testFioDataList = Arrays.asList(TestFioData.values());
        List<TestPhoneData> testPhoneDataList = Arrays.asList(TestPhoneData.values());
        int size = Math.min(testFioDataList.size(), testPhoneDataList.size());
        for (int i = 0; i < size - 1; i++) {
            phoneBook.addPhoneNumber(testFioDataList.get(i).getFio(), testPhoneDataList.get(i).getPhone());
        }
        phoneBook.printPhoneBook();

        // HW 1 - 2
        System.out.println();
        System.out.println("Задание 1-2");
        Recipe recipe1 = new Recipe("Оливье",
                new Product("Картофель", 48.20, 2),
                new Product("Морковь", 30, 1),
                new Product("Огурцы", 30, 1),
                new Product("Яйца", 10, 2));
        System.out.println(recipe1.toString());
        System.out.println("Стоимость продуктов: " + recipe1.getProductsPrice() + " руб.");

        // HW 1 - 3
        System.out.println();
        System.out.println("Задание 1-3");
        Map<String, Integer> mapTask1 = generateMapTask1_3();
        mapTask1.forEach((s, i) -> System.out.println(s + " имеет значение: " + i));
        addToMap(mapTask1, "str3", 8);
        addToMap(mapTask1, "str5", 12);
//        addToMap(map, "str3", 8);
        System.out.println("Значения после обновления:");
        mapTask1.forEach((s, i) -> System.out.println(s + " имеет значение: " + i));

        // HW 2 - 1
        System.out.println();
        System.out.println("Задание 2-1");
        Map<String, List<Integer>> mapTask2_1 = generateMapTask2_1();
        mapTask2_1.forEach((s, l) -> System.out.println(s + ": " + l.toString()));
        Map<String, Integer> mapTask2_1New = new HashMap<>();
        mapTask2_1.forEach((s, l) -> mapTask2_1New.put(s, sumListElements(l)));
        System.out.println("Просуммированные значения:");
        mapTask2_1New.forEach((s, l) -> System.out.println(s + ": " + l.toString()));

        // HW 2 - 2
        System.out.println();
        System.out.println("Задание 2-2");
        Map<Integer, String> mapTask2_2 = generateMapTask2_2();
        mapTask2_2.forEach((k, v) -> System.out.println(k + " : " + v));

    }

    private static Map<String, Integer> generateMapTask1_3() {
        Map<String, Integer> map = new HashMap<>();
        map.put("str1", 1);
        map.put("str2", 2);
        map.put("str3", 3);
        return map;
    }

    private static Map<String, List<Integer>> generateMapTask2_1() {
        Map<String, List<Integer>> map = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(new Random().nextInt(1000));
        list1.add(new Random().nextInt(1000));
        list1.add(new Random().nextInt(1000));
        map.put("str1", list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(new Random().nextInt(1000));
        list2.add(new Random().nextInt(1000));
        list2.add(new Random().nextInt(1000));
        map.put("str2", list2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(new Random().nextInt(1000));
        list3.add(new Random().nextInt(1000));
        list3.add(new Random().nextInt(1000));
        map.put("str3", list3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(new Random().nextInt(1000));
        list4.add(new Random().nextInt(1000));
        list4.add(new Random().nextInt(1000));
        map.put("str4", list4);

        List<Integer> list5 = new ArrayList<>();
        list5.add(new Random().nextInt(1000));
        list5.add(new Random().nextInt(1000));
        list5.add(new Random().nextInt(1000));
        map.put("str5", list5);
        return map;
    }

    private static Map<Integer, String> generateMapTask2_2() {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, UUID.randomUUID().toString());
        }
        return map;
    }

    private static Integer sumListElements(List<Integer> list) {
        Integer sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    private static void addToMap(Map<String, Integer> map, String str, Integer i) {
        if (map.containsKey(str)) {
            if (map.get(str).equals(i)) {
                throw new IllegalArgumentException("Значения совпадают");
            } else {
                map.replace(str, i);
            }
        } else {
            map.put(str, i);
        }
    }
}