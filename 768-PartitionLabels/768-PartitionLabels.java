// Last updated: 04/06/2026, 11:14:40
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res=new ArrayList<>();
        int n=s.length();
        int start=0;
        int end=0;
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            end=Math.max(end,arr[s.charAt(i)-'a']);
            if(i==end){
                res.add(end-start+1);
                start=i+1;
            }
        }
        return res;
    }
}