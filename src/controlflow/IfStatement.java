package controlflow;

import java.util.Arrays;

public class IfStatement {
    public static void main(String[] args) {

        //decision making statement
        //loop statement
        //jump statements

        //1.if 2.switch

        //1.if => boolean => true or false
        int a =10;
        if (a>9){
            System.out.println(a+ "is greater than 9");
            System.out.println(a>9);

        }
        int b= 9;
        if(a>b) {
            System.out.println((a > b) + " first statement");
        }
        else{
                System.out.println((a>b) + "second statement");
            }
        int mark = 70;
        if (mark < 40){
            System.out.println("fail");
        }
        else if(mark>= 40 && mark <= 60){
            System.out.println("pass");

        }
        else if (mark>=60 && mark<= 80 ){
            System.out.println("Destination");
        }else{
            System.out.println("Invalid");
        }

    }
}
