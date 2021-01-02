package src.Homework7_3_2;

public class Lantern {
    private int energy;

    public Lantern(int energy) {
        this.energy = energy;
    }

    public  void shine(){
        if(energy==0){
            energy-=1;
        }else {
            System.out.println("Недостаточный заряд батареи");
        }
    }
}
