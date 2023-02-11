package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum=0;
        int result=0;
        if (lengthOfLastNumber != 0) {
            for(int i=0; i<lengthOfLastNumber; i++){
                sum=sum+9*(int)Math.pow(10,i);
                result=result+sum;
            }
        }
        System.out.println(result);
    }
}
