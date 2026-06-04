// Last updated: 04/06/2026, 11:13:21
class Solution {
    public int heightChecker(int[] heights) {
        int[] array=Arrays.copyOf(heights, heights.length);
        Arrays.sort(array);
        int cnt=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=array[i])    cnt++;
        }
        return cnt;
    }
}