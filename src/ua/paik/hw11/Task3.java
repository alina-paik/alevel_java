package ua.paik.hw11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task3 {

    public static void fillArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList fill time: " + (endTime - startTime) + " ms");
    }

    public static void fillLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("LinkedList fill time: " + (endTime - startTime) + " ms");
    }

    public static void getRandomElements(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();

        if (list.isEmpty()) {
            System.out.println("List is empty. Cannot get random elements.");
            return;
        }

        for (int i = 0; i < 100000; i++) {
            int randomIndex = random.nextInt(list.size());
            list.get(randomIndex);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Get random elements time: " + (endTime - startTime) + " ms");
    }


    public static void main(String[] args) {
        fillArrayList();
        fillLinkedList();

        List<Integer> arrayList = new ArrayList<>();
        fillArrayList();
        getRandomElements(arrayList);

        List<Integer> linkedList = new LinkedList<>();
        fillLinkedList();
        getRandomElements(linkedList);
    }
}

