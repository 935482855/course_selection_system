package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{ //继承JFrame
	/*
	JFrame是一个顶层的框架类

	JPanel是一个容器类

	JLabel等是一些基础组件 它必须置于某个容器里
	 */
	public static void main(String args[]) {
		Login demo = new Login();
    }
	 public Login() {
	        init();
	        this.setTitle("学生选课系统");
	        //设置x y坐标
			this.setBounds(800, 300, 500, 300);
			//设置是否可视化
			this.setVisible(true);
	}
	 
	public void init() {
		Object_in_out file = new Object_in_out();//实例化一个文件对象
		JFrame frame = new JFrame();//重新获取窗体
		frame.setTitle("choice"); // 设置窗体的标题
		JPanel panel2 = new JPanel();//组件是构成应用程序界面的基本元素 创建组件

		panel2.setLayout(null);//给这个面板设置一个布局为nul，l就是设置jpane;的布局管理器为空，你就可以自己手动的设置组件的坐标位置和大小了

		JLabel lb2 = new JLabel("用户名：");
		lb2.setBounds(32, 50, 100, 30);
		JTextField tf2=new JTextField(20);
		tf2.setBounds(99, 51, 323, 30);
		JLabel lb3=new JLabel("密码：");
		lb3.setBounds(32, 90, 200, 30);
		JTextField ps=new JTextField(10);
		ps.setBounds(100, 91, 323, 30);
		JButton btn1=new JButton("登录");
		btn1.setBounds(210, 130, 100, 44);
		btn1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
		if(tf2.getText().trim().length()==0||ps.getText().length()==0){
			JOptionPane.showMessageDialog(null, "用户名或密码为空");
			return;
		}
		if(file.readFile("user").contains(tf2.getText()+","+ps.getText())){
			file.writeFile("identify",tf2.getText());
			JOptionPane.showMessageDialog(null, "登录成功");
			Frame_index choice=new Frame_index();
			setVisible(false);
		}
		

		if(file.readFile("user").contains(ps.getText())==false&&file.readFile("user").contains(tf2.getText())) {
			JOptionPane.showMessageDialog(null, "密码错误");
		}
		if(file.readFile("user").contains(tf2.getText())==false && tf2.getText().equals("Admin")==false) {
			JOptionPane.showMessageDialog(null, "用户名不存在，请先注册再进行登录！");
		}
		if(tf2.getText().equals("Admin")&&ps.getText().equals("Admin")){
			AddCourse print=new AddCourse();
		}


	}
});

		JButton btn2=new JButton("注册");
		btn2.setBounds(210, 190, 100, 44);
		btn2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
		if(tf2.getText().trim().length()==0||ps.getText().length()==0){
			JOptionPane.showMessageDialog(null, "用户名密码不允许为空");
			return;
		}

		else{
			file.writeFile("user",tf2.getText()+","+new String(ps.getText())+"。");
			JOptionPane.showMessageDialog(null, "注册成功！");}}}
		);
		panel2.add(btn1);
		panel2.add(btn2);

		panel2.add(lb2);
		panel2.add(lb3);

		panel2.add(tf2);
		panel2.add(ps);
		getContentPane().add(panel2);
	}}
