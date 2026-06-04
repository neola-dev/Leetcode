// Last updated: 04/06/2026, 11:12:03
class Solution {
    public static int cntFreqSub(String s,int i,int j){
        int[] arr=new int[26];
        for(int k=i;k<=j;k++){
            arr[s.charAt(k)-'a']++;
        }
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int l=0;l<26;l++){
            if(arr[l]>max)  max=arr[l];
            if(arr[l]<min && arr[l]!=0)     min=arr[l];
        }
        return max-min;
    }
    public int beautySum(String s) {
       int n=s.length();
       int cnt=0;
       for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                cnt+=cntFreqSub(s,i,j);
            }
       } 
       return cnt;
    }
}