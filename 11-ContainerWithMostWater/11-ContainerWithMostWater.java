// Last updated: 08/06/2026, 23:26:59
1class Solution {
2    public int totalFruit(int[] fruits) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int l=0,r=0,max=0;
5        while(r<fruits.length){
6            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
7            while(map.size()>2){
8                map.put(fruits[l],map.get(fruits[l])-1);
9                if(map.get(fruits[l])<=0)   map.remove(fruits[l]);
10                l++;
11            }
12            max=Math.max(max,(r-l+1));
13            r++;
14        }
15        return max;
16    }
17}