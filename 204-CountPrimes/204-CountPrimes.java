// Last updated: 04/06/2026, 11:17:59
class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i<Math.sqrt(n);i++){
            if(isPrime[i]){
                for(int j=i+i;j<n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(isPrime[i]) cnt++;
        }
        return cnt;
    }
}