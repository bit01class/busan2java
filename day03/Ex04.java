class Ex04
{

public static void main(String[] args){
	// 연산자
	

	int a,b;
	a=5;
	b=2;
	a=+a;
	b=-(-b);
	a++;
	++b;
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	System.out.println(a>b);
	System.out.println(a>=b);
	System.out.println(a<b);
	System.out.println(a<=b);
	System.out.println(a==b);
	System.out.println(a!=b);
	boolean boo1=true;
	boolean boo2=false;
	System.out.println(!boo1);
	System.out.println(!!boo2);
	System.out.println("----------------------------");
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false);
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	int x,y,z;
	x=3;
	y=2;
	z=1;
	x+=z+y;	// x=x+(z+y);
	System.out.println(x);
	x-=z+y;	// x=x-(z+y);
	System.out.println(x);
	x*=z+y;	// x=x*(z+y);
	System.out.println(x);
	x/=z+y;	// x=x/(z+y);
	System.out.println(x);
	//byte m=2;
	//m=m+1;
	//System.out.println(m);
	byte n=2;
	n++;
	System.out.println(n);
	byte k=2;
	k+=2;
	System.out.println(k);
}
}






