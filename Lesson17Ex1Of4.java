/*
Program care va copia continutul unui Map in alt Map
 */

import java.util.HashMap;
import java.util.Map;
public class Lesson17Ex1Of4 {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Lion", 4);
        map1.put("Tiger", 5);
        map1.put("Elephant", 10);
        map1.put("Wolf", 3);

        for (Map.Entry<String, Integer> map1Contents : map1.entrySet()) {
            System.out.println(map1Contents.getKey() + ", age " + map1Contents.getValue());
        }

        System.out.println();
        System.out.println("Copied contents from Map 1 to Map 2:");

        Map<String, Integer> map2 = new HashMap<>(map1);
        //passed the first map as the argument to copy elements within it

        for (Map.Entry<String, Integer> map2Contents : map2.entrySet()) {
            System.out.println(map2Contents.getKey() + ", age " + map2Contents.getValue());
        }

        //Elephant, age 10
        //Lion, age 4
        //Wolf, age 3
        //Tiger, age 5
        //
        //Copied contents from Map 1 to Map 2:
        //Lion, age 4
        //Wolf, age 3
        //Tiger, age 5
        //Elephant, age 10

    }
}
