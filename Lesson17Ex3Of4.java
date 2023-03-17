/*
Program care va copia continutul unui Map in un Stack
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Lesson17Ex3Of4 {

    public static void main(String[] args) {

        Map<Integer, String> classMap = new HashMap<>();
        classMap.put(1, "Ion");
        classMap.put(2, "Diana");
        classMap.put(3, "Gheorghe");
        classMap.put(4, "Maria");

        for (Map.Entry<Integer, String> classMapContents : classMap.entrySet()) {
            System.out.println(classMapContents.getKey() + ". " + classMapContents.getValue());
        }

        System.out.println();
        System.out.println("Copied contents from Map to Stack:");

        Stack<String> classStack = new Stack<>();
        for (Map.Entry<Integer, String> name : classMap.entrySet()) {
            classStack.push(String.valueOf(name));
        } //method push() to copy set of elements from map

        System.out.println(classStack);

        //1. Ion
        //2. Diana
        //3. Gheorghe
        //4. Maria
        //
        //Copied contents from Map to Stack:
        //[1=Ion, 2=Diana, 3=Gheorghe, 4=Maria]
    }
}
