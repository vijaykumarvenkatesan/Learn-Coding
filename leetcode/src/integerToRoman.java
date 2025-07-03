public class integerToRoman {
    public static void main(String[] args) {
        int num =124;
        int[] base = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] roman ={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"} ;

        int i = base.length-1;

        StringBuilder romanLetter = new StringBuilder();
        while(num>0){
            int div = num/base[i];
            while(div-->0) romanLetter.append(roman[i]);

            num %=base[i];
            i--;
        }
//        return romanLetter.toString();
    }
}
