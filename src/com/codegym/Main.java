package com.codegym;

public class Main {
    public static void bubbleSort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static int findElement(int[] numbers, int key) {
        int mid = -1;
        int low = 0;
        int high = numbers.length - 1;
        while (high >= low) {
            mid = (low + high) / 2;
            if (key > numbers[mid]){
                low = mid + 1;
            }else if (key < numbers[mid]){
                high = mid -1;
            }else {
                return mid;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] numbers = {9, 5, 7, 9, 4, 6, 2, 4, 6, 7, 8, 9, 54, 6, 743, 45, 6, 7, 8, 5};
        bubbleSort(numbers);
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.println("\nTìm vị trí phần tử 54 trong mảng:");
        int index = findElement(numbers,54);
        System.out.print(index);
    }
}
