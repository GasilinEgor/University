package pr7.second;

public interface StringInterface {
    static int countOfChar(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            count++;
        }
        return  count;
    }


    static String oddString(String line) {
        String newLine = "";
        for (int i = 1; i < line.length(); i += 2) {
            newLine = newLine + line.charAt(i);
        }
        return newLine;
    }


    static String reverse(String line) {
        String newLine = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            newLine += line.charAt(i);
        }
        return newLine;
    }
}
