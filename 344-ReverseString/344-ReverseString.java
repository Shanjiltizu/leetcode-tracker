// Last updated: 09/07/2026, 09:50:42
class Solution {
    public void reverseString(char[] s)
    {
        int i =0;
        int j=s.length-1;
        while(i<j)
        {
            char h=s[i];
            s[i]=s[j];
            s[j]=h;
            i++;
            j--;
        }
    }    
}