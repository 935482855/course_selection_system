package main;

public class Student extends People {
	Course choicecour;
	String score;
	public Student(String id, String name, String sex,Course choicecour,String score) {
		super(id, name, sex);
		this.choicecour=choicecour;
		this.score=score;
		}
	public String toString() {
		return "ѧ����Ϣ��	ѧ�ţ�"+id+" �������� "+name+" ���Ա�"+sex+"��"+choicecour;
	}
}