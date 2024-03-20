package Jumper;
import coordinates.Coordinates;

public class jumper {
    public Coordinates start;
    public Coordinates end;
    public String name;
    public jumper(Coordinates start,Coordinates end){
        this.start=start;
        this.end=end;
        if(start.getRow()>end.getRow())this.name="ladder";
        if(start.getRow()<end.getRow())this.name="snake";
        System.out.println(name);
    }
    public String getJumperName(){
        return this.name;
    }




}
