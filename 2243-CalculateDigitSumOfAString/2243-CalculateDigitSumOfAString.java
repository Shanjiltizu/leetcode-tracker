// Last updated: 9/10/2026, 9:19:37 AM
class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            String result = "";

            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;

                for (int j = i; j < i + k && j < s.length(); j++) {
                    sum += s.charAt(j) - '0';
                }

                result += sum;
            }

            s = result;
        }

        return s;
    }
}