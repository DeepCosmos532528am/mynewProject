import java.util.Scanner;

class newClass{

private String name2;
private String name1 = "Sachin ";

public String getName(){
    return name1 + name2;
}
public void setName( String name){
    try{
    if(name.equals("Sharma") || name.equals("sharma")){
        name2 = name;

    }else {
        throw new RuntimeException();
    }}catch(RuntimeException e){
        System.out.println("Exception aa gya yaar...");
    }
}
}

class Main {
    public static int myfunc(int... x) {
        int i = 0;
        for (int ii : x) {
            i += ii;
        }
        return i;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        newClass newCls = new newClass();
        System.out.println("Printing the values " + myfunc(2, 3, 4));

        newCls.setName(sc.next());
        System.out.println("Here is my name "+newCls.getName());



    }
}