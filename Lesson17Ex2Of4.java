/*
Program care va copia continutul unui Map in un Queue
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
public class Lesson17Ex2Of4 {

    public static void main(String[] args) {

        Map<String, String> countryCodeMap = new HashMap<>();
        countryCodeMap.put("PH", "Philippines");
        countryCodeMap.put("MD", "Moldova");
        countryCodeMap.put("RO", "Romania");
        countryCodeMap.put("UA", "Ukraine");
        countryCodeMap.put("JP", "Japan");
        countryCodeMap.put("CH", "Switzerland");

        for (Map.Entry<String, String> countryMapContents : countryCodeMap.entrySet()) {
            System.out.println(countryMapContents.getKey() + " : " + countryMapContents.getValue());
        }

        System.out.println();
        System.out.println("Copied contents from Map to Queue:");

        Queue<String> countryKeyQueue = new LinkedList<>(countryCodeMap.keySet());
        Queue<String> countryValueQueue = new LinkedList<>(countryCodeMap.values());
        //passed the map named countryCodeMap as argument in LinkedList to copy contents

        System.out.println(countryKeyQueue + " : " + countryValueQueue);
    }

    //CH : Switzerland
    //JP : Japan
    //MD : Moldova
    //PH : Philippines
    //UA : Ukraine
    //RO : Romania
    //
    //Copied contents from Map to Queue:
    //[CH, JP, MD, PH, UA, RO] : [Switzerland, Japan, Moldova, Philippines, Ukraine, Romania]
}
