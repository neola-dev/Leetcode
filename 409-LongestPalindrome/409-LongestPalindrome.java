// Last updated: 04/06/2026, 11:16:25
class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1)   return 1;
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        boolean oddFound=false;
        int length=0;
        for(int count:hmap.values()){
            if(count%2==0){
                length+=count;
            }
            else{
                length+=count-1;
                oddFound=true;
            }
        }
        if(oddFound){
            length+=1;
        }
        return length;
    } 
}