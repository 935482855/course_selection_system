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
		return "\n"+"课程号："+num+" ，课程名称："+courname+" ，课程地点："+place+" ，课程时间："+time+"；"+teaname;
	}
}