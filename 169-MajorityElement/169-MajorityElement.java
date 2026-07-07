// Last updated: 07/07/2026, 11:42:01
1class Solution {
2    public int romanToInt(String s) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        map.put('I',1);
5        map.put('V',5);
6        map.put('X',10);
7        map.put('L',50);
8        map.put('C',100);
9        map.put('D',500);
10        map.put('M',1000);
11        int sum=0;
12        for(int i=0;i<s.length();i++){
13            int curr=map.get(s.charAt(i));
14            if(i+1<s.length() && curr<map.get(s.charAt(i+1))){
15                sum-=curr;
16            }
17            else{
18                sum+=curr;
19            }
20        }
21        return sum;
22    }
23}