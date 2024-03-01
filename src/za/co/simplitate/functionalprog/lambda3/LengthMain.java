package za.co.simplitate.functionalprog.lambda3;

public class LengthMain {

    public static void main(String[] args) {

        LengthOfString lengthOfString = (str) -> {
            int l = str.length();
            System.out.println("length is " + l);
            return l;
        };
        int len  = lengthOfString.length("Zwaks");
        System.out.println(len);
    }
}
