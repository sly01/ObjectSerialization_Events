package com.main;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class KayitFrame extends javax.swing.JFrame {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JTextField txtSoyad;
	private JButton btnKaydet;
	private JTextField txtNo;
	private JTextField txtIsim;

	//Diğer formlarda bu olayın yakalanması için tanımlandı
	private KaydetmeListener kaydetmeListener;
	
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				KayitFrame inst = new KayitFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public KayitFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("isim");
				jLabel1.setBounds(5, 17, 42, 15);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Soyad");
				jLabel2.setBounds(5, 54, 52, 15);
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("No");
				jLabel3.setBounds(5, 91, 52, 15);
			}
			{
				txtIsim = new JTextField();
				getContentPane().add(txtIsim);
				txtIsim.setBounds(87, 14, 154, 19);
			}
			{
				txtSoyad = new JTextField();
				getContentPane().add(txtSoyad);
				txtSoyad.setBounds(87, 51, 154, 22);
			}
			{
				txtNo = new JTextField();
				getContentPane().add(txtNo);
				txtNo.setBounds(87, 88, 154, 22);
			}
			{
				btnKaydet = new JButton();
				getContentPane().add(btnKaydet);
				btnKaydet.setText("Kaydet");
				btnKaydet.setBounds(181, 122, 80, 22);
				btnKaydet.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent evt) {
						btnKaydetMousePressed(evt);
					}
				});
			}
			pack();
			this.setSize(272, 177);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
    public void setKaydetmeListener(KaydetmeListener kaydetmeListener) {
		this.kaydetmeListener = kaydetmeListener;
	}
    public KaydetmeListener getKaydetmeListener() {
		return kaydetmeListener;
	}
    
    private void btnKaydetMousePressed(MouseEvent evt) {
    	
    	KaydetmeEventObject obj = new KaydetmeEventObject(this, txtIsim.getText(), txtSoyad.getText(), Integer.valueOf(txtNo.getText()) );
    	
    	kaydetmeListener.kaydedildi(obj);
    	this.dispose();
    }

}
