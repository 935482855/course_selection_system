package main;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCourse extends JFrame{
	public static void main(String args[]) {
		AddCourse demo = new AddCourse();
    }
	 public AddCourse() {
	        init();
	        this.setTitle("ѧ��ѡ��ϵͳ:��ӿγ�");
			this.setBounds(400, 150, 678, 282);;
			this.setVisible(true);
	    }
	public void init() {
		OutCourse s=new OutCourse();
		Object_in_out file=new Object_in_out();
		String[] s1=s.outCourse();
		String[] s2=new String[20];
		JFrame frame=new JFrame();
		frame.setTitle("choice");
		JPanel panel2=new JPanel();
		JLabel lb1=new JLabel("�γ̱�ţ�");
		lb1.setBounds(10, 10, 82, 30);
		JTextField tf1=new JTextField(20);
		tf1.setBounds(80, 10, 200, 30);
		JLabel lb2=new JLabel("�γ����ƣ�");
		lb2.setBounds(334, 10, 82, 30);
		JTextField tf2=new JTextField(20);
		tf2.setBounds(403, 11, 200, 30);
		JLabel lb3=new JLabel("�Ͽεص㣺");
		lb3.setBounds(10, 66, 82, 30);
		JTextField tf3=new JTextField(20);
		tf3.setBounds(80, 67, 200, 30);
		JLabel lb4=new JLabel("�Ͽ�ʱ�䣺");
		lb4.setBounds(334, 66, 82, 30);
		JTextField tf4=new JTextField();
		tf4.setBounds(403, 67, 200, 30);
		JLabel lb5=new JLabel("��ʦ��ţ�");
		lb5.setBounds(10, 130, 82, 30);
		JTextField tf5=new JTextField(20);
		tf5.setBounds(80, 131, 200, 30);
		JLabel lb6=new JLabel("��ʦ������");
		lb6.setBounds(334, 130, 82, 30);
		JTextField tf6=new JTextField(20);
		tf6.setBounds(403, 131, 200, 30);
		JLabel lb7=new JLabel("��ʦ�Ա�");
		lb7.setBounds(10, 195, 82, 30);

		JTextField tf7=new JTextField(20);
		tf7.setBounds(80, 196, 200, 30);
		JButton btn1=new JButton("���");
		btn1.setBounds(356, 188, 100, 45);
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String[] s4={"��","Ů"};
				if(tf1.getText().trim().length()==0||tf2.getText().trim().length()==0||tf3.getText().trim().length()==0||tf4.getText().trim().length()==0||tf5.getText().trim().length()==0||tf6.getText().trim().length()==0||tf6.getText().trim().length()==0) {

					JOptionPane.showMessageDialog(null, "��Ϣ����Ϊ�գ�");
					return;
				}
				else {
					String str="�γ̺ţ�"+tf1.getText()+" ���γ����ƣ�"+tf2.getText()+" ���γ̵ص㣺"+tf3.getText()+" ���γ�ʱ�䣺"+tf4.getText()+"��"+"�ڿν�ʦ:���ţ�"+tf5.getText()+" ,������"+tf6.getText()+" ,�Ա�"+tf6.getText()+"��";
					file.writeFile("course",str);
					JOptionPane.showMessageDialog(null, "ѡ�γɹ�");
				}
			}
		});
		JButton btn2=new JButton("�˳�");
		btn2.setBounds(506, 188, 97, 45);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		panel2.setLayout(null);

		panel2.add(btn1);
		panel2.add(btn2);
		panel2.add(lb1);
		panel2.add(lb2);
		panel2.add(lb3);
		panel2.add(lb4);
		panel2.add(lb5);
		panel2.add(lb6);
		panel2.add(lb7);
		panel2.add(tf1);
		panel2.add(tf2);
		panel2.add(tf3);
		panel2.add(tf4);
		panel2.add(tf5);
		panel2.add(tf6);
		panel2.add(tf7);
		getContentPane().add(panel2);
	}
}
