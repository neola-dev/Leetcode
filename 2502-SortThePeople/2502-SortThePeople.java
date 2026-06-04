// Last updated: 04/06/2026, 11:11:22
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        boolean swapped;
        for(int i=0;i<heights.length;i++){
            swapped=false;
            for(int j=0;j<heights.length-i-1;j++){
                if(heights[j+1]>heights[j]){
                    int temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;

                    String stemp=names[j];
                    names[j]=names[j+1];
                    names[j+1]=stemp;

                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return names;
    }
}