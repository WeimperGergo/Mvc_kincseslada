package nezet;

import javax.swing.JOptionPane;

public class FelugroNezet extends CuiNezet{
    @Override
    public int bekeres() {
        String v = JOptionPane.showInputDialog("Melyikben van a kincs? (1,2,3): ");
        return Integer.parseInt(v) - 1;
    }
    
    @Override
    public void megjelenit(String uzenet){
        JOptionPane.showMessageDialog(null,uzenet);
    }
}
