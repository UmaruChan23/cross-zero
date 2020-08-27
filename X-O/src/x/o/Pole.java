package x.o;
import javax.swing.*;
public class Pole extends JFrame {
    public String[] txt={"_","_","_","_","_","_","_","_","_"};
    String ABC="     A    B    C\n";
            //"\tA\tB\tC\n";
    String hodit;
    String hod="";
    private        JPanel  contents       = null;
    public void show_pole(){
        //System.out.println(ABC);
        //System.out.println("1\t"+txt[0]+"  "+txt[1]+"\t"+txt[2]);
        String str1=("1    "+txt[0]+"    "+txt[1]+"    "+txt[2]+"\n");
        //System.out.println("2\t"+txt[3]+"\t"+txt[4]+"\t"+txt[5]);
        String str2=("2    "+txt[3]+"    "+txt[4]+"    "+txt[5]+"\n");
        //System.out.println("3\t"+txt[6]+"\t"+txt[7]+"\t"+txt[8]);
        String str3=("3    "+txt[6]+"    "+txt[7]+"    "+txt[8]+"\n");
        String txt=ABC+str1+str2+str3;
        hod=(String)JOptionPane.showInputDialog(contents,txt,hodit,JOptionPane.PLAIN_MESSAGE);
                }
}

