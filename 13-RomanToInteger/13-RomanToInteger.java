// Last updated: 04/06/2026, 11:21:04
class Solution {
    public int romanToInt(String s) {
        int size=s.length();
        int sum=0;
        for(int i=0;i<size;i++){
            char ch=s.charAt(i);
            if(ch=='I'){
                if(ch=='I' && i<size-1 && s.charAt(i+1)=='V'){
                    sum+=4;
                    i++;
                }
                else if(ch=='I' && i<size-1 && s.charAt(i+1)=='X'){
                    sum+=9;
                    i++;
                }
                else{
                    sum+=1;
                }
            }
            else if(ch=='X'){
                if(ch=='X' && i<size-1  && s.charAt(i+1)=='L'){
                    sum+=40;
                    i++;
                }
                else if(ch=='X' && i<size-1  && s.charAt(i+1)=='C'){
                    sum+=90;
                    i++;
                }
                else{
                    sum+=10;
                }
            }
            else if(ch=='C'){
                if(ch=='C' && i<size-1  && s.charAt(i+1)=='D'){
                    sum+=400;
                    i++;
                }
                else if(ch=='C' && i<size-1  && s.charAt(i+1)=='M'){
                    sum+=900;
                    i++;
                }
                else{
                    sum+=100;
                }
            }
            else if(ch=='V')    sum+=5;
            else if(ch=='L')    sum+=50;
            else if(ch=='D')    sum+=500;
            else if(ch=='M')    sum+=1000;
            else    sum+=0;
        }
        return sum;
    }
}