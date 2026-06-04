// Last updated: 04/06/2026, 11:16:30
class Solution {
    public String decodeString(String s) {
        Stack<String> strSt=new Stack<>();
        Stack<Integer> cntSt=new Stack<>();
        int num=0;
        String curr=new String();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((int)ch>=48 && (int)ch<=57){
                num=num*10+ch-'0';
            }
            else if(ch=='['){
                cntSt.push(num);
                strSt.push(curr);
                num=0;
                curr="";
            }
            else if(ch==']'){
                int rep=cntSt.pop();
                String string=strSt.pop();
                StringBuilder temp=new StringBuilder(string);
                for(int j=0;j<rep;j++){
                    temp.append(curr);
                }
                curr=temp.toString();
            }
            else{
                curr+=ch;
            }
        }
        return curr;
    }
}