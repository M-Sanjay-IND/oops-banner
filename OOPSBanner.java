
public class OOPSBanner {

    public static void main(String[] args) {
        String lines = "";
        lines += String.join("", " ******  ", " ****** ", "   ******  ", "  ******  \n");
        lines += String.join("", "*      * ", "*      *", "  *      * ", " *        \n");
        lines += String.join("", "*      * ", "*      *", "  *      * ", " *        \n");
        lines += String.join("", "*      * ", "*      *", "  *******  ", "  ******  \n");
        lines += String.join("", "*      * ", "*      *", "  *        ", "        * \n");
        lines += String.join("", "*      * ", "*      *", "  *        ", "        * \n");
        lines += String.join("", " ******  ", " ****** ", "  *        ", "  ******  \n");
        System.out.println(lines);
    }
}