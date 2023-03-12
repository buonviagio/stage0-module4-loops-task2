package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int count = 0;
        String result = "";
        while (count < chars.length) {
            result = result + chars[count];
            count++;
        }
        System.out.println(result);
    }
}
