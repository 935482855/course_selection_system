package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{ //�̳�JFrame
	/*
	JFrame��һ������Ŀ����

	JPanel��һ��������

	JLabel����һЩ������� ����������ĳ��������
	 */
	public static void main(String args[]) {
		Login demo = new Login();
    }
	 public Login() {
	        init();
	        this.setTitle("ѧ��ѡ��ϵͳ");
	        //����x y����
			this.setBounds(800, 300, 500, 300);
			//�����Ƿ���ӻ�
			this.setVisible(true);
	}
	 
	public void init() {
		Object_in_out file = new Object_in_out();//ʵ����һ���ļ�����
		JFrame frame = new JFrame();//���»�ȡ����
		frame.setTitle("choice"); // ���ô���ı���
		JPanel panel2 = new JPanel();//����ǹ���Ӧ�ó������Ļ���Ԫ�� �������

		panel2.setLayout(null);//������������һ������Ϊnul��l��������jpane;�Ĳ��ֹ�����Ϊ�գ���Ϳ����Լ��ֶ����������������λ�úʹ�С��

		JLabel lb2 = new JLabel("�û�����");
		lb2.setBounds(32, 50, 100, 30);
		JTextField tf2=new JTextField(20);
		tf2.setBounds(99, 51, 323, 30);
		JLabel lb3=new JLabel("���룺");
		lb3.setBounds(32, 90, 200, 30);
		JTextField ps=new JTextField(10);
		ps.setBounds(100, 91, 323, 30);
		JButton btn1=new JButton("��¼");
		btn1.setBounds(210, 130, 100, 44);
		btn1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
		if(tf2.getText().trim().length()==0||ps.getText().length()==0){
			JOptionPane.showMessageDialog(null, "�û���������Ϊ��");
			return;
		}
		if(file.readFile("user").contains(tf2.getText()+","+ps.getText())){
			file.writeFile("identify",tf2.getText());
			JOptionPane.showMessageDialog(null, "��¼�ɹ�");
			Frame_index choice=new Frame_index();
			setVisible(false);
		}
		

		if(file.readFile("user").contains(ps.getText())==false&&file.readFile("user").contains(tf2.getText())) {
			JOptionPane.showMessageDialog(null, "�������");
		}
		if(file.readFile("user").contains(tf2.getText())==false && tf2.getText().equals("Admin")==false) {
			JOptionPane.showMessageDialog(null, "�û��������ڣ�����ע���ٽ��е�¼��");
		}
		if(tf2.getText().equals("Admin")&&ps.getText().equals("Admin")){
			AddCourse print=new AddCourse();
		}


	}
});

		JButton btn2=new JButton("ע��");
		btn2.setBounds(210, 190, 100, 44);
		btn2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
		if(tf2.getText().trim().length()==0||ps.getText().length()==0){
			JOptionPane.showMessageDialog(null, "�û������벻����Ϊ��");
			return;
		}

		else{
			file.writeFile("user",tf2.getText()+","+new String(ps.getText())+"��");
			JOptionPane.showMessageDialog(null, "ע��ɹ���");}}}
		);
		panel2.add(btn1);
		panel2.add(btn2);

		panel2.add(lb2);
		panel2.add(lb3);

		panel2.add(tf2);
		panel2.add(ps);
		getContentPane().add(panel2);
	}}
