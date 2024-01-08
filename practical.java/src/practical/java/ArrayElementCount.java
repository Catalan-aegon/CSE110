package practical.java;
import java.util.Scanner;

public class ArrayElementCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the element to count: ");
        int elementToCount = scanner.nextInt();

        
        int count = countOccurrences(arr, elementToCount);

        
        System.out.println("Occurrences of " + elementToCount + " in the array: " + count);

        
    }

    
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int value : array) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }
}
