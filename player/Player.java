package player;

import java.util.Scanner;

public class Player {
    public String name;
    public String mail_id;
    public String contact_no;
    public String address;
    public int age;
    public void set_player_details(String name,String mail_id,String contact_no,String address,int age){
        this.name=name;
        this.mail_id=mail_id;
        this.contact_no=contact_no;
        this.address=address;
        this.age = age;
    }
    public void set_player_name(String name){
        this.name=name;
    }
    public void get_player_details(){
        System.out.println("player name is:"+name);
        System.out.println("player mail_id is:"+mail_id);
        System.out.println("Player contact_no is:"+contact_no);
        System.out.println("Player address is:"+address);
        System.out.println("Player age is:"+age);
    }
    public String  get_player_name(){
        System.out.println("Player name is:"+name);
        return this.name;
    } 
    public static void set_player_details_from_user_input(Player p){


        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the player details");
        System.out.println("Enter player name:");
        String name = scn.nextLine();
        System.out.println("Enter player mail_id:");
        String mail_id = scn.nextLine();
        System.out.println("Enter player contact_no");
        String contact_no=scn.nextLine();
        System.out.println("Enter player address:");
        String address=scn.nextLine();
        System.out.println("Enter player age:");
        int age= scn.nextInt();
        p.set_player_details(name,mail_id,contact_no,address,age);

    }

}

    
   





