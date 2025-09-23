//Given an N * N 2D integer matrix, rotate the matrix by 90 degrees clockwise.
//The rotation must be done in place, meaning the input 2D matrix must be modified directly.

class Solution{
  private void reverse(int arr[],int start,int end){
    while(start<end){
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
    }
  }
  
  public void rotateMatrix(int matrix[][]){
    int n=matrix.length;

    //Step-1 : Transpose the given matrix
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
      }
    }

    //Step-2 : Reverse each row
    for(int i=0;i<n;i++)
      reverse(matrix[i],0,n-1);
  }
}
