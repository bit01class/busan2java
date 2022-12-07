class Ex09
{
public static void main(String[] args)
{
int item1=3,item2=4,item3=2;
String msg="-------------------------------------";
msg+="\n비플제로페이 영수증";
msg+="\n-------------------------------------";
msg+="\n품목		정가	수량	금액";
msg+="\n-------------------------------------";
msg+="\n생수		1200	"+item1+"	"+1200*item1;
msg+="\n풍선껌		500	"+item2+"	"+500*item2;
msg+="\n과자		3500	"+item3+"	"+3500*item3;
msg+="\n-------------------------------------";
msg+="\n합계				"+(1200*item1+500*item2+3500*item3);
System.out.println(msg);

}
}