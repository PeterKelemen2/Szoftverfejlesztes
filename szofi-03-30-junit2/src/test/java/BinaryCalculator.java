import java.util.InvalidPropertiesFormatException;

public class BinaryCalculator {

    public String binaryAdd(String a, String b){
        int tmp1 = Integer.parseInt(a,2);
        int tmp2 = Integer.parseInt(b,2);
        int sum = tmp1 + tmp2;
        return Integer.toBinaryString(sum);
        // mindet így megcsinálni elvileg
    }

    public String binarySubs(String a, String b){
        return null;
    }

    public String binaryMult(String a, String b){
        return null;
    }

    public String binaryDiv(String a, String b){

    }
}
