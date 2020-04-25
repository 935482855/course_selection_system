package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintCourse extends JFrame {//extends继承JFrame类
	public static void main(String args[]) {
		PrintCourse demo = new PrintCourse();//实例化demo
    }
	 public PrintCourse() {
	        init();
	        this.setTitle("学生选课系统：打印课表");
			this.setBounds(400, 150, 782, 300);;
			this.setVisible(true);
	    }
	public void init() { 
		Object_in_out file=new Object_in_out();
		String[] s2=new String[5];
		JFrame frame=new JFrame();
		frame.setTitle("Quit");
		JPanel panel2=new JPanel();
		s2=file.readFile(file.readFile("identify")).split("。");
		JList list =new JList(s2);
		list.setBounds(49, 48, 676, 48);
		JButton btn2=new JButton("退出");
		btn2.setBounds(296, 188, 145, 48);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		panel2.setLayout(null);
		panel2.add(btn2);
		panel2.add(list);
		getContentPane().add(panel2);
	}
}