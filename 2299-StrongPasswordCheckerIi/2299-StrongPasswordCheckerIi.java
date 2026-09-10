// Last updated: 9/10/2026, 9:19:30 AM
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;

        boolean lower = false, upper = false, digit = false, special = false;

        String sp = "!@#$%^&*()-+";

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (i > 0 && c == password.charAt(i - 1)) return false;

            if (Character.isLowerCase(c)) lower = true;
            else if (Character.isUpperCase(c)) upper = true;
            else if (Character.isDigit(c)) digit = true;
            else if (sp.contains(c + "")) special = true;
        }

        return lower && upper && digit && special;
    }
}