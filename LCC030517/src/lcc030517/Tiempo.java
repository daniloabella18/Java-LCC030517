
package lcc030517;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tiempo extends Thread{

private JLabel lbl;
//private Graphics tiempo;
//private Graphics2D tiempo2D = (Graphics2D) tiempo;

public Tiempo(JLabel lbl){
    this.lbl=lbl;
}

public void run(){
    
    while(true){
        
        short minuto, segundo;
        
        Date hoy = new Date();
        SimpleDateFormat s = new SimpleDateFormat ("hh:mm:ss");
        lbl.setText(s.format(hoy));
        pausa(1000);
    /*       
            for(minuto=0; minuto < 60 ; minuto ++)
            {
                for(segundo = 0; segundo < 60 ; segundo ++)
                {
//                    tiempo2D.clearRect(0,0,100,40);   tiempo2D.drawString(minuto +":"+segundo,0,25);
                    System.out.println(minuto +":"+segundo);
                    pausa(1000);
                }
            }
    */
    }
}

    // Funcion Pausa
    public void pausa(int n){
        try{
            Thread.sleep(n);
        }catch(Exception e){
            
        }
    }
    
}



