package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int n0=0;
        int n1=0;
        int n2;

        for(int i=0; i<lastFibonacci;i++){
            if(i==1 || i==2){
                n0=1;
                n1=1;
                System.out.println(n0);
            }else{
                n2=n0+n1;
                System.out.println(n2);
                n0=n1;
                n1=n2;
            }

        }
    }
}
