package KontRolPackage;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class ECRAN_ACCEUIL extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel imglabel;
    private static JProgressBar pbar;
    Thread t = null;

    public ECRAN_ACCEUIL() {
        super("KontRol");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);
        ImageIcon icon = new ImageIcon("C:\\Users\\RANIA\\Documents\\NetBeansProjects\\TwitterPFE\\src\\KontRolPackage\\Icones\\acceuil7.png");
        Image img = icon.getImage();
        imglabel=new JLabel();
        imglabel.setBounds(0, 0, 800, 400);
        Image newImg = img.getScaledInstance(imglabel.getWidth(), imglabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        
        imglabel.setIcon(newImc);
     
        add(imglabel);
        setLayout(null);
        pbar = new JProgressBar();
        pbar.setMinimum(0);
        pbar.setMaximum(100);
        pbar.setStringPainted(true);
        pbar.setForeground(new  Color(00,99,255));
        add(pbar);
        pbar.setPreferredSize(new Dimension(300, 30));
        pbar.setBounds(2, 390, 800, 300);

        Thread t = new Thread() 
        {
            public void run() 
            {
                int i = 0;
                while (i <= 100) 
                {
                    pbar.setValue(i);
                    try 
                    {
                        sleep(90); //le temps de defilement de la barre de progression 
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ECRAN_ACCEUIL.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    i++;
                }
            }
        };
        t.start();
    }
    
    public static void main(String args[])throws Exception
    {
        ECRAN_ACCEUIL s=new ECRAN_ACCEUIL();
        s.setSize(800, 400);
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        Thread.sleep(10000); // temps d'attente 1 seconde
        s.dispose();
        SwingUtilities.invokeLater(new Runnable(){
            public void run()
            {
                //passage a l'ecran inscription
                INSCRIPTION i = new INSCRIPTION();
                i.setVisible(true);
                i.setLocationRelativeTo(null);
            }
        });
    }
}
