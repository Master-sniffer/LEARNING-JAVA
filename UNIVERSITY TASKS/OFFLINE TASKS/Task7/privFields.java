public class Main
{

public static void main(String[] args)
{
Main Example = new Main();
Example.repr();
}

void repr()
{
A a = new A();
B b = new B();
b.rtn(a);

}
class A{
private String field = "I'm private field";}
class B{

void rtn(A a)
{
System.out.println(a.field);
}

}
}
