class Solution{
  public static int secLargest(int arr[]){
    int n=arr.length;
    int max=Integer.MIN_VALUE;
    int secMax=Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
      if(arr[i]>max){
        secMax=max;
        max=arr[i];
      }
      else if(arr[i]>secMax && arr[i]!=max){
        secMax=arr[i];
      }
    }

    return secMax==Integer.MIN_VALUE?-1:secMax;  //return -1 if secMax is not found
  } 
}
