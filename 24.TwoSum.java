//Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.
//Each input will have exactly one solution, and the same element cannot be used twice. 

//Method 1:
class Solution{
  public int[] twoSum(int arr[],int target){
    int n=arr.length;
    int ans[]=new int[2];
    
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        if(nums[i]+nums[j]==target){
          ans[0]=i;
          ans[1]=j;
          break;
        }
      }
    }

    return ans;
  }
}

//Method 2: (Optimal approach)

class Solution{
  public int[] twoSum(int arr[],int target){
    HashMap<Integer,Integer> mp=new HashMap<>();

    for(int i=0;i<arr.length;i++){
      int requiredNum=target-arr[i];

      if(mp.containsKey(requiredNum){
        int firstTdx=mp.get(requiredNum);
        int secondIdx=i;

        if(firstIdx<secondIdx)
          return new int[]{firstIdx,secondIdx};
        else
          return new int[]{secondIdx,firstIdx};
      }

      mp.put(arr[i],i);
    }

    return new int[]{-1,-1};
  }
}

