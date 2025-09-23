//Given an integer n, return the first n (1-Indexed) rows of Pascal's triangle.

class Solution{
  private List<Integer> generateRow(int r){
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
  
  public List<List<Integer>> pascalTriangle(int n){
    List<List<Integer>> result=new ArrayList<>();

    for(int i=1;i<=n;i++){
      result.add(generateRow(i));
    }

    return result;
  }
}
