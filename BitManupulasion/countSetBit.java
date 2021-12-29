package BitManupulasion;

public class countSetBit {
    public static void main(String[] args){
       // System.out.println(getCountBitSet(12));
        System.out.println(getDiff(4, 6));

    }
   /* public static int getCountBitSet(int n){
        int count =0, pow=1;
        for(int i=0; i<32; i++){
            if((n & pow) > 0){
                count++;
            }
            pow<<=1;
        }
        return count;
    }*/
    public static int getDiff(int n1, int n2){
        int count=0, pow=1;
        while(n1 >0 && n2>0){
        n1=~(n1^n2);
            count++;
        }
        return count;
    }

}
