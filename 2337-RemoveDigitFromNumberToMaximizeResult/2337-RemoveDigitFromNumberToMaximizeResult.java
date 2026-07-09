// Last updated: 09/07/2026, 09:49:28
class Solution {
    public String removeDigit(String number, char digit) {
        String max = "";

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String temp = number.substring(0, i) + number.substring(i + 1);

                if (max.equals("") || temp.compareTo(max) > 0) {
                    max = temp;
                }
            }
        }

        return max;
    }
}