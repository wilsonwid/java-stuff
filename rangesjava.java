public class rangesjava{
    public static void main(String[] args){

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " +  (myMaxIntValue + 1));
        System.out.println("Integer Maximum Value = " + (myMinIntValue - 1));
        
        System.out.println("Byte Minimum Value = " + Byte.MIN_VALUE);
        System.out.println("Byte Maximum Value = " + Byte.MAX_VALUE);

        System.out.println("Long Minimum Value = " + Long.MIN_VALUE);
        System.out.println("Long Maximum Value = " + Long.MAX_VALUE);
        

        byte thisByte = -38;
        short thisShort = 8403;
        int thisInt = 2304320;
        long thisLong = 50000L + 10L * (thisByte + thisShort + thisInt);
        System.out.println("Long result = " + thisLong);
        System.out.println();

    }
}