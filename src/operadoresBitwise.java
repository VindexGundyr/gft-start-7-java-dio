public class operadoresBitwise {
    public static void main(String[] args){


        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação %s (representação binária %s) \n", value1, binary1);
//        var value2 = 2;
//        var binary2 = Integer.toBinaryString(value1);
//        System.out.printf("Segundo número da operação %s (representação binária %s) \n", value2, binary2);
//        var result = value1 ^ value2;
//        var binaryResult = Integer.toBinaryString(result);
//        System.out.printf("%s ^ %s = %s\n", value1, value2, result, binaryResult );
        var result = ~value1;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" ~%s = %s (representação binária %s)\n", value1, result, binaryResult);
        //System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));

    }
    /*
    0 = false
    1 = true

     */

}
