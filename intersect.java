Given two unsorted integer arrays a[] and b[] each consisting of distinct elements, the task is to return the count of elements in the intersection (or common elements) of the two arrays.
Intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 

class Solution {
    public static int intersectSize(int a[], int b[]) {
      int count=0;
      for(int i=0;i<a.length;i++)
      {for(int j=0;j<b.length;j++)
      {if(a[i]==b[j])
      {count++;
      break;}
      }
      }
       return count; 
    }
}
