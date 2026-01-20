package ejercicios7_Interfaces2;

import java.util.Scanner;

public class ConsoleInput_Mio {

    private Scanner keyboard;

    public ConsoleInput_Mio(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    // Limpia el buffer
    public void cleanInput() {
        keyboard.nextLine();
    }

    // ---------- INT ----------

    public int readInt() {
        while (true) {
            try {
                int value = keyboard.nextInt();
                cleanInput();
                return value;
            } catch (Exception e) {
                System.out.print("Valor inválido. Introduce un entero: ");
                cleanInput();
            }
        }
    }

    public int readIntLessThan(int upperBound) {
        int value;
        do {
            value = readInt();
        } while (value >= upperBound);
        return value;
    }

    public int readIntLessOrEqualThan(int upperBound) {
        int value;
        do {
            value = readInt();
        } while (value > upperBound);
        return value;
    }

    public int readIntGreaterThan(int lowerBound) {
        int value;
        do {
            value = readInt();
        } while (value <= lowerBound);
        return value;
    }

    public int readIntGreaterOrEqualThan(int lowerBound) {
        int value;
        do {
            value = readInt();
        } while (value < lowerBound);
        return value;
    }

    public int readIntInRange(int lowerBound, int upperBound) {
        int value;
        do {
            value = readInt();
        } while (value < lowerBound || value > upperBound);
        return value;
    }

    // ---------- DOUBLE ----------

    public double readDouble() {
        while (true) {
            try {
                double value = keyboard.nextDouble();
                cleanInput();
                return value;
            } catch (Exception e) {
                System.out.print("Valor inválido. Introduce un número real: ");
                cleanInput();
            }
        }
    }

    public double readDoubleLessThan(double upperBound) {
        double value;
        do {
            value = readDouble();
        } while (value >= upperBound);
        return value;
    }

    public double readDoubleLessOrEqualThan(double upperBound) {
        double value;
        do {
            value = readDouble();
        } while (value > upperBound);
        return value;
    }

    public double readDoubleGreaterThan(double lowerBound) {
        double value;
        do {
            value = readDouble();
        } while (value <= lowerBound);
        return value;
    }

    public double readDoubleGreaterOrEqualThan(double lowerBound) {
        double value;
        do {
            value = readDouble();
        } while (value < lowerBound);
        return value;
    }

    public double readDoubleInRange(double lowerBound, double upperBound) {
        double value;
        do {
            value = readDouble();
        } while (value < lowerBound || value > upperBound);
        return value;
    }

    // ---------- STRING ----------

    public String readString() {
        return keyboard.nextLine();
    }

    public String readString(int maxLength) {
        String text;
        do {
            text = readString();
        } while (text.length() > maxLength);
        return text;
    }

    // ---------- CHAR ----------

    public char readChar() {
        while (true) {
            String input = readString();
            if (input.length() == 1) {
                return input.charAt(0);
            }
            System.out.print("Introduce solo un carácter: ");
        }
    }

    // ---------- BOOLEAN ----------

    public boolean readBooleanUsingChar(char affirmativeValue, char negativeValue) {
        while (true) {
            char value = Character.toLowerCase(readChar());
            if (value == Character.toLowerCase(affirmativeValue)) {
                return true;
            }
            if (value == Character.toLowerCase(negativeValue)) {
                return false;
            }
            System.out.print("Valor inválido. Introduce " 
                    + affirmativeValue + " o " + negativeValue + ": ");
        }
    }
}

