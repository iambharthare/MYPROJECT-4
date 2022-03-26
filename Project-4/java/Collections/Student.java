package in.co.rays.Collections;

public class Student implements Comparable<Student> {
	private String id;
	private String name;
	private int phoneno;

	public Student(String id, int phoneno, String name) {
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {

		return "Student[id=" + id + ", name=" + name + ", phoneno=" + phoneno + "]";
	}

	@Override
	public int compareTo(Student o) {

		return this.id.compareTo(o.id);
	}

}
