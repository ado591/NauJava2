package group;

import java.util.ArrayList;
import java.util.Collections;

public class ListHandler {
    private final int size;
    private final ArrayList<Double> arrayList = new ArrayList<>();
    public ListHandler(int n) {
        this.size = n;
        for (int i = 0; i < n; i++) {
            arrayList.add(Math.random() * 100);
        }
    }
    public void selectionSort() {
        System.out.println("Сгенерированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.format("%15.4f ", arrayList.get(i));
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arrayList.get(j) < arrayList.get(minIndex)) {
                    minIndex = j;
                }
            }
            Collections.swap(arrayList, i, minIndex);
        }
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.format("%15.4f ", arrayList.get(i));
            System.out.print(" ");
        }
        System.out.println();
    }
}
