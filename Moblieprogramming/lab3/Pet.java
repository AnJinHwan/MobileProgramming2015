package lab3;

public class Pet extends Animal{
	private String name;
	private int age; // in year
	private double weight; // in pounds
	
	//오버라이딩
	
	public String toString() {
		
		return ("Name:"+name +"Age"+age+"Years"+"\nWeight"+weight+"pounds");
	}
	
	public Pet(String initialName, int initialAge, double initialWeight){
		
		if (initialAge<0 || initialWeight<0)
		{
			System.out.println("Error: Negative age or Negative Weight");
			System.exit(0);
		}
		
		name=initialName;
		age=initialAge;
		weight=initialWeight;
	}
	//오버로딩
	
	public Pet(String initialName)
	{
		name = initialName;
		age = 0;
		weight = 0;

		
	}
	
	public Pet(int initialAge)
	{
		name = "No name yet";
		weight=0;
		if (initialAge<0)
		{
			System.out.println("Error: Negative age");
			System.exit(0);
		}
		else 
			age= initialAge;
		
		}
	
	public Pet()
	{
		name= "No name yet";
		age =0;
		weight=0;
		
	}
public Pet(String initialName, int initialAge, double initialWeight, String iniGender) {  //추가
		
		super(iniGender);  // 부모 클래스 생성자 초기화  젠더의 생성자 호출해서 젠더값을 받는다
		name = initialName;
		if ((initialAge < 0) || (initialWeight < 0)) {
			System.out.println("Error: Negative age or weight.");
			System.exit(0);
		} else {
			age = initialAge;
			weight = initialWeight;
		}
	}
	
	public void set(String newName,int newAge, double newWeight)
	{
		name=newName;
		age=newAge;
		weight=newWeight;
	}
	
	public void setAge(int newAge)
	{
		if (newAge<0)
		{
			System.out.println("Error: Negative age");
			System.exit(0);
		}
		age=newAge;
		
	}
	
	public void setWeight( double newWeight)
	{
		if (newWeight<0)
		{
			System.out.println("Error: Negative Weight");
			System.exit(0);
		}
		weight=newWeight;
	}
	
	public String getName()
	{
			return name;
		
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	
	}
