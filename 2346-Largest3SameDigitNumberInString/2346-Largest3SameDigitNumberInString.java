// Last updated: 09/07/2026, 09:49:24
class Solution {
    public String largestGoodInteger(String num) {
        String result = "";

        for (int i = 0; i < num.length() - 2; i++) {
            char c = num.charAt(i);

            if (c == num.charAt(i + 1) && c == num.charAt(i + 2)) {
                String temp = "" + c + c + c;

                if (result.equals("") || temp.compareTo(result) > 0) {
                    result = temp;
                }
            }
        }

        return result;
    }
}