//Given an integer array nums. Return all triplets such that:
//i != j, i != k, and j != k
//nums[i] + nums[j] + nums[k] == 0.

//TC: O(NlogN)+O(N^2) = O(N^2)

class Solution{
  public List<List<Integer>> threeSum(int arr[]){
    Arrays.sort(arr);
    List<List<Integer>> ans=new ArrayList<>();
    int n=arr.length;

    for(int i=0;i<n;i++){
      if(i>0 && arr[i]==arr[i-1])
        continue;
      int j=i+1;
      int k=n-1;

      while(j<k){
        int sum=arr[i]+arr[j]+arr[k];

        if(sum<0)
          j++;
        else if(sum>0)
          k--;
        else{
          List<Integer> temp=new ArrayList<>();
          temp.add(arr[i]);
          temp.add(arr[j]);
          temp.add(arr[k]);
          ans.add(temp);
          j++;
          k--;

          while(j<k && arr[j]==arr[j-1])
            j++;

          while(j<k && arr[k]==arr[k+1])
            k--;
        }
      }
    }

    return ans;
  }
}
