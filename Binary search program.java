public class BinarySearch {

  
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                return binarySearchRecursive(arr, target, left, mid - 1);
            }

            return binarySearchRecursive(arr, target, mid + 1, right);
        }

        return -1;
    }
  
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

  
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;

        int resultRecursive = binarySearchRecursive(sortedArray, target, 0, sortedArray.length - 1);
        if (resultRecursive == -1) {
            System.out.println("Element not present in the array (Recursive)");
        } else {
            System.out.println("Element found at index " + resultRecursive + " (Recursive)");
        }

        int resultIterative = binarySearchIterative(sortedArray, target);
        if (resultIterative == -1) {
            System.out.println("Element not present in the array (Iterative)");
        } else {
            System.out.println("Element found at index " + resultIterative + " (Iterative)");
        }
    }
}
