public class Main {
    public static void main(String[] args) {
        LetterCounter lc = new LetterCounter();
        lc.addFile("./sample.txt");
        lc.writeRate("./output.txt");
    }
}
