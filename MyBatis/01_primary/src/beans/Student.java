package beans;

public class Student {
	private Integer id;                        //包装类可以进行 id == null 的操作          //id是成员变量  ！= 属性
	private String name;
	private int age;
	private double score;
	
	public Student() {                        //有带参构造函数时，最好构造一个无参构造器
		super();
	}
	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public void setId(Integer id) {               //属性：get/set方法去掉get/set后字母小写的：id是属性
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
}
