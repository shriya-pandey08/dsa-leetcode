public class Solution {
    public int searchInsert(int[] num, int t) {
        int left = 0;
        int right = num.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (num[mid] == t) {
                return mid;
            } else if (num[mid] < t) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }
}
