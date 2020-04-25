# 学生选课系统

## 一.实验目的

1. 设计学生选课系统，基于`文件`的形式保存学生、课程、选课结果等数据。
2. 可以通过该系统读取写入给下那个数据

## 二.任务

### 1.分析选课系统

* 通过分析设计选课系统种的程序流程设计，以及各种对象类的编辑

### 2.完成业务逻辑编程

* 通过分析系统的功能，找到需要完成的功能需求设计并完成这些设计

### 3.处理异常程序的结果

* 通过测试，找到出现异常的地方并用异常处理程序包裹这段程序



## 三.实验核心方法

### 1.面向对象的程序设计

* 将People作为一个父类，设计系统种的其他成员类都继承People类。

* People类包含属性id，name，sex。其他的学生类和教师类除了继承父类的属性之外，学生类还包含一个Course类对象，需要将课程对象传进成员方法进行传递。教师类包含属性teachcour。

* 个别类中有相关的getter，setter方法以及toString方法方便，逻辑程序的调用

  ```Java
  //列出学生类的设计代码
  public class Student extends People {//继承父类
  	Course choicecour;//类属性
  	String score;//自己的属性
  	public Student(String id, String name, String sex,Course choicecour,String score) {
  		super(id, name, sex);
  		this.choicecour=choicecour;
  		this.score=score;
  		}
  	public String toString() {
  		return "学生信息：	学号："+id+" ，姓名： "+name+" ，性别："+sex+"；"+choicecour;
  	}
  }
  ```

### 2.业务逻辑的设计

* 功能设计

  * 学生登录注册
  * 课程新加
  * 学生选课
  * 学生退课
  * 打印学生选课列表
  * 教师登录添加课程

* 界面设计

  * 登录界面

  <img src="F:\实验报告\注册登录页面.png" alt="注册登录" style="zoom:75%;" />

  * 主页面

  <img src="F:\实验报告\主页面.png" style="zoom:75%;" />

  * 选课页面

  <img src="F:\实验报告\选课页面.png" style="zoom:67%;" />

  * 退课页面

    ![](F:\实验报告\退课页面.png)

  * 添加课程页面

  ​	<img src="C:\Users\李世林\AppData\Roaming\Typora\typora-user-images\image-20200425092307897.png" alt="image-20200425092307897" style="zoom:67%;" />

### 3.代码实现

* GUI窗口的实现  

  ```java
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
  ```

* 按钮监听器的实现

  ```java
  btn1.addActionListener(new ActionListener(){//监听事件
  			public void actionPerformed(ActionEvent arg0) {
  			ChoiseCourse choice=new ChoiseCourse();//点击按钮时，对choice进行实例化，进行页面的跳转
  			}
  		});
  
  		
  ```

* 添加课程的实现：设置一个管理的账户密码都是Admin，当登录成功时可以对课程新加

  ```java
  if(tf2.getText().equals("Admin")&&ps.getText().equals("Admin")){
  			AddCourse print=new AddCourse();
  		}
  ```

* 注册登录等读取文件操作，抽取出来成为一个类，类中有读写文件的操作

  ```java
  public String readFile(String filename) {
  		  String str="";
  		  String pathname = "F:\\IdeaProjects\\BASIC_code\\course_selection_system\\"+filename+".txt";
  		  try (FileReader reader = new FileReader(pathname);
  		       BufferedReader br = new BufferedReader(reader) 
  		  ) {
  		      String line;
  		      while ((line = br.readLine()) != null) { //判断每一行是否为空
  		      	str=str+line;//读出每一行
  		      }
  		  } catch (IOException e) {//捕捉异常
  		      e.printStackTrace();
  		  }
  		  return str;
  	}
  	
  	public void writeFile(String filename,String s) {
  		String pathname = "F:\\IdeaProjects\\BASIC_code\\course_selection_system\\"+filename+".txt";
  		  try {
  			  if(filename=="user") {
  		      File writeName = new File(pathname); 
  		      writeName.createNewFile(); 
  		      try (FileWriter writer = new FileWriter(writeName,true);
  		           BufferedWriter out = new BufferedWriter(writer)
  		      ) {
  		      		if(s!=null) {
  		      		out.write(s); 
  		      	}
  		          out.flush(); 
  		      }
  			  }
  			  else {
  				  File writeName = new File(pathname); 
  			      writeName.createNewFile(); 
  			      try (FileWriter writer = new FileWriter(writeName);
  			           BufferedWriter out = new BufferedWriter(writer)
  			      ) {
  			      		if(s!=null) {
  			      		out.write(s); 
  			      	}
  			          out.flush(); 
  			      }
  			  }
  		  } catch (IOException e) {
  		      e.printStackTrace();
  		  }
  	}
  ```



### 4.实验收获

* 这次实验是一个综合性试验，非常考验学生的综合能力。我在这个实验中总结方法思考方法，我使用了GUI窗体的设计，文件读取输出等。这次基本上把之前学习到的知识都用上了，让我对java的面向对象的程序设计有了更多的理解。









































