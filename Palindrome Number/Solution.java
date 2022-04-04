class Solution 
{
    public boolean isPalindrome(int x) 
    {
        String str = Integer.toString(x);
        int length = str.length();
        int result = 0;
        for (int i=0 ;i<length; i++)
        {
            if(str.charAt(i) != str.charAt(length-1-i))
            {
                result = 0;
                break;
            }else{result=1;}
        }
        if(result == 0) return false;  else return true;
    }
}