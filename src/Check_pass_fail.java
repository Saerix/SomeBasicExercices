//Exercise CheckPassFail (if-else): Write a program called CheckPassFail which prints "PASS"
// if the int variable "number" is more than or equal to 50; or prints "FAIL" otherwise.
// The program shall always print “DONE” before exiting.

public class Check_pass_fail {
    static private int number=Count.count();
    public static void main(String[] args){
        if (number >= 50 && number <= 100)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        System.out.println("DONE!");
    }
}
