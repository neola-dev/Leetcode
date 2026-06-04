// Last updated: 04/06/2026, 11:10:54
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=x;
        int sum=0;
        while(temp>0){
            int lastDig=temp%10;
            sum+=lastDig;
            temp/=10;
        }
        return (x%sum==0)?sum:-1;
    }
}