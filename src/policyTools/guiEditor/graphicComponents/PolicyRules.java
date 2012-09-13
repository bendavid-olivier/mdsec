package policyTools.guiEditor.graphicComponents;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;



public class PolicyRules extends JPanel {
    private boolean DEBUG = false;
    private JTable table;

    public PolicyRules() {
        super(new GridLayout(1,0));
        String[] columnNames = {"User", "Role", "Operation", "Object"};
        Object[][] data = {{" ", " ", " ", " "}};
        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        if (DEBUG) {
            table.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    printDebugData(table);
                }
            });
        }
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }
    
    
    public void updateTable(Object[][] data){
    	 String[] columnNames = {"User", "Role", "Operation", "Object"};
    	 table = new JTable(data, columnNames);
         table.setPreferredScrollableViewportSize(new Dimension(500, 70));
         table.setFillsViewportHeight(true);
         if (DEBUG) {
             table.addMouseListener(new MouseAdapter() {
                 public void mouseClicked(MouseEvent e) {
                     printDebugData(table);
                 }
             });
         }
         JScrollPane scrollPane = new JScrollPane(table);
         removeAll();
         add(scrollPane);
         update(getGraphics());
         repaint();
         setVisible(true);
         repaint();
         update(getGraphics());
         validate();
         revalidate();
    }
    

    private void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();

        System.out.println("Value of data: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
    
}