class Solution {
    static int isStrong(int N) {
      int temp=N;
      
      int sum=0;
      while(N>0)
      {int fact=1;
        int b=N%10;
      for(int i=1;i<=b;i++)
      {fact=fact*i;
      }
      sum=sum+fact;
      N=N/10;
    }
    if(temp==sum)
    {return 1;
    }
    return 0;}
};
