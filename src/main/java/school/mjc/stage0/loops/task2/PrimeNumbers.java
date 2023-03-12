package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 2;
        while(count <= printToInclusive){
            int countTwo = 1;
            int flag = 0;
            while(countTwo <= count) {
                if (count % countTwo == 0) {
                    flag++;
                }
                countTwo++;
            }
            if(flag == 2) {
                System.out.println(count);
            }
            count++;
        }
    }
}
