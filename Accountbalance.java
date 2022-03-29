package Mypackage;
class Balance
{
String name;
double bal;
Balance(String s, double d)
{
name = s;
bal= d;
}
void show()
[
if(bal<0)
System.out.println("not defined Balance");
System.out.println("value of name "+" "+name);
System.out.println("value of Balance "+" "+bal);
}
]
class Accountbalance
{
public static void main(String args[])
{
Balance b1[] = new Balance[3];
b1[0] = new Balance("Henry",1000);
b1[1] = new Balance("kim",2000);
b1[2] = new Balance("Chopra",-1500);
for(int i=0;i<3;i++)
b1[i].show();
}
}