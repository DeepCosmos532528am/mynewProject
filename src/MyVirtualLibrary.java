public class MyVirtualLibrary {
    public  String [] books ;
    void addBook(String...avlbooks){
        this.books = avlbooks;

    }
    void showBook(){
        System.out.println();
        for(String allbooks: this.books){
            System.out.println(allbooks);
        }

    }
    void issueBook(String...issubooks){

        for(String myissuebooks : issubooks){
            for(String issuewali: this.books){

                if(issubooks.equals(issuewali)){
                    System.out.println("Your issued books are: " + (issuewali));
                    System.out.println(issuewali);
                }}
        }

    }

    public static void main(String[] args) {
        MyVirtualLibrary library = new MyVirtualLibrary();
        library.addBook("Hindi","English" ,"Maths" ,"SST", "Ramayan");
        library.issueBook("English" , "Ramayan");

    }
}


