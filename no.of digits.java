Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.

class Solution {
    static int evenlyDivides(int n) {
     int temp=n;
     int count=0;
     while(n>0)
     {int num=n%10;
     if(num!=0&&temp%num==0)
     {count++;
    }
    n=n/10;
     }
     return count;}
    
}