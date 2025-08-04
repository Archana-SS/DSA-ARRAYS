//Problem type 1: Return true if there is a subarray whose sum equals K, otherwise false.
class Solution{
  public static boolean subarraySumEqualsK(int arr[],int k){
    int n=arr.length;
    
    HashSet<Integer> set=new HashSet<>();  //We can use hashset here instead of hashmap because we are worried about count/index over here.
    set.add(0);

    int sum=0;

    for(int i=0;i<n;i++){
      sum+=arr[i];
      int rem=sum-k;

      if(set.contains(rem))
        return true;

      set.add(sum);
    }
    return false;
  }

  //Problem type 2: Return total number of subarrays whose sum equals K
  class Solution{
    public static int subarraySumEqualsK(int arr[],int k){
      int n=arr.length;

      HashMap<Integer,Integer> map=new HashMap<>();
      map.put(0,1);
      int sum=0;
      int count=0;

      for(int i=0;i<n;i++){
        sum+=arr[i];
        int rem=sum-k;

        if(map.containsKey(rem))
          count+=map.get(rem);

        map.put(sum,map.getOrDelfault(sum,0)+1);
      }
      return count;
    }
  }
  
  
