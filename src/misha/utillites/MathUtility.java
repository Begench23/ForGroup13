package misha.utillites;

public class MathUtility {
    //method that can return the sum of two integers
    public static int sumNumbers (int num1,int num2){
            int reult;
        reult=num1+num2;

            return reult;
        }

    //method that can return the sum of two integers
    public static double sumNumbers (double num1,double num2){
        double reult;
        reult=num1+num2;

        return reult;
    }

    //method that can return the subtraction of two integers
    public static int subtractionNumbers (int num1,int num2){
        int reult;
        reult=num1-num2;

        return reult;
    }

    //method that can return the subtraction of two integers
    public static double subtractionNumbers (double num1,double num2){
        double reult;
        reult=num1-num2;

        return reult;
    }

    //method that can return the multiplication of two integers
    public static int multiplicationNumbers (int num1,int num2){
        int reult;
        reult=num1*num2;

        return reult;
    }

    //method that can return the multiplication of two integers
    public static double multiplicationNumbers (double num1,double num2) {
        double reult;
        reult = num1 * num2;

        return reult;
    }

    //method that can return the division reslt
    public static int divisionNumbers (int num1,int num2){
        int reult;
        reult=num1/num2;

        return reult;
    }

    //method that can return the division reslt
    public static double divisionNumbers (double num1,double num2){
        double reult;
        reult=num1/num2;

        return reult;
    }

    public static boolean evenNumbers (int num1) {
        boolean reult = false;
        if (num1 % 2 == 0) {
            reult = true;
        }
        return reult;
    }

    public static boolean oddNumbers (int num1) {
        boolean reult = false;
        if (!(num1 % 2 == 0)) {
            reult = true;
        }
        return reult;
    }

    //method that can return the maximum number between two integers
    public static int maximumNumber (int num1,int num2){

        int result = 0;

        if (num1>num2){
            result = num1;
        }else {
            result = num2;
        }
        return result;
    }

    //method that can return the maximum number between two double
    public static double maximumNumber (double num1, double num2){

        double result = 0;

        if (num1>num2){
            result = num1;
        }else {
            result = num2;
        }
        return result;
    }

    //method that can return the minimum number between two integers
    public static int minimumNumber (int num1,int num2){

        int result = 0;

        if (num1<num2){
            result = num1;
        }else {
            result = num2;
        }
        return result;
    }

    //method that can return the minimum number between two double
    public static double minimumNumber (double num1,double num2){

        double result = 0;

        if (num1<num2){
            result = num1;
        }else {
            result = num2;
        }
        return result;
    }

    //method that can return the square of an integer
    public static int squareNumber (int num1){
        int result = 0;

        result = num1*num1;

        return  result;
    }

    //method that can return the square of an integer
    public static double squareNumber (double num1){
        double result = 0;

        result = num1*num1;

        return  result;
    }
    //method that can return the cube of an integer
    public static int cubeNumber (int height, int length, int width){

        int result = 0;

        result = height*length*width;

        return result;
    }

    //method that can return the cube of an double
    public static double cubeNumber (double height, double length, double width){

        double result = 0;

        result = height*length*width;

        return result;
    }
}