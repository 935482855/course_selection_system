package main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelCourse extends JFrame {
	public static void main(String args[]) {
		CancelCourse demo = new CancelCourse();
    }
	 public CancelCourse() {
	        init();
	        this.setTitle("ѧ��ѡ��ϵͳ��ѧ���˿�");
			this.setBounds(400, 150, 883, 300);;
			this.setVisible(true);
	    }
	public void init() {
		String[] s2=new String[20];
		Object_in_out file=new Object_in_out();
		JFrame frame=new JFrame();
		frame.setTitle("Quit");
		JPanel panel2=new JPanel();
		s2=file.readFile(file.readFile("identify")).split("��");
		JButton btn1=new JButton("�˿�");
		btn1.setBounds(231, 166, 98, 49);
		JList list =new JList(s2);
		list.setFont(new Font("����", Font.PLAIN, 14));
		btn1.addActionListener(new ActionListener(){
		
			public void actionPerformed(ActionEvent arg0) {
				String[] s2=file.readFile(file.readFile("identify")).split("��");
				if(list.isSelectionEmpty()){
					JOptionPane.showMessageDialog(null, "δ�˿�");
					return;
				}
				for(int i=0;i<s2.length;i++) {
					if(list.isSelectedIndex(i)) {//�жϿγ��Ƿ�ѡ��
						s2[i]=null;//�γ���Ϣ��Ϊ��
					}
					else {
						s2[i]=s2[i]+"��";
					}
				}
				file.WriteFile(s2,file.readFile("identify"));
				JOptionPane.showMessageDialog(null, "�˿γɹ���");
				setVisible(false);
			}
		});
		JButton btn2=new JButton("�˳�");
		btn2.setBounds(525, 166, 98, 49);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		panel2.setLayout(null);
		
		list.setBounds(25, 46, 832, 110);
		panel2.add(list);
		panel2.add(btn1);
		panel2.add(btn2);
		getContentPane().add(panel2);

	}
}