// Last updated: 04/06/2026, 11:14:57
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int ans=0;
        for(String s:operations){
            if(s.equals("C")){
                int rm=stack.pop();
                ans-=rm;
            }
            else if(s.equals("D")){
                int elmt=stack.peek()*2;
                stack.push(elmt);
                ans+=elmt;
            }
            else if(s.equals("+")){
                int temp1=stack.pop();
                int temp2=stack.pop();
                int sum=temp1+temp2;
                stack.push(temp2);
                stack.push(temp1);
                stack.push(sum);
                ans+=sum;
            }
            else{
                int num=Integer.parseInt(s);
                stack.push(num);
                ans+=num;
            }
        }
        return ans;
    }
}