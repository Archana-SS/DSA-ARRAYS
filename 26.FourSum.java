//Given an integer array nums and an integer target. Return all quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
//a, b, c, d are all distinct valid indices of nums.
//nums[a] + nums[b] + nums[c] + nums[d] == target.
//Notice that the solution set must not contain duplicate quadruplets. One element can be a part of multiple quadruplets. The output and the quadruplets can be returned in any order.

//TC: O(NlogN)+O(N^3) = O(N^3)

class Solution{
  public List<List<Integer>> fourSum(int arr[],int target){
    List<List<Integer>> ans=new ArrayList<>();
    int n=arr.length;
    Arrays.sort(arr);

    for(int i=0;i<n;i++){
      if(i>0 && arr[i]==arr[i-1])
        continue;

      for(int j=i+1;j<n;j++){
        if(j>i+1 && arr[j]==arr[j-1])
          continue;

        int k=j+1;
        int l=n-1;

        while(k<l){
          int sum=arr[i]+arr[j]+arr[k]+arr[l];  //long sum=(long) arr[i]+arr[j]+arr[k]+arr[l];

          if(sum<target)
            k++;
          else if(sum>target)
            l--;
          else{
            List<Integer> temp=new ArrayList<>();

            temp.add(arr[i]);
            temp.add(arr[j]);
            temp.add(arr[k]);
            temp.add(arr[l]);

            ans.add(temp);

            k++;
            l--;

            while(k<l && arr[k]==arr[k-1])
              k++;
            while(k<l && arr[l]==arr[l+1])
              l--;
          }
        }
      }
    }

    return ans;
  }
}
