package Bit_Manipulation;

/**
 * For the binary representation of a decimal. Do the following steps:
 *
 * 1) Double the input decimal
 * 2) if >= 1
 *  2.1) append 1 to the result and input = doubledInput -1
 * 3) if < 1
 *  3.1)append 0 to result and input = doubleInput
 *  4) Do that until input == 0
 */
public class Q2 {

    public static String printBinary(double number){
        if(number<0 || number>1)
            return "ERROR";
        StringBuilder binary = new StringBuilder();
        binary.append("0.");

        while(number>0){
            if(binary.length()>=32)
                return "ERROR";
            double doubleNumber = number*2;

            if(doubleNumber>=1){
                binary.append("1");
                number = doubleNumber -1.0 ;
            } else{
                binary.append("0");
                number = doubleNumber;
            }

        }
        return binary.toString();
    }
}
