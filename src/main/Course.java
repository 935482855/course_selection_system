package main;



public class Course {
	String num;
	String courname;
	String place;
	String time;
	Teacher teaname;
	public Course(String num,String courname,String place,String time,Teacher teaname) {
		this.num=num;
		this.courname=courname;
		this.place=place;
		this.time=time;
		this.teaname=teaname;
	}
	public String toString() {
		return "\n"+"�γ̺ţ�"+num+" ���γ����ƣ�"+courname+" ���γ̵ص㣺"+place+" ���γ�ʱ�䣺"+time+"��"+teaname;
	}
}