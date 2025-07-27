//Here we make use of one hashset

class Solution{
  public static int[] intersectArray(int nums1[],int nums2[]){
    ArrayList<Integer> ans=new ArrayList<>();
    HashSet<Integer> st=new HashSet<>();

    //first we convert nums2 array into hashset
    for(int n2:nums2){
      st.add(n2);
    }

    //then we are traversing each element of first array and looking for it in the hashset. If that element is present in hashset as well, then we add that element into list and remove that element from hashset to avoid duplicate elements.
    for(int n1:nums1){
      if(st.contains(n1)){
        ans.add(n1);
        st.remove(n1);
      }
    }

    int res[]=new int[ans.size()];

    //to convert list into array
    for(int i=0;i<ans.size();i++){
      res[i]=ans.get(i);
    }

    return res;
  }
}

    
