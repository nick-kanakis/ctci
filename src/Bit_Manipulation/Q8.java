package Bit_Manipulation;

/**
 * > Width is in pixels
 */
public class Q8 {

    public static byte[] drawLine(byte[] screen, int width, int x1, int x2, int y){

       int startByteOffset = x1 % 8;
       int firstFullByte = x1/8;
       if(startByteOffset != 0)
           firstFullByte++;

        int endByteOffset = x2 % 8;
        int lastFullByte = x2/8;
        if(endByteOffset != 7)
            lastFullByte--;

        //set full bytes to 1s
        for (int i = firstFullByte; i <= lastFullByte; i++) {
            //width is in pixels
            screen[(width/8)*y+i] = (byte) 0xFF;
        }

        byte maskOfStartingByte = (byte) (0xFF >> startByteOffset);
        byte maskOfEndingByte = (byte) ~(0xFF >> (endByteOffset + 1));

        //set 1st and final byte
        if(((x1/8) == (x2/8))){
            //If they are in the same byte
            byte mask = (byte) (maskOfStartingByte & maskOfEndingByte);
            screen[(width/8)*y + (x1/8)] |= mask;
        } else {
            //Set starting byte if there is no offset then it is a full byte and it was set previously
            if(startByteOffset != 0){
                int bytePosition = (width/8)*y + firstFullByte - 1;
                screen[bytePosition] |= maskOfStartingByte;
            }
            if(endByteOffset != 7){
                int bytePosition = (width/8)*y + lastFullByte + 1;
                screen[bytePosition] |= maskOfEndingByte;
            }
        }
        return screen;
    }
}
