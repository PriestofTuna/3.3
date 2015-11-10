import javax.swing.JOptionPane;
public class CalculatorDriver {
public static void main(String[] args) {
int x, i, z;
String input = JOptionPane.showInputDialog("Enter the number of numbers");
x = Integer.parseInt(input);
double [] num = new double[x];
for(i=0; i<num.length; i++) {
num[i] =Double.parseDouble(JOptionPane.showInputDialog("Enter a number"));
}
System.out.println(Calculator.getSum(num));
System.out.println(Calculator.getAverage(num));
System.out.println(Calculator.getProduct(num));
double n = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a factoral"));
double result = Factorial(n);
System.out.println(result);
}
public static double Factorial(double n) {
double result = 1;
for (int i=1; i <=n; i++) {
result = result *i;
}
return result;
}

}
