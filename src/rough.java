


class aRough{

    public aRough(){
    System.out.println("I am Your Boss ki Wife!!");
}public void aRoug(int d){
    System.out.println("I am Your Boss ki Wife!!");
}
    public void bRoug(int x){
        System.out.println("I am your boss! in aRough");
    }
}


class bRough extends aRough{
    bRough(){
        System.out.println("By-Default Call of this Empty(Simple) Constructor!");

    }

    bRough(int z){
        System.out.println("HHello");

    }
public void bRoug(int x){
    System.out.print("I am your boss! in bRough");
}
}

class cRough extends bRough{
    cRough(int X){
        System.out.println("Hello");
    }
    public void bRoug(int x){
        System.out.println("I am your boss! in cRough");
    }
}


class rough{
    public static void main(String[] args) {
     cRough aR = new cRough(1);
  //Super class me agar constructor h , toh bhai wo call hoga hi, agar nahi h toh koi baat nahi hoga execute ,
      /*  lekin agar aesa h ki construnctor h bhi lekin simple nahi h , seedha parametrized h toh firr wo kahega bhai ab jo tumne superclass me bhi
                construnctor de hi diya h toh call toh karunga m, aur upar se tumne simple construtctor nahi diya h parameterized diya h , toh m normally apne aap call nahi kar paunga
                explicitly karo yaar usse through super( any int value ) lagake! agar nahi lagana toh , firr ek usme simple constructor bhi
                daal lo parametrized ke saath toh jisse m parametrized pe nahi jaunga seedha simple wale ko call karlunga , isse call karne ke liye tumhe ms*/

int i  = 2;

    }
}