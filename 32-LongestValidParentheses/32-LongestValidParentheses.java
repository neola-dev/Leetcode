// Last updated: 04/06/2026, 11:20:37
class Solution {
    public int longestValidParentheses(String s) {
        int maxLen = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - st.peek());
                }
            }
        }
        return maxLen;
    }
}