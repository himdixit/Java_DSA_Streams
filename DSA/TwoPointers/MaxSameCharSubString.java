package DSA.TwoPointers;

public class MaxSameCharSubString {
    public static void main(String[] args) {
        String str="aabbbccccddd";
        int i=1;
        int currLength=1;
        int maxLength=Integer.MIN_VALUE;

        for(;i < str.length();i++)
        {
            if(str.charAt(i) == str.charAt(i-1))
            {
                currLength++;
            }
            else
            {
                maxLength = Math.max(maxLength, currLength);
                System.out.println("Current Max Length:"+maxLength);
                currLength=1;
            }
        }
    }
}
