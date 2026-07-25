// Last updated: 25/07/2026, 22:09:36
1class Solution {
2    public String convertToTitle(int num) {
3        StringBuilder sb=new StringBuilder();
4        while(num>0){
5            num=num-1;
6            int rem=num%26;
7            System.out.println(rem);
8            sb.append((char)(rem+'A'));
9            System.out.println(num/26);
10            num/=26;
11        }
12        return sb.reverse().toString();
13    }
14}