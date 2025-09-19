package dsa.Math;

public class BinaryToDecimal {

    public static void main(String[] args) {
        String binary="1011";
        int decimal=0;
        int base=1;
        for(int i=binary.length()-1;i>=0;i--){
            char bit = binary.charAt(i);
            if(bit=='1'){
                decimal+=base;
            }
          base=base*2;
        }
        System.out.println(decimal);
    }
}
