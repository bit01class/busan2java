class Ex06{
static Ex06 me;
static int su=1;
	// f1(3)
  public static int func01(int su){
	if(su==0) return 0;
	else return su--+func01(su);
  }
/*
return 3+2+1+0;

*/
  public void func02(){
	System.out.println("func02 run..");
  }

  public Ex06 func03(){
	System.out.println("func03 run...");
	return this;
  }
  public void func04(){
	System.out.println("f4 run..");
	this.func05();
  }

  public void func05(){
	System.out.println("f5 run..");
  }

  public static void main(String[] args){
	//int sum=func01(5);
	//System.out.println("3+2+1="+sum);
	Ex06 me=new Ex06();
	//me.func03().func03().func03().func03();
	
  }


}