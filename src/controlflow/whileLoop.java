package controlflow;

public class whileLoop {
    public static void main(String[] args) {

        /*
        while(condition){}
        while(true){}

         */
        int a =5;
        while(a<10){
            System.out.println(a);
            a++;
        }

        //...do while loop..
        do{
            System.out.print(a+"\t");
            a+=2;
        }while(a<20);
        System.out.println();

        int number = 7;
        do{
            System.out.println(number);
            number++;
        }while(number<7);

    }
}
