// Last updated: 04/06/2026, 11:13:08
class Solution {
    public int dayOfYear(String date) {
        String[] part=date.split("-");
        int year=Integer.parseInt(part[0]);
        int month=Integer.parseInt(part[1]);
        int days=Integer.parseInt(part[2]);
        int[] noDays={31,28,31,30,31,30,31,31,30,31,30,31};
        boolean isLeap=false;
        if(year%400==0 || (year%4==0 && year%100!=0)){
            isLeap=true;
        }
        if(month==1){
            return days;
        }
        int sumDays=0;
        if(isLeap)  noDays[1]=29;
        for(int i=1;i<month;i++){
            sumDays+=noDays[i-1];
        }
        return sumDays+days;
    }
}