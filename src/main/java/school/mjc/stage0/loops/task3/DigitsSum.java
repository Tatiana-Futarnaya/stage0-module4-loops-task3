package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        t=Math.abs(t);
        String str=""+t;
        int sum=0;
        for (int i=0; i<str.length(); i++){
           int x=t%10;
           t=t/10;
           sum=sum+x;
        }
        System.out.println(sum);
    }
}
