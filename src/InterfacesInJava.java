interface hello{
void Accelerate(int speed );
void Retard(int speed);
}
class RollsRoyce implements hello{
    int Speed = 0;
    public void Accelerate(int accelerate){

        this.Speed += accelerate;
        System.out.println("The speed of your car was " + this.Speed );

    }
    public void Retard(int retard){

        this.Speed -=  retard;
        System.out.printf("The speed of your car is retarded by %d%n and now your car running at %d%n...!",retard, this.Speed );
    }
}

public class InterfacesInJava {
    public static void main(String[] args) {
  RollsRoyce r = new RollsRoyce();
          r.Accelerate(150);
          r.Retard(40);
    }
}
