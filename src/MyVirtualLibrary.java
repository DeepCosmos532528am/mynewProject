public class MyVirtualLibrary {
    public  String [] books ;
    void addBook(String...avlbooks){
        this.books = avlbooks;

    }
    void showBook(){
        System.out.println("All books in the Stock ");
        for(String allbooks: this.books){
            System.out.println(allbooks);
        }

    }
    void issueBook(String...issubooks){
        System.out.print("Your issued books are: ");
        for(String myissuebooks : issubooks){
            for(String issuewali: this.books){

                if(myissuebooks.equals(issuewali)){

                    System.out.print(issuewali+ " ,");
                }}
        }

    }

    public static void main(String[] args) {
        MyVirtualLibrary library = new MyVirtualLibrary();
        library.addBook("Hindi","English" ,"Maths" ,"SST", "Ramayan");
        library.addBook("psychology");
        library.showBook();
        library.issueBook("English" , "Ramayan");

    }
}


