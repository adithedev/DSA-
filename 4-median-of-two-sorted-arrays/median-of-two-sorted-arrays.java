import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);

        int n = merged.length;
        double median;

        if (n % 2 == 0) {
            // Original math formula (1-based indexing):
            // median = (element at position n/2 + element at position n/2 + 1) / 2
            // Convert to 0-based indexing:
            // indices -> (n/2 - 1) and (n/2)
            median = (merged[n/2 - 1] + merged[n/2]) / 2.0;
        } else {
            // Original math formula (1-based indexing):
            // median = element at position (n + 1) / 2
            // Convert to 0-based indexing:
            // index -> n/2
            median = merged[n/2];
        }

        return median;
    }
}
