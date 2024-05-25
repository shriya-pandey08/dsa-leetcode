class Solution {
   public int removeDuplicates(int[] num) {
    if (num.length == 0) return 0; // Empty array

    int i = 0; // Pointer to keep track of unique elements

    for (int j = 1; j < num.length; j++) {
        if (num[j] != num[i]) {
            i++;
            num[i] = num[j]; // Place the unique element at position i
        }
    }

    return i + 1; // Number of unique elements
}

}
