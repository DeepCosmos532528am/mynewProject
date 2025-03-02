import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class slotsOutOfSize extends Exception {
    @Override
    public String toString() {
        return "Slots out of size";
    }
}

class wrongCode extends Exception {
    @Override
    public String toString() {
        return "!!Wrong password multiple times, Sorry cannot show data!!";
    }
}

class bookStock {


    private List<String> fill = new ArrayList<>();
    private List<String> unfilled = new ArrayList<>();
    private int size = 5; // Default Library size is 5 Slots (Hypothetical Case) :)
    private String pass;
    Scanner sc = new Scanner (System.in);

    public void fillStock(String... putBooks) throws slotsOutOfSize {
        int iterations = putBooks.length;
        for (int i = 0; i < iterations; i++) {
            try {
                if (fill.size() < size) {
                    fill.add(putBooks[i]);
                } else if (i < putBooks.length) {
                    unfilled.add(putBooks[i]);
                    iterations++;
                } else {
                    throw new slotsOutOfSize(); // The exception in the catch should be this , which is catched by it !

                }
            } catch (
                    slotsOutOfSize e) { // Thing to be noted , that the exception name that should be here must be the Exception on which I want the catch block to be executed ,
                // if this thing is not be followed then the output may not be the desired output ( Exception must be the one which is thrown form the Connected Try{} block of this catch(){} block
                System.err.println("The books could filled are : \n" + fill.subList(0, fill.size()));
                System.err.println("The books left unfilled are : \n" + (unfilled));

                System.err.println("Slots got out of Size, Cannot fill more books in the slots! , \n please increase slots :(  ");
                System.out.printf("My TIP: Increase the size of slots from %s to  %s\n", size, putBooks.length);
                return;

            }
        }

    }
    void setPassword(String setPassword){
        this.pass = setPassword;
    }

    void showstock(String pass) throws wrongCode {
        String user_Password_Input;
        user_Password_Input = pass;
        try {
            for (int i = 3; i > 0; i--) {
                if (this.pass.equals(user_Password_Input)) {

                    System.out.printf("Welcome ,\n\t the size of the slots are %d slots :" ,  this.size);
                    System.out.println("Total books in the stock are: \n" + fill);
                    break;
                } else {
                    if( i == 1){
                        throw new wrongCode();

                    }
                    System.out.println("wrong paasword !");
                    System.out.printf("left with %d tries,please provide correct password :", i-1);
                    user_Password_Input = sc.next();


                }
            }
        }catch(wrongCode e){
            System.out.println(e);
        }
    }

    void modifySize(int modifySize) {
        size = modifySize;
    }


    class issueBooks extends bookStock {
        String BorrowerName;
        String booksName;
        List<String> BorrowersName;


    }
}

public class LibraryManagement_System {
    public static void main(String[] args) throws slotsOutOfSize, wrongCode {
        Scanner sc = new Scanner(System.in);
        bookStock b = new bookStock();

        b.fillStock("Bhagwad Gita", "Ramayan", "Vishnu Puran", "Shrimad Bhagwat Mahapuran", "ShivPuran", "DurgaPuran", "ks", "kj", "dgk");
        b.setPassword("1234");
        b.showstock(sc.next());

    }
}


/*
* OPerations -
* */