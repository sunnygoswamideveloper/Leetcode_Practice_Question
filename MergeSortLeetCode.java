public class MergeSortLeetCode {

    public static void main(String[] args) {
        int []nums1 = {1,2,3,0,0,0};
        int []nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = m - 1, j = n - 1, k = m + n - 1; j >= 0; --k) {
            nums1[k] = i >= 0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];

        }

    }
}
