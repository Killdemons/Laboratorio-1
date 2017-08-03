package laboratorio1;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Mirender extends DefaultTableCellRenderer {
    /**
     *
     * @param table
     * @param value
     * @param isSelected
     * @param hasFocus
     * @param row
     * @param column
     * @return
     */
    @Override
    public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column){
        super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
        if (String.valueOf(value).charAt(0)=='C' || String.valueOf(value).charAt(0)=='G'){
            this.setBackground(Color.red);
        }else{
            this.setBackground(Color.white);
        }
      return this;
   }
}