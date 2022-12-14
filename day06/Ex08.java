class Car{
	public int speed;
	public int maxSpeed;
	public String model;
	public Car(){
		this.model="기본차";
		this.maxSpeed=150;
	}
	public Car(int maxSpeed){
		this();
		this.maxSpeed=maxSpeed;
	}
	public Car(int maxSpeed,String model){
		this();
		this.maxSpeed=maxSpeed;
		this.model=model;
	}
}
class Ex08{

public static void main(String[] args){

	Car car2=new Car();
	System.out.println(car2.model);
}

}





