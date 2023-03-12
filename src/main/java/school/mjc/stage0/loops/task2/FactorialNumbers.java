package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int result = 1;
        int count = 0;
        System.out.println(count);
        count++;
        while (count <= printToInclusive){
            result = result * count;
            System.out.println(result);
            count++;
        }
    }
}
