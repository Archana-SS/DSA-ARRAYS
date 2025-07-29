//1. Problem-1 (Simple question to find maximum number of consecutive ones in given array)

class Solution{
  public static int maxOnes(int arr[]){
    int n=arr.length;
    int count=0,maxCount=0;

    for(int i=0;i<n;i++){
      if(arr[i]==1){
        count++;
        maxCount=Math.max(maxCount,count);
      }
      else{
        count=0;
      }
    }

    return maxCount;
  }
}

//Problem-2 Find max number of consecutive ones if atmost k zeros can be flipped. [SLIDING WINDOW APPROACH]

class Solution{
  public static int maxCount(int arr[],int k){
    int n=arr.length;

    int start=0;
    int zeroCount=0;
    int maxOnes=0;

    for(int end=0;end<n;end++){
      if(arr[end]==0)
        zeroCount++;

      while(zeroCount>k){
        if(arr[start]==0)
          zeroCount--;

        start++;
      }

      maxOnes=Math.max(maxOnes,end-start+1);  //end-start+1 is the window size
    }

    return maxOnes;
  }
}

//Problem-3 Find maximum number of consecutive ones if atmost one zero can be filpped.

class Solution{
  public static int maxCount(int arr[]){
    int n=arr.length;

    int start=0;
    int zeroCount=0;
    int maxOnes=0;

    for(int end=0;end<n;end++){
      if(arr[end]==0)
        zeroCount++;

      while(zeroCount>1){
        if(arr[start]==0)
          zeroCount--;

        start++;
      }

      maxOnes=Math.max(maxOnes,end-start+1);
    }

    return maxOnes;
  }
}
