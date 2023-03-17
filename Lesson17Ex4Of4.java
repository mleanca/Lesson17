/*
Program care va copia continutul unui Queue in un Map
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Lesson17Ex4Of4 {

    public static void main(String[] args) {
        Queue<Integer> numbersQueue = new LinkedList<>();
        numbersQueue.add(1);
        numbersQueue.add(2);
        numbersQueue.add(3);

        Map<Integer, Integer> numbersMap = new HashMap<>();
        int index = 1;
        for (int number : numbersQueue) {
            numbersMap.put(index++, number);
        }

        System.out.println("Queue: " + numbersQueue);
        System.out.println("Map: " + numbersMap);

        //researched from stack overflow

        //Queue: [1, 2, 3]
        //Map: {1=1, 2=2, 3=3}
    }
}
