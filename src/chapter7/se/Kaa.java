package chapter7.se;

public class Kaa {
    private int[][] screen = new int[5][4];

    public void clear() {
        screen = new int[5][4];
    }

    public int[][] getScreen() {
        return screen;
    }

    public void writeOnA() {
        for (int i = 0; i < 4; i++) screen[0][i] = 1;

    }

    public void writeOnB() {
        for (int i = 0; i < 3; i++) screen[i][3] = 1;
    }

    public void writeOnC() {
        for (int i = 2; i < 5; i++) screen[i][3] = 1;
    }

    public void writeOnD() {
        for (int i = 0; i < 4; i++) screen[4][i] = 1;
    }

    public void writeOnE() {
        for (int i = 2; i < 5; i++) screen[i][0] = 1;
    }

    public void writeOnF() {
        for (int i = 0; i < 3; i++) screen[i][0] = 1;
    }

    public void writeOnG() {
        for (int i = 0; i < 4; i++) screen[2][i] = 1;
    }


    public void dispay() {
        for (var a : screen) {
            for (var b : a) {
                if (b == 1) {
                    System.out.print("# ");
                }
                if (b == 0) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void setScreen(String userInput) {
        validate(userInput);
        boolean lastBitIsZero = userInput.charAt(userInput.length() - 1) != '1';
        if (lastBitIsZero) clear();
        else process(userInput);
    }

    private void process(String userInput) {
        if (userInput.length() < 8) userInput = addTrailingZerosTo(userInput);
        parse(userInput);

    }

    private String addTrailingZerosTo(String userInput) {
        int input = Integer.parseInt(userInput);
        userInput = String.format("%08d", input);
        return userInput;
    }
//         System.out.println(userInput);

    private void validate(String userInput) {
        checkThatUserInputIsGreaterThan8Digits(userInput);
        for (var charr: userInput.toCharArray()) {
            if(charr != '1' && charr != '0') throw new IllegalArgumentException();
        checkThatAllInputAreBitsFor(userInput);
    }

}

    private void checkThatUserInputIsGreaterThan8Digits(String userInput) {
        if (userInput.length() > 8)
            throw new IllegalArgumentException("User input is too large; \n expected < 8 \n found" + userInput.length());
    }

    private void checkThatAllInputAreBitsFor(String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            char character = userInput.charAt(i);
            if (character != '0' && character != '1')
                throw new IllegalArgumentException("Input at " + (i + 1) + "is invalid");
        }
    }

    private void parse(String userInput) {
        if (userInput.charAt(0) == '1') writeOnA();
        if (userInput.charAt(1) == '1') writeOnB();
        if (userInput.charAt(2) == '1') writeOnC();
        if (userInput.charAt(3) == '1') writeOnD();
        if (userInput.charAt(4) == '1') writeOnE();
        if (userInput.charAt(5) == '1') writeOnF();
        if (userInput.charAt(6) == '1') writeOnG();
    }
}
