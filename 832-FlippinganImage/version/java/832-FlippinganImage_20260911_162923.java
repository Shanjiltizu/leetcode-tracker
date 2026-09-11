// Last updated: 9/11/2026, 4:29:23 PM
1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3        for(int[] line : image) {
4            if(line.length % 2 == 1) line[line.length / 2] ^= 1;
5            for(int i = 0; i < line.length/2; i++) {
6                int temp = line[i];
7                line[i] = 1 ^ line[line.length-i-1];
8                line[line.length-i-1] = 1 ^ temp;
9            }
10        }
11        return image;
12    }
13}