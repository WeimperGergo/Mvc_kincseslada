/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modell.JatekModell;
import nezet.GuiNezet;

public class GuiVezerlo {
    private JatekModell modell;
    private GuiNezet nezet;

    public GuiVezerlo(JatekModell modell, GuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        GuiBeallitas();
        start();
        valasztas();
    }
    
    private void start() {
        nezet.megjelenit(modell.kezdes());
    }
    
    public void GuiBeallitas(){
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    nezet.setVisible(true);
                }
            });
    }

    private void valasztas() {
        JButton gomb = nezet.getBtn_valasztas();
        
        gomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int v = nezet.bekeres();
                modell.setValasztas(v);
                String s = "Nincs láda kiválasztva!";
                s = v > -1 ? modell.ellenorzes() : s;
                nezet.figyelmeztet(s);
            }
        });
        
        
    }
}
