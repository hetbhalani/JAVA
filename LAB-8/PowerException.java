
// 8(1)Write a method for computing xy doing repetitive multiplication. X 
// and y are of type integer and are to be given as command line 
// arguments. Raise and handle exception(s) for invalid values of x 
// and y.

public class PowerException {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int r = 1;
            if (x == 0 && y == 0) {
                throw new Exception("maro bhai GANIT bhaino k nai??? bey ek haire jiro na hoi...");
            } else {
                for (int i = 1; i <= y; i++) {
                    r = r * x;
                }
                System.out.println("x^y = " + r);
            }
        } catch (NumberFormatException e) {
            // e.printStackTrace();
            System.out.println("your x or y cant't be a string bhai!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


// class abc extends Exception{
//     abc(String error){
//         super(error);
//     }
// }