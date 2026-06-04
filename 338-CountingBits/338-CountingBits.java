// Last updated: 04/06/2026, 11:16:49
class Solution {
    public int find(int num){
        int sum=0;
        while(num>0){
            sum+=(num%2);
            num=num/2;
        }
        return sum;
    }
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        res[0]=0;
        if(n+1==1)  return res;
        res[1]=1;   
        for(int i=2;i<=n;i++){
            res[i]=find(i);
        }
        return res;
    }
}