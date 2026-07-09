// Last updated: 09/07/2026, 09:50:28
class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String>d=new ArrayList<>();
        for(int i =1;i<=n;i++)
        {
            if(i%3==0&&i%5==0)
            {
                d.add("FizzBuzz");

            }
            else if(i%3==0)
            {
                d.add("Fizz");
            }
            else if(i%5==0)
            {
                d.add("Buzz");
            }
            else d.add(String.valueOf(i));
        }
        return d;
    }
}