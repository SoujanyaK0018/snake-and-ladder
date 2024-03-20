import player.Player;
import java.util.*;
import dice.dice;
import coordinates.Coordinates;
import Jumper.jumper;
import board.Board;
import game.Game;
public class App {
    public static void main(String[] args)throws Exception{
       HashMap<String,jumper>map=new HashMap<>();
       map.put("6",new jumper(new Coordinates(9,5),new Coordinates(6,6)));
       map.put("97",new jumper(new Coordinates(0,1),new Coordinates(9,9)));
       map.put("21",new jumper(new Coordinates(7,0),new Coordinates(0,9)));
       map.put("64",new jumper(new Coordinates(3,3),new Coordinates(7,4)));
       
       Player p1=new Player();
       p1.set_player_details_from_user_input(p1);
       p1.get_player_details();
       Player p2=new Player();
       p2.set_player_details_from_user_input(p2);
       p2.get_player_details();
       dice dice=new dice();
       System.out.println(dice.dice_roll());
       Coordinates c = new Coordinates(3,7);
       Coordinates d = new Coordinates(6,7);
       System.out.println(c.print_Coordinates());
       jumper j = new jumper(c,d);
       Board b = new Board(10,map);
       b.printBoard();
       Game game = new Game(b,new Player[]{p1,p2},new dice());
       game.play();
       


    } 
}