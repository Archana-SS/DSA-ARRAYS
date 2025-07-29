Method 1: (Summation method)

class Solution{
  public int missingNumber(int arr[]){
    long s1=0,s2=0;
    int n=arr.length;
    s1=((long)n*(n+1))/2;

    for(int i=0;i<n;i++){
      s2+=arr[i];
    }

    return (int)(s1-s2);
  }
}

Method 2: (XOR Method)

class Solution{
  public int missingNumber(int arr[]){
    int n=arr.length;
    int xor1=0,xor2=0;

    for(int i=0;i<n;i++){
      xor1^=(i+1);
      xor2^=arr[i];
    }

    return xor1^xor2;
  }
}
