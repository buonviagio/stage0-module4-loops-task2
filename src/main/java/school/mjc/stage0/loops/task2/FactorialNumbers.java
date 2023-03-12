package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int result = 1;
        int count = 1;
        if(printToInclusive == 0){
            System.out.println(0);
        }
        while (count <= printToInclusive){
            result = result * count;
            System.out.println(result);
            count++;
        }
    }
}
