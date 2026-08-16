// Last updated: 16/08/2026, 21:59:42
1class Solution {
2    public String convert(String s, int numRows) {
3        if(numRows>=s.length() || numRows==1) return s;
4        List<StringBuilder> res=new ArrayList<>();
5        for(int i=0;i<numRows;i++){
6            res.add(new StringBuilder());
7        }
8        int currRow=0;
9        boolean goingDown=true;
10        for(int i=0;i<s.length();i++){
11            char ch=s.charAt(i);
12            res.get(currRow).append(ch);
13            if(currRow==0) goingDown=true;
14            if(currRow==numRows-1) goingDown=false;
15            currRow+=goingDown?1:-1;
16        }
17        StringBuilder ans=new StringBuilder();
18        for(StringBuilder row:res){
19            ans.append(row);
20        }
21        return ans.toString();
22    }
23}