// Last updated: 09/07/2026, 09:50:50
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid; // possible answer
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}