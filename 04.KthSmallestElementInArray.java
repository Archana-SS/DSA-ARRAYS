// Here we make use of priority queue and that too max heap implementation.
//In java there is no implementation for max heap so we need to pass one comparator inside the constructor.

class Solution{
  public static int kthSmallestElement(int arr[]){
    int n=arr.length;
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); //to construct max heap

    //construct max heap for the first k elements (i.e. 0 to k-1)
    for(int i=0;i<k;i++){
      pq.add(arr[i]);
    }

    //for remaining n-k elements (i.e k to n-1)
    for(int i=k;i<n;i++){
      if(arr[i]<pq.peek()){
        pq.poll();
        pq.add(arr[i]);  
      }
    }

    //return top-most element of max heap
    return pq.peek();
  }
}
