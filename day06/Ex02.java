class Car{
	public String model;
	public String color;
	public int speed;
	public int maxSpeed;
	//기능 -> 메서드
	public void speedUp(){
		if(speed+10<=maxSpeed){
		speed+=10;
		}else{
		speed=maxSpeed;
		}
	}
	public void speedDown(){
		if(speed-21>=0){
		speed-=21;
		}else{
		speed=0;
		}
	}
}

class Ex02{

public static void main(String[] args){
	Car myCar=new Car();
	myCar.model="모닝";
	myCar.color="빨강";
	myCar.maxSpeed=100;
	System.out.println(myCar.color+"색 내차 "
		+myCar.model+"의 현재 속도는 "+myCar.speed+"km");
	for(int i=0; i<19; i++){
		myCar.speedUp();
		System.out.println(myCar.color+"색 내차 "
		+myCar.model+"의 현재 속도는 "+myCar.speed+"km");
	}
	System.out.println("뛰어내림");
	myCar=new Car();
	myCar.model="아반떼";
	myCar.color="흰";
	myCar.maxSpeed=180;
	System.out.println(myCar.color+"색 내차 "
		+myCar.model+"의 현재 속도는 "+myCar.speed+"km");
	for(int i=0; i<19; i++){
		myCar.speedUp();
		System.out.println(myCar.color+"색 내차 "
		+myCar.model+"의 현재 속도는 "+myCar.speed+"km");
	}
	for(int i=0; i<16; i++){
		myCar.speedDown();
		System.out.println(myCar.color+"색 내차 "
		+myCar.model+"의 현재 속도는 "+myCar.speed+"km");
	}
}

}







