package dsa.Math;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 13;
        int[] binary = new int[32];
        int index = 0;

        while (decimal > 0) {
            binary[index] = decimal % 2;
            decimal = decimal / 2;
            index++;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
