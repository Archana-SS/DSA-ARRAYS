class Solution{
  public static void moveZeros(int arr[]){
    int n=arr.length;
    int j=-1;

    for(int i=0;i<n;i++){   //to find the index (position) of first zero
      if(arr[i]==0){
        j=i;
        break;
      }
    }

    if(j==-1)
      return;   //because if j is still -1 then array doesn't contain any zeros to shift

    for(int i=j+1;i<n;i++){
      if(arr[i]!=0){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j++;
      }
    }
  }
}
