package group;

public class ArrayHandler {
    private final int size;
    private final int[] arr;
    public ArrayHandler(int n) {
        this.size = n;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100 - 70);
        }
    }
    public void lastPositiveElement() {
        System.out.println("Сгенерированный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
