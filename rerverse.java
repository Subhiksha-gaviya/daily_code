class Solution {
    public int reverseExponentiation(int n) {
        int temp=n;
      int sum=0;
      while(n>0)
     {int b=n%10;
      sum=sum*10+b;
      n=n/10;
    }
    double value=Math.pow(temp,sum);
    int value1 = (int) value; 
    
    return value1;
        
    }
    
}
