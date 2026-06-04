// Last updated: 04/06/2026, 11:18:01
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
        while(n!=1){
            if(hs.contains(n))  return false;
            hs.add(n);
            int sum=0;
            while(n>0){
                int dig=n%10;
                sum+=dig*dig;
                n=n/10;
            }
            n=sum;
        }
        return true;
    }
}