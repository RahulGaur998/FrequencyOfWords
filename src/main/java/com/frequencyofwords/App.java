package com.frequencyofwords;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Frequency of Words using HashTable!!");

        String paragraph = "paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        System.out.println("The paragraph is : " + paragraph);
        String[] splitArray = paragraph.split(" ");

        HashTable<String, Integer> hashTable = new HashTable<>();

        for (String word : splitArray) {
            Integer value = hashTable.get(word);

            if (value == null) {
                value = 1;
            } else {
                value = value + 1;
            }
            hashTable.add(word, value);
        }
        hashTable.print();
    }
}
