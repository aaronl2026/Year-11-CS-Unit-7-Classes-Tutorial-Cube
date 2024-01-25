import java.util.Scanner;
public class Cube {
    private int side;
    public Cube(){
        side = 1;
    }
    public Cube(int a){
        if(a<1){
            System.out.println("A cube’s side length cannot be less than 1!");
            throw new IllegalArgumentException();
        }
        this.side = a;
    }
    public int getSide(){
        return side;
    }
    public void setSide(int a){
        if(a<1){
            System.out.println("A cube’s side length cannot be less than 1!");
            throw new IllegalArgumentException();
        }
        this.side = a;
    }
    public int calculateSurfaceArea(){
        int area = 6*(side*side);
        return area;
    }
    public int calculateVolume(){
        int volume = side*side*side;
        return volume;
    }
    public String toString(){
        return ("Cube{side="+side+"}");
    }
}
