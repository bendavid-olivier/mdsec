package utils.xacml.pep;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;



public class DummyGUIPEP extends javax.swing.JFrame {
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;

	private PEP parent ;
	
	public DummyGUIPEP() {
		initComponents();
	}
	
	public DummyGUIPEP(PEP c) {
		initComponents();
		parent = c;
	}
	

	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jComboBox1 = new javax.swing.JComboBox();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("PEP");
		jTextArea1.setColumns(20);

		jTextArea1.setRows(5);

		jScrollPane1.setViewportView(jTextArea1);

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Item 1", "Item 2", "Item 3", "Item 4" }));

		jButton1.setText("ok");

		jButton1.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {

				jButton1ActionPerformed(evt);
			}

		});
		jButton2.setText("update");
		jButton2.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {

				jButton2ActionPerformed(evt);

			}
		});
		jButton3.setText("quit");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														376, Short.MAX_VALUE)
												.addComponent(
														jButton3,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														376, Short.MAX_VALUE)
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addComponent(
																		jComboBox1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		136,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton2)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jComboBox1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton1)
												.addComponent(jButton2))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										210,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jButton3)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		System.out.println(jTextArea1.getText()+" on port : "+jComboBox1.getSelectedItem().toString());
		//parent.getPortByName(jComboBox1.getSelectedItem().toString(), MessagePort.class).process(jTextArea1.getText());
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		dispose();
	}

	public void updateEntities(Vector<String> data) {
		jComboBox1.setModel(new DefaultComboBoxModel(data));
	}

	public void updateTextArea(String s) {
		jTextArea1.setText(jTextArea1.getText() + "\n" + s);
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {	
				new DummyGUIPEP().setVisible(true);
			}
		});
	}
}