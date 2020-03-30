public class MainProgram {
    public static void main(String[] args)throws Exception {
        StringCalculator SC = new StringCalculator();


//      Create an add function that can handle up to two integers passed in as a string
        System.out.println("add function that can handle up to two integers passed in as a string.");
        System.out.println(SC.add(""));
        System.out.println(SC.add("1"));
        System.out.println(SC.add("1,1"));
        System.out.println("-------------------------------------------");

//      Modify the add function to handle multiple integers
        System.out.println("add function to handle multiple integers.");
        System.out.println(SC.add("1,2,3,4"));
        System.out.println(SC.add(" "));
        System.out.println(SC.add("1"));
        System.out.println(SC.add("1,1"));
        System.out.println("-------------------------------------------");

//      Modify the add function so that it can handle new lines between integers.
        System.out.println("add function to handle new lines between integers.");
        System.out.println(SC.add("1\n2,3"));
        System.out.println("-------------------------------------------");

//      Modify the add function so that it can handle different delimiters
        System.out.println("add function so that it can handle different delimiters.");
        System.out.println(SC.add("//;\n1;2"));
        System.out.println(SC.add("//4\n142"));
        System.out.println("-------------------------------------------");

//       Modify the add function so that it can handle negative integers.
        System.out.println("add function so that it can handle negative integers");
        System.out.println(SC.add("-1,-2,3,4"));
        System.out.println("-------------------------------------------");

//      Modify the add function so that it ignores integers greater than or equal to 1000.
        System.out.println("Modify the add function so that it ignores integers greater than or equal to 1000");
        System.out.println(SC.add("//\n1000,1,2"));
        System.out.println("-------------------------------------------");

//      Modify the add function so that it can support delimiters of any length
        System.out.println("add function so that it can support delimiters of any length");
        System.out.println(SC.add("//***\n1***2***3"));
        System.out.println("-------------------------------------------");

//      Modify the add function so that it is able to support different delimiters of any length
        System.out.println("add function so that it is able to support different delimiters of any length");
        System.out.println(SC.add("//[:D][%]\n1:D2%3"));
        System.out.println(SC.add("//[***][%%%]\n1***2%%%3"));
        System.out.println(SC.add("//[(-_-')][%]\n1(-_-')2%3"));
        System.out.println(SC.add("//[abc][777][:(]\n1abc27773:(1"));
        System.out.println("-------------------------------------------");

//      Modify the add function so that it can handle invalid input.
        System.out.println("add function so that it can handle invalid input");
        System.out.println(SC.add("//;\n1000;1;2;"));
        System.out.println(SC.add("   //;\n1000,1;2"));
        System.out.println(SC.add("1,2,3//;\n1000,1;2"));
        System.out.println("------------------------------------------------");
      }
    }