// Last updated: 09/07/2026, 09:49:40
class Solution 
{
    public int largestAltitude(int[] gain) 
    {
        int n = gain.length;
        int[] arr = new int[n + 1];  

        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + gain[i - 1];
        }
        int max = arr[0];
        for (int i = 1; i <= n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}