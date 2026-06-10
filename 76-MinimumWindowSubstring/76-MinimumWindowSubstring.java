// Last updated: 10/06/2026, 12:20:43
1class MinStack {
2    Stack<Integer> st;
3    Stack<Integer> minSt;
4    public MinStack() {
5        st=new Stack<>();
6        minSt=new Stack<>();
7    }
8    
9    public void push(int value) {
10        st.push(value);
11        if(minSt.isEmpty()){
12            minSt.push(value);
13        }
14        else{
15            minSt.push(Math.min(value,minSt.peek()));
16        }
17    }
18    
19    public void pop() {
20        st.pop();
21        minSt.pop();
22    }
23    
24    public int top() {
25        return st.peek();
26    }
27    
28    public int getMin() {
29        return minSt.peek();
30    }
31}
32
33/**
34 * Your MinStack object will be instantiated and called as such:
35 * MinStack obj = new MinStack();
36 * obj.push(value);
37 * obj.pop();
38 * int param_3 = obj.top();
39 * int param_4 = obj.getMin();
40 */