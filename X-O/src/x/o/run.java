package x.o;
//import java.util.Scanner;
import javax.swing.*;
public class run {
    public void play(){
        Game init=new Game();
        int i=0;
        while(init.end_of_game==false){
        init.ход();
        i++;
        if(i==9){
            //System.out.println("Ничья!");
            JOptionPane.showMessageDialog(null,"Ничья!","Конец игры",JOptionPane.WARNING_MESSAGE);
            break;
        }
        if(init.end_of_game==false){
        init.ход_о();
        i++;
        }
        else{
            break;
        }
        }
    }
    public void new_game(){
        Game init=new Game();
        //Scanner scan=new Scanner(System.in);
        //System.out.println("Начать новую игру?\nY/N");
        //String otv=scan.nextLine();
        int conf = JOptionPane.showConfirmDialog(null,"Начать новую игру?","Новая игра",JOptionPane.OK_CANCEL_OPTION);
        switch (conf) {
            case 0:
                init.end_of_game=false;
                break;
            case 1:
                System.exit(0);
            default:
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        run rn=new run();
        while(true){
        rn.play();
        rn.new_game();
        }
    }
  }

