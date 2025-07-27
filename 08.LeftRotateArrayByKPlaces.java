class Solution{
  private static void reverse(int arr[],int start,int end){
    while(start<end){
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
    }
  }
  
  public static void leftRotate(int arr[],int k){
    int n=arr.length;
    k=k%n;

    reverse(arr,0,k-1);  //reverse first k elements
    reverse(arr,k,n-1);  //reverse remaining n-k elements
    reverse(arr,0,n-1);  //reverse entire array
  }
}

    
