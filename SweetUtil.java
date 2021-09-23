class SweetUtil{
public static void main(String a[])
{
Sweet sweet = new Sweet();
sweet.name="Gulab jamun";
sweet.amount=10;
System.out.println(sweet.name+" "+sweet.amount);
sweet.taste();
Sweet sweet1 = new Sweet();
sweet1.name="Rasmalai";
sweet1.amount=20;
System.out.println(sweet1.name+" "+sweet1.amount);
sweet.taste();
Sweet sweet2 = new Sweet();
sweet2.name="Mysore pak";
sweet2.amount=15;
System.out.println(sweet2.name+" "+sweet2.amount);
sweet.taste();
}
}