// Last updated: 04/06/2026, 11:17:02
class MedianFinder {
    PriorityQueue<Integer> minHeap; //smaller elemts
    PriorityQueue<Integer> maxHeap; //larger elmts
    public MedianFinder() {
        minHeap=new PriorityQueue<>(Collections.reverseOrder());
        maxHeap=new PriorityQueue<>();
    }
    
    public void addNum(int num){
        minHeap.add(num);
        maxHeap.add(minHeap.poll());
        if(minHeap.size()<maxHeap.size()){
            minHeap.add(maxHeap.poll());
        }
    }
    
    public double findMedian() {
        if(minHeap.size()==maxHeap.size()){
            return (minHeap.peek()+maxHeap.peek())/2.0;
        }
        return (double)minHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */