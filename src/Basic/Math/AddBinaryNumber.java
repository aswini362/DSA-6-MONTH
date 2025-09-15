package Basic.Math;

public class AddBinaryNumber {

    public static void main(String[] args) {
        System.out.println(addBinary("1011", "1100"));
    }


    public static String addBinary(String bin1, String bin2) {
        // Initialize variables
        int i = bin1.length() - 1; // Index for bin1
        int j = bin2.length() - 1; // Index for bin2
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += bin1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += bin2.charAt(j) - '0';
                j--;
            }
            result.append(sum % 2);
            carry = sum / 2;
        }
        return result.reverse().toString();
    }
}

