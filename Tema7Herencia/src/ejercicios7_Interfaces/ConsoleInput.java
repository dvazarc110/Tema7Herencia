package ejercicios7_Interfaces;

import java.text.Normalizer;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * La clase ConsoleInput. Se utiliza para recibir distintos tipos de inputs desde consola sin que salgan excepciones. Proporciona métodos para convertir los inputs a distintos todos los tipos de primitivos y String.
 *
 * @author Javier Barrero
 * @version 2.0
 * @since 1.0
 */
public class ConsoleInput {
    /**
     * Clase Scanner utilizada para el input
     */
    private final Scanner keyboard;

    /**
     * Constructor de la clase ConsoleInput
     * @param keyboard entrada de teclado a utilizar.
     */
    public ConsoleInput(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    /**
     * Constructor de la clase ConsoleInput
     */
    public ConsoleInput() {
        keyboard = new Scanner(System.in);
    }

    /**
     * Limpia el buffer de keyboard.
     */
    public void cleanInput() {
        keyboard.nextLine();
    }

    /**
     * Elimina las marcas diacríticas de una cadena.
     *
     * @param str cadena a la que se le van a eliminar las marcas diacríticas.
     * @return cadena sin marcas diacríticas.
     */
    private static String stripAccents(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    }

    // Byte
    /**
     * Lee un dato de tipo byte desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @return byte recibido por consola.
     */
    public byte readByte() {
        boolean isValid;
        byte byt = 0;

        do {
            isValid = true;
            try {
                byt = keyboard.nextByte();
            } catch (NumberFormatException | InputMismatchException e) {
                System.err.println("Error en el BYTE");
                isValid = false;
            } finally {
                cleanInput();
            }
        } while (!isValid);

        return byt;
    }

    /**
     * Lee un dato de tipo byte desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param upperBound límite superior que el byte introducido no puede superar.
     * @return byte recibido por consola.
     * @see #readByte()
     */
    public byte readByteLessThan(byte upperBound) {
        byte byt;

        do {
            byt = readByte();
            if (upperBound <= byt) {
                System.err.printf("El BYTE introducido no es menor que %d\n", upperBound);
            }
        } while (upperBound <= byt);

        return (byt);
    }

    /**
     * Lee un dato de tipo byte desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param upperBound límite superior que el byte introducido no puede superar.
     * @return byte recibido por consola.
     * @see #readByte()
     */
    public byte readByteLessOrEqualThan(byte upperBound) {
        byte byt;

        do {
            byt = readByte();
            if (upperBound < byt) {
                System.err.printf("El BYTE introducido no es menor o igual a %d\n", upperBound);
            }
        } while (upperBound < byt);

        return (byt);
    }

    /**
     * Lee un dato de tipo byte desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el byte introducido no puede superar.
     * @return byte recibido por consola.
     * @see #readByte()
     */
    public byte readByteGreaterThan(byte lowerBound) {
        byte byt;

        do {
            byt = readByte();
            if (lowerBound >= byt) {
                System.err.printf("El BYTE introducido no es mayor que %d\n", lowerBound);
            }
        } while (lowerBound >= byt);

        return (byt);
    }

    /**
     * Lee un dato de tipo byte desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el byte introducido no puede superar.
     * @return byte recibido por consola.
     * @see #readByte()
     */
    public byte readByteGreaterOrEqualThan(byte lowerBound) {
        byte byt;

        do {
            byt = readByte();
            if (lowerBound > byt) {
                System.err.printf("El BYTE introducido no es mayor o igual que %d\n", lowerBound);
            }
        } while (lowerBound > byt);

        return (byt);
    }

    /**
     * Lee un dato de tipo byte desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el byte introducido no puede superar.
     * @param upperBound límite superior que el byte introducido no puede superar.
     * @return byte recibido por consola.
     * @see #readByte()
     */
    public byte readByteInRange(byte lowerBound, byte upperBound) {
        byte byt;

        if (lowerBound > upperBound) {
            throw new IllegalArgumentException("\nEl upperBound es menor que el lowerBound");
        } else {
            do {
                byt = readByte();
                if (upperBound < byt || lowerBound > byt) {
                    System.err.printf("El BYTE introducido no esta entre los valores %d y %d\n", lowerBound,
                            upperBound);
                }
            } while ((upperBound < byt || lowerBound > byt));
        }

        return (byt);
    }

    // Short
    /**
     * Lee un dato de tipo short desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @return short recibido por consola.
     */
    public short readShort() {
        boolean isValid;
        short shor = 0;

        do {
            isValid = true;
            try {
                shor = keyboard.nextShort();
            } catch (NumberFormatException | InputMismatchException e) {
                System.err.println("Error en el SHORT");
                isValid = false;
            } finally {
                cleanInput();
            }
        } while (!isValid);

        return shor;
    }

    /**
     * Lee un dato de tipo short desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param upperBound límite superior que el short introducido no puede superar.
     * @return short recibido por consola.
     * @see #readShort()
     */
    public short readShortLessThan(short upperBound) {
        short shor;

        do {
            shor = readShort();
            if (upperBound <= shor) {
                System.err.printf("El SHORT introducido no es menor que %d\n", upperBound);
            }
        } while (upperBound <= shor);

        return (shor);
    }

    /**
     * Lee un dato de tipo short desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param upperBound límite superior que el short introducido no puede superar.
     * @return short recibido por consola.
     * @see #readShort()
     */
    public short readShortLessOrEqualThan(short upperBound) {
        short shor;

        do {
            shor = readShort();
            if (upperBound < shor) {
                System.err.printf("El SHORT introducido no es menor o igual a %d\n", upperBound);
            }
        } while (upperBound < shor);

        return (shor);
    }

    /**
     * Lee un dato de tipo short desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el short introducido no puede superar.
     * @return short recibido por consola.
     * @see #readShort()
     */
    public short readShortGreaterThan(short lowerBound) {
        short shor;

        do {
            shor = readShort();
            if (lowerBound >= shor) {
                System.err.printf("El SHORT introducido no es mayor que %d\n", lowerBound);
            }
        } while (lowerBound >= shor);

        return (shor);
    }

    /**
     * Lee un dato de tipo short desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el short introducido no puede superar.
     * @return short recibido por consola.
     * @see #readShort()
     */
    public short readShortGreaterOrEqualThan(short lowerBound) {
        short shor;

        do {
            shor = readShort();
            if (lowerBound > shor) {
                System.err.printf("El SHORT introducido no es mayor o igual que %d\n", lowerBound);
            }
        } while (lowerBound > shor);

        return (shor);
    }

    /**
     * Lee un dato de tipo short desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el short introducido no puede superar.
     * @param upperBound límite superior que el short introducido no puede superar.
     * @return short recibido por consola.
     * @see #readShort()
     */
    public short readShortInRange(short lowerBound, short upperBound) {
        short shor;

        if (lowerBound > upperBound) {
            throw new IllegalArgumentException("\nEl upperBound es menor que el lowerBound");
        } else {
            do {
                shor = readShort();
                if (upperBound < shor || lowerBound > shor) {
                    System.err.printf("El SHORT introducido no esta entre los valores %d y %d\n", lowerBound,
                            upperBound);
                }
            } while ((upperBound < shor || lowerBound > shor));
        }

        return (shor);
    }

    //Int
    /**
     * Lee un dato de tipo int desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @return int recibido por consola.
     */
    public int readInt() {
        boolean isValid;
        int in = 0;

        do {
            isValid = true;
            try {
                in = keyboard.nextInt();
            } catch (NumberFormatException | InputMismatchException e) {
                System.err.println("Error en el INT");
                isValid = false;
            } finally {
                cleanInput();
            }
        } while (!isValid);
        return in;

    }

    /**
     * Lee un dato de tipo int desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param upperBound límite superior que el int introducido no puede superar.
     * @return int recibido por consola.
     * @see #readInt()
     */
    public int readIntLessThan(int upperBound) {
        int in;

        do {
            in = readInt();
            if (upperBound <= in) {
                System.err.printf("El INT introducido no es menor que %d\n", upperBound);
            }
        } while (upperBound <= in);

        return (in);
    }

    /**
     * Lee un dato de tipo int desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param upperBound límite superior que el int introducido no puede superar.
     * @return int recibido por consola.
     * @see #readInt()
     */
    public int readIntLessOrEqualThan(int upperBound) {
        int in;

        do {
            in = readInt();
            if (upperBound < in) {
                System.err.printf("El INT introducido no es menor o igual a %d\n", upperBound);
            }
        } while (upperBound < in);

        return (in);
    }

    /**
     * Lee un dato de tipo int desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el int introducido no puede superar.
     * @return int recibido por consola.
     * @see #readInt()
     */
    public int readIntGreaterThan(int lowerBound) {
        int in;

        do {
            in = readInt();
            if (lowerBound >= in) {
                System.err.printf("El INT introducido no es mayor que %d\n", lowerBound);
            }
        } while (lowerBound >= in);

        return (in);
    }

    /**
     * Lee un dato de tipo int desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el int introducido no puede superar.
     * @return int recibido por consola.
     * @see #readInt()
     */
    public int readIntGreaterOrEqualThan(int lowerBound) {
        int in;

        do {
            in = readInt();
            if (lowerBound > in) {
                System.err.printf("El INT introducido no es mayor o igual que %d\n", lowerBound);
            }
        } while (lowerBound > in);

        return (in);
    }

    /**
     * Lee un dato de tipo int desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el int introducido no puede superar.
     * @param upperBound límite superior que el int introducido no puede superar.
     * @return int recibido por consola.
     * @see #readInt()
     */
    public int readIntInRange(int lowerBound, int upperBound) {
        int in;

        if (lowerBound > upperBound) {
            throw new IllegalArgumentException("\nEl upperBound es menor que el lowerBound");
        } else {
            do {
                in = readInt();
                if (upperBound < in || lowerBound > in) {
                    System.err.printf("El INT introducido no esta entre los valores %d y %d\n", lowerBound, upperBound);
                }
            } while ((upperBound < in || lowerBound > in));
        }

        return (in);
    }

    // Long
    /**
     * Lee un dato de tipo long desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @return long recibido por consola.
     */
    public long readLong() {
        boolean isValid;
        long lon = 0;

        do {
            isValid = true;
            try {
                lon = keyboard.nextLong();
            } catch (NumberFormatException | InputMismatchException e) {
                System.err.println("Error en el LONG");
                isValid = false;
            } finally {
                cleanInput();
            }
        } while (!isValid);
        return lon;

    }

    /**
     * Lee un dato de tipo long desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param upperBound límite superior que el long introducido no puede superar.
     * @return long recibido por consola.
     * @see #readLong()
     */
    public long readLongLessThan(long upperBound) {
        long lon;

        do {
            lon = readLong();
            if (upperBound <= lon) {
                System.err.printf("El LONG introducido no es menor que %d\n", upperBound);
            }
        } while (upperBound <= lon);

        return (lon);
    }

    /**
     * Lee un dato de tipo long desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param upperBound límite superior que el long introducido no puede superar.
     * @return long recibido por consola.
     * @see #readLong()
     */
    public long readLongLessOrEqualThan(long upperBound) {
        long lon;

        do {
            lon = readLong();
            if (upperBound < lon) {
                System.err.printf("El LONG introducido no es menor o igual a %d\n", upperBound);
            }
        } while (upperBound < lon);

        return (lon);
    }

    /**
     * Lee un dato de tipo long desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el long introducido no puede superar.
     * @return long recibido por consola.
     * @see #readLong()
     */
    public long readLongGreaterThan(long lowerBound) {
        long lon;

        do {
            lon = readLong();
            if (lowerBound >= lon) {
                System.err.printf("El LONG introducido no es mayor que %d\n", lowerBound);
            }
        } while (lowerBound >= lon);

        return (lon);
    }

    /**
     * Lee un dato de tipo long desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el long introducido no puede superar.
     * @return long recibido por consola.
     * @see #readLong()
     */
    public long readLongGreaterOrEqualThan(long lowerBound) {
        long lon;

        do {
            lon = readLong();
            if (lowerBound > lon) {
                System.err.printf("El LONG introducido no es mayor o igual que %d\n", lowerBound);
            }
        } while (lowerBound > lon);

        return (lon);
    }

    /**
     * Lee un dato de tipo long desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el long introducido no puede superar.
     * @param upperBound límite superior que el long introducido no puede superar.
     * @return long recibido por consola.
     * @see #readLong()
     */
    public long readLongInRange(long lowerBound, long upperBound) {
        long lon;

        if (lowerBound > upperBound) {
            throw new IllegalArgumentException("\nEl upperBound es menor que el lowerBound");
        } else {
            do {
                lon = readLong();
                if (upperBound < lon || lowerBound > lon) {
                    System.err.printf("El LONG introducido no esta entre los valores %d y %d\n", lowerBound,
                            upperBound);
                }
            } while ((upperBound < lon || lowerBound > lon));
        }

        return (lon);
    }

    // Float
    /**
     * Lee un dato de tipo float desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @return float recibido por consola.
     */
    public float readFloat() {
        boolean isValid;
        float floa = 0;

        do {
            isValid = true;
            try {
                floa = keyboard.nextFloat();
            } catch (NumberFormatException | InputMismatchException e) {
                System.err.println("Error en el FLOAT");
                isValid = false;
            } finally {
                cleanInput();
            }
        } while (!isValid);
        return floa;

    }

    /**
     * Lee un dato de tipo float desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param upperBound límite superior que el float introducido no puede superar.
     * @return float recibido por consola.
     * @see #readFloat()
     */
    public float readFloatLessThan(float upperBound) {
        float floa;

        do {
            floa = readFloat();
            if (upperBound <= floa) {
                System.err.printf("El FLOAT introducido no es menor que %f\n", upperBound);
            }
        } while (upperBound <= floa);

        return (floa);
    }

    /**
     * Lee un dato de tipo float desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param upperBound límite superior que el float introducido no puede superar.
     * @return float recibido por consola.
     * @see #readFloat()
     */
    public float readFloatLessOrEqualThan(float upperBound) {
        float floa;

        do {
            floa = readFloat();
            if (upperBound < floa) {
                System.err.printf("El FLOAT introducido no es menor o igual a %f\n", upperBound);
            }
        } while (upperBound < floa);

        return (floa);
    }

    /**
     * Lee un dato de tipo float desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el float introducido no puede superar.
     * @return float recibido por consola.
     * @see #readFloat()
     */
    public float readFloatGreaterThan(float lowerBound) {
        float floa;

        do {
            floa = readFloat();
            if (lowerBound >= floa) {
                System.err.printf("El FLOAT introducido no es mayor que %f\n", lowerBound);
            }
        } while (lowerBound >= floa);

        return (floa);
    }

    /**
     * Lee un dato de tipo float desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el float introducido no puede superar.
     * @return float recibido por consola.
     * @see #readFloat()
     */
    public float readFloatGreaterOrEqualThan(float lowerBound) {
        float floa;

        do {
            floa = readFloat();
            if (lowerBound > floa) {
                System.err.printf("El FLOAT introducido no es mayor o igual que %f\n", lowerBound);
            }
        } while (lowerBound > floa);

        return (floa);
    }

    /**
     * Lee un dato de tipo float desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el float introducido no puede superar.
     * @param upperBound límite superior que el float introducido no puede superar.
     * @return float recibido por consola.
     * @see #readFloat()
     */
    public float readFloatInRange(float lowerBound, float upperBound) {
        float floa;

        if (lowerBound > upperBound) {
            throw new IllegalArgumentException("\nEl upperBound es menor que el lowerBound");
        } else {
            do {
                floa = readFloat();
                if (upperBound < floa || lowerBound > floa) {
                    System.err.printf("El FLOAT introducido no esta entre los valores %f y %f\n", lowerBound,
                            upperBound);
                }
            } while ((upperBound < floa || lowerBound > floa));
        }

        return (floa);
    }

    // Double
    /**
     * Lee un dato de tipo double desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @return double recibido por consola.
     */
    public double readDouble() {
        boolean isValid;
        double doubl = 0;

        do {
            isValid = true;
            try {
                doubl = keyboard.nextDouble();
            } catch (NumberFormatException | InputMismatchException e) {
                System.err.println("Error en el DOUBLE");
                isValid = false;
            } finally {
                cleanInput();
            }
        } while (!isValid);
        return doubl;

    }

    /**
     * Lee un dato de tipo double desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param upperBound límite superior que el double introducido no puede superar.
     * @return double recibido por consola.
     * @see #readDouble()
     */
    public double readDoubleLessThan(double upperBound) {
        double doubl;

        do {
            doubl = readDouble();
            if (upperBound <= doubl) {
                System.err.printf("El DOUBLE introducido no es menor que %f\n", upperBound);
            }
        } while (upperBound <= doubl);

        return (doubl);
    }

    /**
     * Lee un dato de tipo double desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param upperBound límite superior que el double introducido no puede superar.
     * @return double recibido por consola.
     * @see #readDouble()
     */
    public double readDoubleLessOrEqualThan(double upperBound) {
        double doubl;

        do {
            doubl = readDouble();
            if (upperBound < doubl) {
                System.err.printf("El DOUBLE introducido no es menor o igual a %f\n", upperBound);
            }
        } while (upperBound < doubl);

        return (doubl);
    }

    /**
     * Lee un dato de tipo double desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el double introducido no puede superar.
     * @return double recibido por consola.
     * @see #readDouble()
     */
    public double readDoubleGreaterThan(double lowerBound) {
        double doubl;

        do {
            doubl = readDouble();
            if (lowerBound >= doubl) {
                System.err.printf("El DOUBLE introducido no es mayor que %f\n", lowerBound);
            }
        } while (lowerBound >= doubl);

        return (doubl);
    }

    /**
     * Lee un dato de tipo double desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el double introducido no puede superar.
     * @return double recibido por consola.
     * @see #readDouble()
     */
    public double readDoubleGreaterOrEqualThan(double lowerBound) {
        double doubl;

        do {
            doubl = readDouble();
            if (lowerBound > doubl) {
                System.err.printf("El DOUBLE introducido no es mayor o igual que %f\n", lowerBound);
            }
        } while (lowerBound > doubl);

        return (doubl);
    }

    /**
     * Lee un dato de tipo double desde el teclado y vuelve a pedir un input en caso de que el input introducido no se pueda transformar a tipo byte.
     * @param lowerBound límite inferior que el double introducido no puede superar.
     * @param upperBound límite superior que el double introducido no puede superar.
     * @return double recibido por consola.
     * @see #readDouble()
     */
    public double readDoubleInRange(double lowerBound, double upperBound) {
        double doubl;

        if (lowerBound > upperBound) {
            throw new IllegalArgumentException("\nEl upperBound es menor que el lowerBound");
        } else {
            do {
                doubl = readDouble();
                if (upperBound < doubl || lowerBound > doubl) {
                    System.err.printf("El DOUBLE introducido no esta entre los valores %f y %f\n", lowerBound,
                            upperBound);
                }
            } while ((upperBound < doubl || lowerBound > doubl));
        }

        return (doubl);
    }

    //Char
    public char readChar() {
        String str;
        char cha = ' ';
        boolean isValid;

        do {
            isValid = true;
            str = keyboard.nextLine();
            if (str.length() == 1) {
                cha = str.charAt(0);
            } else {
                System.err.println("Error en el CHAR");
                isValid = false;
            }
        } while (!isValid);

        return cha;
    }

    public char readChar(String validCharacters) {
        String cha;

        do {
            cha = String.valueOf(readChar());
            if (!cha.matches(validCharacters)) {
                System.err.println("El carácter no esta dentro del rango especificado");
            }

        } while (!cha.matches(validCharacters));

        return cha.charAt(0);
    }

    public char readVowel() {
        String cha;

        do {
            cha = String.valueOf(readChar());
            stripAccents(cha.toLowerCase()).matches("[aeiou]");
            if (!stripAccents(cha.toLowerCase()).matches("[aeiou]")) {
                System.err.println("El carácter introducido no es una vocal");
            }
        } while (!stripAccents(cha.toLowerCase()).matches("[aeiou]"));

        return cha.charAt(0);
    }

    public char readDigit() {
        return (readChar("[0-9]"));
    }

    public char readLowerCase() {
        String cha;

        do {
            cha = String.valueOf(readChar());
            stripAccents(cha).matches("[a-z]");
            if (!stripAccents(cha).matches("[a-z]")) {
                System.err.println("El carácter introducido no es una letra en minúscula");
            }
        } while (!stripAccents(cha).matches("[a-z]"));

        return cha.charAt(0);
    }

    public char readUpperCase() {
        String cha;

        do {
            cha = String.valueOf(readChar());
            stripAccents(cha).matches("[A-Z]");
            if (!stripAccents(cha).matches("[A-Z]")) {
                System.err.println("El carácter introducido no es una letra en mayúscula");
            }
        } while (!stripAccents(cha).matches("[A-Z]"));

        return cha.charAt(0);
    }

    //String
    public String readString() {
        return keyboard.nextLine();
    }

    public String readString(int maxLength) {
        String str;

        if (maxLength < 0) {
            throw new IllegalArgumentException("\nmaxLength es menor que 0");
        }
        do {
            str = readString();
            if (str.length() > maxLength) {
                System.err.println("El tamaño del STRING es mayor al especificado");
            }
        } while (str.length() > maxLength);

        return str;
    }

    //Boolean
    public boolean readBooleanUsingChar(char affirmativeValue) {
        return readChar() == affirmativeValue;
    }

    public boolean readBooleanUsingChar() {
        return readBooleanUsingChar('s');
    }

    public boolean readBooleanUsingChar(char affirmativeValue, char negativeValue) {
        boolean bool = true, isValid = false;
        char cha;

        do {
            cha = readChar();
            if (cha == affirmativeValue) {
                isValid = true;

            } else if (cha == negativeValue) {
                bool = false;
                isValid = true;

            } else {
                System.err.println("El CHAR especificado no sirve, introduzca " + affirmativeValue + " para TRUE o "
                        + negativeValue + " para FALSE");
            }
        } while (!isValid);

        return bool;
    }

    public boolean readBooleanUsingInt(int affirmativeValue) {
        return readInt() == affirmativeValue;
    }

    public boolean readBooleanUsingInt() {
        return readBooleanUsingInt(1);
    }

    public boolean readBooleanUsingInt(int affirmativeValue, int negativeValue) {
        boolean bool = true, isValid = false;
        int in;

        do {
            in = readInt();
            if (in == affirmativeValue) {
                isValid = true;
            } else if (in == negativeValue) {
                bool = false;
                isValid = true;
            } else {
                System.err.println("El INT especificado no sirve, introduzca '" + affirmativeValue + "' para TRUE o '"
                        + negativeValue + "' para FALSE");
            }
        } while (!isValid);

        return bool;
    }
}