//1. To return a list of unique elements
class Solution{
  public static ArrayList<Integer> removeDuplicates(int arr[]){
    int n=arr.length;
    ArrayList<Integer> ans=new ArrayList<>();
    ans.add(arr[0]);
    for(int i=1;i<n;i++){
      if(arr[i]!=arr[i-1])
        ans.add(arr[i]);
    }
    return ans;
  }
}

//2. To return the number of unique elements
class Solution{
  public static int uniqueElements(int arr[]){
    int n=arr.length;
    int i=0;
    for(int j=1;j<n;j++){
      if(arr[j]!=arr[i]){
        arr[i+1]=arr[j];
        i++;
      }
    }
    return i+1;
  }
}
