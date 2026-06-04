// Last updated: 04/06/2026, 11:11:52
class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            int lastdig=num.charAt(i)-'0';
            if(lastdig%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}