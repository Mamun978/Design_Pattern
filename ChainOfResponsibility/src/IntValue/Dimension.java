package IntValue;

public class Dimension {

    private int [] coordinate;

    Dimension(int x){
        this.coordinate=new int[]{x};
    }

    Dimension(int x, int y){
        this.coordinate=new int[]{x,y};
    }

    Dimension(int x, int y, int z){
        this.coordinate=new int []{x,y,z};
    }

     public int[] getCoordinate(){
        return  coordinate;
     }
}
