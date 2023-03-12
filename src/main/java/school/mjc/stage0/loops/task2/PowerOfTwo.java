package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count = 0;
        if (power < 0){
            System.out.println("too much power");
        }
        while (count <= power){
            int tmp = 1;
            int result = 1;
            while (tmp <= count){
                result = 2 * result;
                tmp++;
            }
            System.out.println(result);
            count++;
        }
    }
}
