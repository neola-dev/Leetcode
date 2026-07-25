// Last updated: 25/07/2026, 10:05:26
1class Solution {
2    public String intToRoman(int num) {
3        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
4        String[] arr={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
5        StringBuilder res=new StringBuilder();
6        for(int i=0;i<values.length;i++){
7            while(num>=values[i]){
8                res.append(arr[i]);
9                num-=values[i];
10            }
11        }
12        return res.toString();
13    }
14}