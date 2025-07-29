//Problem-1 : To return the sum of maximum sum subarray (Kadane's algorithm)

class Solution{
  public static int subArraySum(int arr[]){
    int n=arr.length;

    int sum=0;
    int max=Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
      sum+=arr[i];

      if(sum>max)
        max=sum;

      if(sum<0)
        sum=0;
    }

    return max;
  }
}

//Problem-2 : To print the subarray with maximum sum:-

class Solution{
  public static void subArraySum(int arr[]){
    int n=arr.length;

    int sum=0;
    int max=Integer.MIN_VALUE;
    int start=0,ansStart=-1,ansEnd=-1;

    for(int i=0;i<n;i++){
      if(sum==0)
        start=i;

      sum+=arr[i];

      if(sum>max){
        max=sum;
        ansStart=start;
        ansEnd=i;
      }

      if(sum<0)
        sum=0;
    }

    for(int i=ansStart;i<=ansEnd;i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
