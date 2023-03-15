package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> integers = new LinkedList<>();
        for (int listElement : sourceList
        ) {
            if( listElement % 2 == 0) {
                integers.addLast(listElement);
            }
            else {
                integers.addFirst(listElement);
            }
        }
        return integers;
    }
}