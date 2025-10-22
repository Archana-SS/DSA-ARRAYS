// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

//Method 1: Linear search

class Solution{
  public int search(int nums[],int target){
    for(int i=0;i<nums.length;i++){
      if(nums[i]>=target)
        return i;
    }
    return nums.length;   //if the element is out of bound
  }
}

// Method 2: Binary search

class Solution{
  public int search(int nums[],int target){
    int low=0,high=nums.length-1;

    while(low<=high){
      int mid=low+(high-low)/2;

      if(nums[mid]==target)
        return mid;

      else if(nums[mid]<target)
        low=mid+1;

      else
        high=mid-1;
    }

    return low;  // if the element is not present
  }
}
