class Solution{
  public static int[] intersectArray(int nums1[],int nums2[]){
    int n1=nums1.length,n2=nums2.length;
    int i=0,j=0;

    ArrayList<Integer> intersection=new ArrayList<>();

    while(i<n1 && j<n2){
      if(nums1[i]<nums2[j])
        i++;
      else if(nums2[j]<nums1[i])
        j++;
      else{
        if(intersection.isEmpty() || intersection.get(intersection.size()-1)!=nums1[i])
          intersection.add(nums1[i]);
        i++;
        j++;
      }
    }

    int ans[]=intersection.stream().mapToInt(k->k).toArray();

    return ans;
  }
}
