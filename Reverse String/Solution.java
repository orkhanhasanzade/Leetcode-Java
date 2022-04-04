class Solution 
{
    public void reverseString(char[] s) 
    {
        char[] res = new char[100000];
        int size = s.length;
        int j = 0;
        for(int i = size - 1 ; i>=0; i--)
        {    
           res[j] = s[i];
           j++;
        }
        for(int k = 0; k<size ;k++)
        {
            s[k] = res[k];
        }
    }
}