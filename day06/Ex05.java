class Car{
	public final String model;
	public int speed;
	public int maxSpeed;

	public Car(){
		model="부가티";
		maxSpeed=400;
		showSpeed();
	}

	public Car(String a,int b){
		model=a;
		maxSpeed=b;
		showSpeed();
	}

	public void showSpeed(){
		System.out.println(model+"내차 속도는 "+speed+"km");	
	}

	public void speedUp(){
		if(speed+10<=maxSpeed){
			speed+=10;
		}else{
			speed=maxSpeed;
		}
	}
	public void speedDown(){
		if(speed-17>=0){
			speed-=17;
		}else{
			speed=0;
		}
	}
}
class Ex05{
	public static void main(String[] args){
		Car myCar;
		myCar=new Car();
		for(int i=0; i<30; i++){
		myCar.speedUp();
		myCar.showSpeed();	
		}
		
		for(int i=0; i<30; i++){
		myCar.speedUp();
		myCar.showSpeed();	
		}
	}
}