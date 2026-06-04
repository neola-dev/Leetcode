// Last updated: 04/06/2026, 11:15:31
class Solution {
    public static String reverse(String str){
        int l=0;
        int r=str.length()-1;
        char[] arr=str.toCharArray();
        while(l<r){
            char t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
        return new String(arr);
    }
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i]=reverse(arr[i]);
        }
        return String.join(" ",arr);
    }
}