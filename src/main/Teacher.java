package main;

public class Teacher extends People{
	String teachcour;
	public Teacher(String id, String name, String sex,String teachcour) {
		super(id, name, sex);
		this.teachcour=teachcour;
	}
	public String toString() {
		return "\n"+"�ڿν�ʦ:���ţ�"+id+" ,������"+name+" ,�Ա�"+sex+"��";
	}
}