//Given an integer r, return all the values in the rth row (1-indexed) in Pascal's Triangle in correct order.

class Solution{
  public List<Integer> pascalTriangle(int r){
    int n=r-1;
    List<Integer> result=new ArrayList<>();
    int ans=1;
    result.add(ans);

    for(int i=0;i<n;i++){
      ans=ans*(n-i);
      ans=ans/(i+1);
      result.add(ans);
    }

    return result;
  }
}
    
