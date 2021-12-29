package BitManupulasion;

public class BinToDec {
    public static void main(String[] args){
        String Binary="100000";
       int Decimal=98;
        System.out.println(Binary +" Decimal value of "+ getDecimal(Binary));
       // System.out.println(Decimal +" Decimal value of "+ getBinary(Decimal));
        System.out.println(multiple(2));

    }
    public static int getDecimal(String binary){
        int sum=0, len=binary.length();

        for (int i= binary.length()-1; i>=0; i--){
            int value = (binary.charAt(i)-'0');
            sum+=  value * Math.pow(2, ((len-1) - i));

        }
        return sum ;
    }
/*
    public static String getBinary(int Decimal){
        int i=0;
        while(Decimal > Math.pow(2, i))
       // for(int i=0; i<= Decimal)//
    }*/
    public static int multiple(int Number){
        int sum=0;
        while(Number>0){
            sum=sum+7;
            Number--;
        }
        System.out.println(sum);
        return sum;
    }
    public static int leftshift(int Number){
        int sum=0;
        while(Number>0){
            sum=sum+7;
            Number--;
        }
        System.out.println(sum);
        return sum;
    }




}
