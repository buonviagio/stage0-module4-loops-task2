package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        if (multiplyByAndToInclusive == 0){
           return;
        } else if (multiplyByAndToInclusive <= 0){
            while (count >= multiplyByAndToInclusive){
                System.out.println(count * multiplyByAndToInclusive * -1);
                count--;
            }
        } else {
            while (count <= multiplyByAndToInclusive) {
                System.out.println(count * multiplyByAndToInclusive);
                count++;
            }
        }
    }
}
