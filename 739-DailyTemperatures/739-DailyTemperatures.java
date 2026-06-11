// Last updated: 11/06/2026, 13:17:08
1class StockSpanner {
2    Stack<int[]> st;
3    public StockSpanner() {
4        st=new Stack<>();
5    }
6    
7    public int next(int price) {
8        int span=1;
9        while(!st.isEmpty() && st.peek()[0]<=price){
10            span+=st.pop()[1];
11        }
12        st.push(new int[]{price,span});
13        return span;
14    }
15}
16
17/**
18 * Your StockSpanner object will be instantiated and called as such:
19 * StockSpanner obj = new StockSpanner();
20 * int param_1 = obj.next(price);
21 */