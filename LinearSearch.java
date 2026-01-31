public class LinearSearch {
    // Custom class to hold both the position and boolean result
    static class SearchResult {
        int position;
        boolean found;

        SearchResult(int position, boolean found) {
            this.position = position;
            this.found = found;
        }
    }

    // Method to find the position of k and return both the position and found status
    public static SearchResult findPosition(int[] arr, int k) {
        // Iterate through the array to find the element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return new SearchResult(i, true); // Element found, return position and true
            }
        }
        return new SearchResult(-1, false); // Element not found, return -1 and false
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 3, 4, 6};
        int k1 = 6;
        SearchResult result1 = findPosition(arr1, k1);
        System.out.println("Position for k = 6: " + result1.position + ", Found: " + result1.found); // Position: 4, Found: true

        // Example 2
        int[] arr2 = {1, 2, 4, 5, 6};
        int k2 = 3;
        SearchResult result2 = findPosition(arr2, k2);
        System.out.println("Position for k = 3: " + result2.position + ", Found: " + result2.found); // Position: -1, Found: false

        // Example 3
        int[] arr3 = {2, 3, 5, 6};
        int k3 = 1;
        SearchResult result3 = findPosition(arr3, k3);
        System.out.println("Position for k = 1: " + result3.position + ", Found: " + result3.found); // Position: -1, Found: false
    }
}
