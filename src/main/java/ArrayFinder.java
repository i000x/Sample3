public class ArrayFinder {

    // Method to find the index where the sub-array starts
    public static int findSubArrayIndex(int[] mainArray, int[] subArray) {
        if (subArray.length == 0) return 0;  // If sub-array is empty, return 0
        if (mainArray.length < subArray.length) return -1;  // If sub-array is larger than main array, return -1

        // Traverse the main array to find a matching sub-array
        for (int i = 0; i <= mainArray.length - subArray.length; i++) {
            boolean isMatch = true;

            // Check if subArray matches the section of mainArray starting at index i
            for (int j = 0; j < subArray.length; j++) {
                if (mainArray[i + j] != subArray[j]) {
                    isMatch = false;  // If a mismatch is found, break out of the loop
                    break;
                }
            }

            // If a match is found, return the starting index
            if (isMatch) {
                return i;
            }
        }

        return -1;  // Return -1 if no match is found
    }

    public static void main(String[] args) {
        // Test example
        int[] mainArray = {4, 9, 3, 7, 8};
        int[] subArray = {3, 7};
        System.out.println(findSubArrayIndex(mainArray, subArray));  // Should output 2
    }
}
