//We make use of Priority queue and that too min heap to find kth largest element in an array
//In java default priority queue implementation is using min heap itself

public Solution{
  public static int kthLargest(int arr[]){
    int n=arr.length;
    PriorityQueue<Integer> pq=new PriorityQueue<>();

    //construct min heap priority queue for first k elements (i.e. 0 to k-1)
    for(int i=0;i<k;i++){
      pq.add(arr[i]);
    }

    //for remaining n-k elements (i.e. k to n-1)
    for(int i=k;i<n;i++){
      if(arr[i]>pq.peek()){
        pq.poll();  //remove top-most element of priority queue
        pq.add(arr[i]); //insert current element into pq
      }
    }

    return pq.peek(); //return top-most element of pq
  }
}
