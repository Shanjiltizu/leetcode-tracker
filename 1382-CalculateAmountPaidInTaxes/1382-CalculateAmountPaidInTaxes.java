// Last updated: 09/07/2026, 09:49:51
class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double tax = 0;
        int prev = 0;

        for (int[] b : brackets) {
            int upper = b[0];
            int percent = b[1];

            int amount = Math.min(income, upper) - prev;

            if (amount > 0) {
                tax += amount * percent / 100.0;
                prev = upper;
            }

            if (income <= upper) break;
        }

        return tax;
    }
}