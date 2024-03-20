package coordinates;

public class Coordinates {
    public int row;
    public int col;
    public Coordinates(int row,int col){
        this.row=row;
        this.col=col;
    }
    public String print_Coordinates(){
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(row).append(",").append(col).append("]");
        return sb.toString();
    }
    public int getRow(){
        return this.row;
    }
    public int getCol(){
        return this.col;
    }

}
