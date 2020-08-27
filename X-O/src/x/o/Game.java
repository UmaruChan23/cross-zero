
package x.o;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Game {
    boolean end_of_game=false;
    boolean bol=true;
    Pole pol=new Pole();
    String hod;
    // победные комбинации String[] pob={"012","345","678","036","147","258","048","246"};
    Scanner input=new Scanner(System.in);
    int[] setka=new int[]{0,0,0,
                          0,0,0,
                          0,0,0};
    //int[] ind=new int[]{0,1,2,3,4,5,6,7,8};
    public void ход(){
       this.bol=true;
       //System.out.println("Ход X");
       pol.hodit="Ход X";
       pol.show_pole();
       //hod=input.nextLine();
       Обработка_Хода(pol.hod,bol);
   }
    public void ход_о(){
       this.bol=false;
       //System.out.println("Ход O");
       pol.hodit="Ход O";
       pol.show_pole();
       //hod=input.nextLine();
       Обработка_Хода(pol.hod,bol);
    }
    public void Обработка_Хода(String slot,boolean bol){
        String[] ячейки={"a1","b1","c1","a2","b2","c2","a3","b3","c3"};
        for(int i=0;i<ячейки.length;i++){
            if(slot.equals(ячейки[i])){
                if(bol==true){
                    if("_".equals(pol.txt[i])){
                    this.setka[i]=1;
                    pol.txt[i]="X";
                    }
                    else{
                        //System.out.println("Ячейка занята");
                        JOptionPane.showMessageDialog(null,"Ячейка занята");
                        ход();
                    }
                    break;
                }
                else{
                    if("_".equals(pol.txt[i])){
                    pol.txt[i]="O";
                    this.setka[i]=2;
                    }
                    else{
                        //System.out.println("Ячейка занята");
                        JOptionPane.showMessageDialog(null,"Ячейка занята");
                        ход_о();
                    }
                    break;
                }
            }
        }
        //pol.show_pole();
        Проверка_на_победу();
    }
    public void Проверка_на_победу(){
        for(int i=0;i<setka.length-2;i=i+3){
            if(setka[i]==setka[i+1] && setka[i+1]==setka[i+2] && setka[0]!=0){
                if(setka[i]==1){
                    //System.out.println("Победил Х!");
                    JOptionPane.showMessageDialog(null,"Победил Х!","Победа!",JOptionPane.WARNING_MESSAGE);
                    end_of_game=true;
                }
                else if(setka[i]==2){
                    //System.out.println("Победил О!");
                    JOptionPane.showMessageDialog(null,"Победил O!","Победа!",JOptionPane.WARNING_MESSAGE);
                    end_of_game=true;
                }
            }
        }
        for(int i=0;i<3;i++){
            if(setka[i]==setka[i+3] && setka[i]==setka[i+6] && setka[i]!=0){
                if(setka[i]==1){
                    //System.out.println("Победил Х!");
                    JOptionPane.showMessageDialog(null,"Победил Х!","Победа!",JOptionPane.WARNING_MESSAGE);
                    end_of_game=true;
                }
                else if(setka[i]==2){
                    //System.out.println("Победил О!");
                    JOptionPane.showMessageDialog(null,"Победил O!","Победа!",JOptionPane.WARNING_MESSAGE);
                    end_of_game=true;
                }
            }
         
        }
        if(setka[2]==setka[4] && setka[4]==setka[6]){
                if(setka[2]==1){
                    //System.out.println("Победил Х!");
                    JOptionPane.showMessageDialog(null,"Победил Х!","Победа!",JOptionPane.WARNING_MESSAGE);
                    end_of_game=true;
                }
                else if(setka[2]==2){
                    //System.out.println("Победил О!");
                    JOptionPane.showMessageDialog(null,"Победил O!","Победа!",JOptionPane.WARNING_MESSAGE);
                    end_of_game=true;
                }
            }
        if(setka[0]==setka[4] && setka[4]==setka[8]){
                if(setka[0]==1){
                    //System.out.println("Победил Х!");
                    JOptionPane.showMessageDialog(null,"Победил Х!","Победа!",JOptionPane.WARNING_MESSAGE);
                    end_of_game=true;
                }
                else if(setka[0]==2){
                    //System.out.println("Победил О!");
                    JOptionPane.showMessageDialog(null,"Победил O!","Победа!",JOptionPane.WARNING_MESSAGE);
                    end_of_game=true;
                }
            }
    }

}