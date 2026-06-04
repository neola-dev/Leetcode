// Last updated: 04/06/2026, 11:12:10
class Solution {
    public int minPartitions(String n) {
        int max=Integer.MIN_VALUE;
        for(char ch:n.toCharArray()){
            max=Math.max(max,ch-'0');
        }
        return max;
    }
}