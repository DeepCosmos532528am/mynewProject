class newClass{

private String name2;
private String name1 = "Sachin ";

public String getName(){
    return name1 + name2;
}
public void setName( String name){
    if(name.equals("Sharma") || name.equals("sharma")){
        name2 = name;

    }else {
        throw new RuntimeException();
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
        newClass newCls = new newClass();
        System.out.println("Printing the values " + myfunc(2, 3, 4));

        newCls.setName("sharma");
        System.out.println("Here is my name "+newCls.getName());



    }
}