// Last updated: 15/06/2026, 15:03:28
1class Solution {
2    public String convert(String s, int numRows) {
3        if(numRows>=s.length())  return s;
4        if(numRows==1)    return s;
5        int len=(s.length()/2)+1;
6        char[][] arr=new char[numRows][len];
7        int i=0,j=0;
8        int k=0;
9        int flag=1;
10        while(i<numRows && j<len && i>=0 && j>=0 && k<s.length()){
11            arr[i][j]=s.charAt(k);
12            if(i==0){
13                flag=1;
14            }
15            if(i==numRows-1){
16                flag=-1;
17            }
18            if(flag==1){
19                i++;
20            }
21            if(flag==-1){
22                i--;
23                j++;
24            }
25            k++;
26        }
27        String ans="";
28        for(i=0;i<numRows;i++){
29            for(j=0;j<len;j++){
30                char ch=arr[i][j];
31                if((int)ch!=0){
32                    ans+=ch;
33                }
34            }
35        }
36        return ans;
37    }
38}