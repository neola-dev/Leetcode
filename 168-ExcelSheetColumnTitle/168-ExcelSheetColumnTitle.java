// Last updated: 04/06/2026, 11:18:21
class Solution {
    public String convertToTitle(int num) {
        StringBuilder str=new StringBuilder();
        while(num>0){
            num--;
            int rem=num%26;
            str.append((char) (rem+'A'));
            num/=26;
        }
        return str.reverse().toString();
    }
}