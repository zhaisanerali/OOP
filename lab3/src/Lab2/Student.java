package Lab2;



public class Student {
	private String name;
    private String id;
    private int year;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.year = 2;
    }

    
    public String getName() { return name; }
    public void incrementYear() { year++; }
    
    public  String getId() {
    	return id;
    }
    

    
    public static void main(String[] args) {
        Student s = new Student("Ivan", "22B0101");
        s.incrementYear();
        System.out.println(s.getName() + " study year: " + s.year);
    }
}
