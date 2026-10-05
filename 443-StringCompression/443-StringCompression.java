// Last updated: 05/10/2026, 16:28:07
1class Solution {
2    public int compress(char[] chars) {
3        int n=chars.length;
4        int write=0;
5        int i=0;
6        while(i<n){
7            int cnt=0;
8            char ch=chars[i];
9            while(i<n && ch==chars[i]){
10                cnt++;
11                i++;
12            }
13            chars[write++]=ch;
14            if(cnt>1){
15                String str=String.valueOf(cnt);
16                for(char c:str.toCharArray()){
17                    chars[write++]=c;
18                }
19            }
20        }
21        return write;
22    }
23}