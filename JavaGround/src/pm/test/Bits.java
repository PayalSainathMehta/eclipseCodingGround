package pm.test;

public class Bits {
    public boolean isOneBitCharacter(int[] bits) {
        int ones = 0;
        for(int i = bits.length - 2; i >= 0 && bits[i] != 0; i--)
            ones++;
        if(ones%2 == 0)
            return true;
        return false;
    }
    
    public static void main(String args[])
    {
    	Bits obj = new Bits();
    	int a[] = {1,0,1,0};
    	boolean res = obj.isOneBitCharacter(a);
    	System.out.println(res);
    }
}
