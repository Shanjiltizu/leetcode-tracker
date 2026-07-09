// Last updated: 09/07/2026, 09:49:03
import java.util.*;
class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String i:details){
            int age=Integer.parseInt(i.substring(11,13));
            if(age>60){
                count+=1;
            }
        }
        return count;
    }
}