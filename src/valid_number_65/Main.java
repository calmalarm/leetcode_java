package valid_number_65;

public class Main {
    public static void main(String[] args) {
        System.out.println(". (false): " + Solution.isNumber("."));
        System.out.println("0: " + Solution.isNumber("0"));
        System.out.println("-002: " + Solution.isNumber("-002"));
        System.out.println("0.: " + Solution.isNumber("0."));
        System.out.println("10.2: " + Solution.isNumber("10.2"));
        System.out.println("-.99: " + Solution.isNumber("-.99"));
        System.out.println("+1.E-098: " + Solution.isNumber("+1.E-098"));
        System.out.println("--2 (false): " + Solution.isNumber("--2"));
        System.out.println(".e6 (false): " + Solution.isNumber(".e6"));
        System.out.println(".8e.5 (false): " + Solution.isNumber(".8e.5"));
        System.out.println("+11.99e-.862 (false): " + Solution.isNumber("+11.99e-.862"));
        System.out.println("+253.0560e-003400: " + Solution.isNumber("+253.0560e-003400"));
        System.out.println("6e6.5 (false): " + Solution.isNumber("6e6.5"));

    }
}

//"."
//"0"
//"-002"
//"0."
//"10.2"
//"-.99"
//"+1.E-098"
//"--2"
//".e6"
//".8e.5"
//"+11.99e-.862"
//"+253.0560e-003400"
//"6e6.5"