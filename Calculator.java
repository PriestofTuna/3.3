c class Calculator {
public static double getSum(double [] num) {
double sum=0.0;
for(int g=0; g<num.length; g++) {
sum+=num[g];
}
return sum;
}
public static double getAverage(double [] num) {
double sum=0.0;
for(int g=0; g<num.length; g++) {
sum+=num[g];
}
return sum/num.length;
}
public static double getProduct(double [] num) {
double product=1.0;
for(int g=0; g<num.length; g++) {
product*=num[g];
}
return product;
}
}
