// Last updated: 04/06/2026, 11:18:33
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr=s.split("\\s+");
        int l=0;
        int r=arr.length-1;
        while(l<r){
            String t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
        return String.join(" ",arr);
    }
}