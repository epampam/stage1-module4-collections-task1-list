package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public static void main(String[] args) {
        List<String> sourceList = new ArrayList<>(List.of("2", "4", "6", "8", "10", "12", "14"));
        ListSorter sorter = new ListSorter();
        sorter.sort(sourceList);
        System.out.println(sourceList);
    }

    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int result = Integer.compare(5 * x * x + 3, 5 * y * y + 3);
        return (result != 0) ? result : Integer.compare(x, y);
    }
}
