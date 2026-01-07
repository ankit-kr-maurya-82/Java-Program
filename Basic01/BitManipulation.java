public class BitManipulation{
    public static void main(String[] args) {
        // left shift           right shift
        // M<<i                     N>>i
        // 2<<1                     2>>1
        // 010                      010
        // 100                      001
        

        // ------get bit------
        // 0101
        // bit mask: 1<<i
        // operation: AND
        int n = 5;
        int pos = 3;
        int bitmask = 1<<pos;

        if((bitmask & n) ==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }

        // ------set bit-------
        // 0101
        // bit mask: 1<<i
        // operation: OR
        n = 5;   // 0101
        pos = 1;
        bitmask = 1<<pos;

        int newNumber = bitmask | n;

        System.out.println(newNumber);


        // ----------clear bit-----------
        // 0101
        // bit mask: 1<<i
        // operation: AND with NOT
        n = 5;   // 0101
        pos = 2;
        bitmask = 1<<pos;
        int notBitMask = ~(bitmask);
        
        newNumber = notBitMask & n;
        System.out.println(newNumber);


        // update bit
        // 0101

        
        // For 1->0
        // bit mask: 1<<i
        // operation: AND with NOT

        // For 0->1
        // bit mask: 1<<i
        // operation: OR

    }
}