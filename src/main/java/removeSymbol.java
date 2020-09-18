public class removeSymbol {
    public static void main(String[] args) {
        String operator = "\ntekrjlaljak.\"cdjklf\" + \'teksltjel.\'asdjklf * ajksdlf - 2j3kl4@ / asldjf;a";
        System.out.println(operator);
        operator = operator.replaceAll("[<=@,?#>;]",""); //special symbol
        operator = operator.replaceAll("\\\\",""); // \character
        operator = operator.replaceAll("\"",""); //"
        operator = operator.replaceAll("\'",""); //'
        System.out.println(operator);

    }
}
