package controlflow;

public class Switch {
    public static void main(String[] args) {
        int a =5;
        switch (a) {
            case 1:
                System.out.println(a + " is equal to 1");
                break;
            case 2:
                System.out.println(a + " is equal to 2");
                break;
            case 3:
                System.out.println(a + " is equal to 3");
                break;
            case 4:
                System.out.println(a + " is equal to 4");
                break;
            case 5:
                System.out.println(a + " is equal to 5");
                break;
            default:
            System.out.println(a + " is invalid");

        }
        String day = "Wednesday";
        String str = " is weekday";
        switch(day){  // can use type(byte, int , string,char) in expression
            case "Monday":
            case "Thursday":
                System.out.println(day + str);
                break;
            case "Tuesday":
                System.out.println(day + str);
                break;
            case "Wednesday":
                System.out.println(day + str);
                break;
            case "Friday":
                System.out.println(day + str);
                break;
            default:
                System.out.println("Something wrong.");

        }

    }

}
