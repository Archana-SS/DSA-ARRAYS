//Array which is sorted and rotated will contain only one pair where previous element is greater than the next element. If all the array elements are equal then the count of such pairs will be zero. So if the number of such pairs is 0 or 1 we return true. Else we return false.
class Solution{
  public static boolean check(int arr[]){
    int n=arr.length;
    int count=0;

    for(int i=1;i<n;i++){
      if(arr[i-1]>arr[i]){
        count++;
      }
    }
    //to compare the last element of the array with the first element. (Cyclic nature)
    if(arr[n-1]>arr[0])
      count++;

    if(count<=1)
      return true;
    else
      return false;
  }
}
