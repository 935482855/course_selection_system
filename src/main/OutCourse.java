package main;

public class OutCourse {
	public String[] outCourse() {
		Teacher li=new Teacher("001","����","��","��ѧ");
		Teacher zhang=new Teacher("002","����","Ů","����");
		Teacher wang=new Teacher("003","����","��","����");
		Course cou1=new Course("1","����","��һ����","8:00",li);
		Course cou2=new Course("2","Ӣ��","�ڶ�����","9:00",zhang);
		Course cou3=new Course("3","Java�������","��������","10:00",wang);
		String [] Courses= new String[20];
		Courses[0]=cou1.toString();
		Courses[1]=cou2.toString();
		Courses[2]=cou3.toString();
		Object_in_out file=new Object_in_out();
		for(int i=0;i<file.readFile("course").split("��").length;i++) {
			Courses[i+5]=file.readFile("course").split("��")[i]+"��";
		}
		return Courses;
		}
}
