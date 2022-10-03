package com.frequencyofwords;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Frequency of Words using HashTable!!");

        String paragraph = "to be or not to be";
        System.out.println("The String is : " + paragraph);
        String[] splitArray = paragraph.split(" ");

        HashTable<String, Integer> hashTable = new HashTable<>();

        for (String word : splitArray) {
            if (hashTable.containsKey(word)) {

                int count = hashTable.get(word);
                hashTable.replace(word, count + 1);
            } else {
                hashTable.put(word, 1);
            }
        }
        hashTable.print();
    }
}
