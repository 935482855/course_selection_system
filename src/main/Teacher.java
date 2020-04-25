package main;

public class Teacher extends People{
	String teachcour;
	public Teacher(String id, String name, String sex,String teachcour) {
		super(id, name, sex);
		this.teachcour=teachcour;
	}
	public String toString() {
		return "\n"+"授课教师:工号："+id+" ,姓名："+name+" ,性别："+sex+"。";
	}
}