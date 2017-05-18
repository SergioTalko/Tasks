public class MatchUp {
    public int matchUp(int[] nums1, int[] nums2) {
        if (nums1.length != nums2.length) {
            System.err.println("Arrays not same length");
            return 0;
        }

        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i] && (nums1[i] - nums2[i]) <= 2) {
                count++;
            }
        }
        return count;
    }
}
