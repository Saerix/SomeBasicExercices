import java.util.Scanner;
class Count {
    private static int tempNum;
    static int count()
    {
        do
        {

            try {
                System.out.println("Please enter the number in range 1-100: ");
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                tempNum  = Integer.parseInt(s);
            }
            catch (Exception e) {
                System.out.println("Also no letters allowed ;) ");
            }
            if(tempNum  >= 1 && tempNum  <= 100)
                break;
        }
        while (true);
        return tempNum;
    }

}
