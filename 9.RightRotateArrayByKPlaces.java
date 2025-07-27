class Solution{
  private void reverse(int arr[],int start,int end){
    while(start<end){
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
    }
  }
  
  public static void rightRotate(int arr[],int k){
    int n=arr.length;
    k=k%n;   // to handle k>n

    reverse(arr,0,n-1);   //reverse entire array
    reverse(arr,0,k-1);   //reverse first k elements (0 to k-1)
    reverse(arr,k,n-1);   //reverse remaining n-k elements (k to n-1)
  }
}
