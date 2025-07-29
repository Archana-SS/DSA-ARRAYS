class Solution{
  public static int maxProduct(int arr[]){
    int n=arr.length;

    int max=Integer.MIN_VALUE;
    int prefix=1,suffix=1;

    for(int i=0;i<n;i++){
      if(prefix==0)
        prefix=1;

      if(suffix==0)
        suffix=1;

      prefix*=arr[i];
      suffix*=arr[n-i-1];

      max=Math.max(max,Math.max(prefix,suffix));
    }

    return max;
  }
}
