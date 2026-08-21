// Last updated: 21/08/2026, 08:53:19
1class Solution {
2    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
3        int n=flowers.length;
4        int[] stTime=new int[n];
5        int[] endTime=new int[n];
6        int i=0,j=0;
7        for(int[] each:flowers){
8            int st=each[0];
9            int end=each[1];
10            stTime[i++]=st;
11            endTime[j++]=end;
12        }
13        Arrays.sort(stTime);
14        Arrays.sort(endTime);
15        int len=people.length;
16        int[] res=new int[len];
17        for(i=0;i<len;i++){
18            int x=upperBound(people[i],stTime);
19            int y=lowerBound(people[i],endTime);
20            int ans=Math.abs(x-y);
21            res[i]=ans;
22        }
23        return res;
24    }
25    public int upperBound(int t,int[] stTime){
26        int low=0;
27        int high=stTime.length-1;
28        int ans=stTime.length;
29        while(low<=high){
30            int mid=(low+high)/2;
31            if(stTime[mid]>t){
32                ans=mid;
33                high=mid-1;
34            }
35            else{
36                low=mid+1;
37            }
38        }
39        return ans;
40    }
41    public int lowerBound(int t,int[] endTime){
42        int low=0;
43        int high=endTime.length-1;
44        int ans=endTime.length;
45        while(low<=high){
46            int mid=(low+high)/2;
47            if(endTime[mid]>=t){
48                ans=mid;
49                high=mid-1;
50            }
51            else{
52                low=mid+1;
53            }
54        }
55        return ans;
56    }
57}