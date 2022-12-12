class Ex04{
/*
static -> static		[클래스명.]메서드명();
static -> non-static		참조변수.메서드명();
non-static -> static		[클래스명.]메서드명();
non-static -> non-static	[참조변수.]메서드명();

*/
public static void main(String[] args){
  func01();
  Ex04 me=new Ex04();
  me=new Ex04();
  me.func02();
}

  public static void func01(){
    System.out.println("static method func01()...");
  }

  public void func02(){
    System.out.println("non-static method func02()...");
    func01();
  }
  public void func03(){
    System.out.println("non-static method func03()...");
  }
}