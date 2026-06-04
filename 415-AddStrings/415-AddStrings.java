// Last updated: 04/06/2026, 11:16:21
class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        StringBuilder str=new StringBuilder();
        while(i>=0 || j>=0 || carry!=0){
            int cnum1=i>=0?num1.charAt(i)-'0':0;
            int cnum2=j>=0?num2.charAt(j)-'0':0;
            int sum=cnum1+cnum2+carry;
            int dig=sum%10;
            str.append((char)(dig+'0'));
            carry=sum/10;
            i--;
            j--;
        }
        str.reverse();
        return str.toString();
    }
}