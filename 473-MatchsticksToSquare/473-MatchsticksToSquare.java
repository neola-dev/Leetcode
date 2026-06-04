// Last updated: 04/06/2026, 11:16:04
class Solution {
    public boolean makesquare(int[] matchsticks) {
        if(matchsticks.length<4){
            return false;
        }
        int total=0;
        for(int stick:matchsticks)  total+=stick;
        if(total%4!=0)  return false;
        int target=total/4;
        Arrays.sort(matchsticks);
        rev(matchsticks);
        int[] side=new int[4];
        return helper(0,matchsticks,side,target);
    }
    public boolean helper(int ind,int[] matchsticks,int[] side,int target){
        if(ind==matchsticks.length){
            return side[0]==target && side[1]==target && side[2]==target && side[3]==target;
        }
        for(int i=0;i<4;i++){
            if(side[i]+matchsticks[ind]>target)   continue;
            side[i]+=matchsticks[ind];
            if(helper(ind+1,matchsticks,side,target))   return true;
            side[i]-=matchsticks[ind];
            if(side[i]==0) break;
        }
        return false;
    }
    public void rev(int[] matchsticks){
        int i=0;
        int j=matchsticks.length-1;
        while(i<=j){
            int temp=matchsticks[i];
            matchsticks[i]=matchsticks[j];
            matchsticks[j]=temp;
            i++;
            j--;
        }
    }
}