//Given two integers r and c, return the value at the rth row and cth column (1-indexed) in a Pascal's Triangle.

class Solution{
  private int ncr(int n,int r){
    int ans=1;
    for(int i=0;i<r;i++){
      ans=ans*(n-i);
      ans=ans/(i+1);
    }
    return ans;
  }
  
  public int pascalTriangle(int r,int c){
    return ncr(r-1,c-1);
  }
}
