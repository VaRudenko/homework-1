package maine.java;
public class Three {
    public static void main(String... args){
      String operation = args[2];
      int pak1 = Integer.parseInt(args[0]);
      int pak2 = Integer.parseInt(args[1]);


      int result = Calc.calculate(pak1, pak2, operation);
      System.out.println("The result is: " + result);
    }
}
