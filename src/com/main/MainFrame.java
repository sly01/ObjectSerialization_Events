package com.main;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import javax.imageio.stream.FileImageInputStream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.ListModel;

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
public class MainFrame extends javax.swing.JFrame implements SavingListener {
	private JSplitPane jSplitPane1;
	private JPanel jPanel1;
	private JList jList1;
	private JButton btnOku;
	private JButton btnYazdir;
	private JButton btnYeni;
	private JPanel jPanel2;
	
	private ArrayList<Person> ogrenciler = new ArrayList<Person>();

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		
		final AdminPanel panel = new AdminPanel();
		panel.setVisible(true);
		panel.btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (panel.userName.getText().equals("admin") && panel.userPassword.getText().equals("1234")) {
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							MainFrame inst = new MainFrame();
							inst.setLocationRelativeTo(null);
							inst.setVisible(true);
						}
					});
				panel.dispose();
				}
				else
					JOptionPane.showMessageDialog(null, "Yanlis sifre veya kullanici adi girdiniz");
			}
		});
		
	
		
		
	}
	
	public MainFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jSplitPane1 = new JSplitPane();
				getContentPane().add(jSplitPane1, BorderLayout.CENTER);
				jSplitPane1.setOrientation(JSplitPane.VERTICAL_SPLIT);
				jSplitPane1.setPreferredSize(new java.awt.Dimension(400, 287));
				{
					jPanel1 = new JPanel();
					jSplitPane1.add(jPanel1, JSplitPane.TOP);
					jPanel1.setPreferredSize(new java.awt.Dimension(398, 40));
					{
						btnYeni = new JButton();
						jPanel1.add(btnYeni);
						btnYeni.setText("YeniKayit");
						btnYeni.setPreferredSize(new java.awt.Dimension(97, 22));
						btnYeni.addMouseListener(new MouseAdapter() {
							public void mousePressed(MouseEvent evt) {
								btnYeniMousePressed(evt);
							}
						});
					}
					{
						btnYazdir = new JButton();
						jPanel1.add(btnYazdir);
						btnYazdir.setText("Dosyaya Yaz");
						btnYazdir.setPreferredSize(new java.awt.Dimension(113, 22));
						btnYazdir.addMouseListener(new MouseAdapter() {
							public void mousePressed(MouseEvent evt) {
								btnYazdirMousePressed(evt);
							}
						});
					}
					{
						btnOku = new JButton();
						jPanel1.add(btnOku);
						btnOku.setText("Dosyadan Oku");
						btnOku.setPreferredSize(new java.awt.Dimension(118, 22));
						btnOku.addMouseListener(new MouseAdapter() {
							public void mousePressed(MouseEvent evt) {
								btnOkuMousePressed(evt);
							}
						});
					}
				}
				{
					jPanel2 = new JPanel();
					BorderLayout jPanel2Layout = new BorderLayout();
					jPanel2.setLayout(jPanel2Layout);
					jSplitPane1.add(jPanel2, JSplitPane.BOTTOM);
					{
						ListModel jList1Model = 
								new DefaultComboBoxModel(
										new String[] { });
						jList1 = new JList();
						jPanel2.add(jList1, BorderLayout.CENTER);
						jList1.setModel(jList1Model);
					}
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void btnYeniMousePressed(MouseEvent evt) {
		SaveFrame frm = new SaveFrame();
		frm.setKaydetmeListener(this);
		frm.setVisible(true);
	}

	@Override
	public void saved(SavingEventObject obj) {
		Person o = new Person(obj.getName(),obj.getSurname(),obj.getNo());
		ogrenciler.add(o);
		((DefaultComboBoxModel)jList1.getModel()).addElement(o);
	}
	//Listeye eklenen ogrenciler dosyaya yazdirildi
	private void btnYazdirMousePressed(MouseEvent evt) {
		try {
			File dosya = new File("/Users/erkoc/Desktop/ogrenciler.dat");
			
			ObjectOutputStream yazici = new ObjectOutputStream(new FileOutputStream(dosya));
			yazici.writeObject(ogrenciler);
			yazici.close();
			
		} catch (Exception e) {
          e.printStackTrace();
		}
		  JOptionPane inf = new JOptionPane();
		  inf.showMessageDialog(null,"Dosya Kaydedildi");
		
			}
	
	private void btnOkuMousePressed(MouseEvent evt) {
		try {
			File dosya = new File("/Users/erkoc/Desktop/ogrenciler.dat");
			
			ObjectInputStream okuyucu = new ObjectInputStream(new FileInputStream(dosya));
			this.ogrenciler=(ArrayList<Person>)okuyucu.readObject();
			okuyucu.close();
			
			ListModel jList1Model = 
					new DefaultComboBoxModel(ogrenciler.toArray() );
			jList1.setModel(jList1Model);
		} catch (Exception e) {
          e.printStackTrace();
		}
		
	}

}
