class Solution{
  public static int[] unionArray(int nums1[],int nums2[]){
    int n1=nums1.length;
    int n2=nums2.length;
    int i=0,j=0;
    ArrayList<Integer> union=new ArrayList<>();

    while(i<n1 && j<n2){
      if(nums1[i]<=nums2[j]){
        if(union.isEmpty() || union.get(union.size()-1)!=nums1[i]) // to avoid duplicate elements
          union.add(nums1[i]);
        i++;
      }
      else{
        if(union.isEmpty() || union.get(union.size()-1)!=nums2[j])
          union.add(nums2[j]);
        j++;
      }
    }

    while(i<n1){
      if(union.isEmpty() || union.get(union.size()-1)!=nums1[i])
        union.add(nums1[i]);
      i++;
    }

    while(j<n2){
      if(union.isEmpty() || union.get(union.size()-1)!=nums2[j])
        union.add(nums2[j]);
      j++;
    }

    int ans[]=union.stream().mapToInt(k->k).toArray();  //to convert list into array

    return ans;
  }
}

  
