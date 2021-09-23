class ChocolateUtil{

public static void main(String a[])
{
Chocolate choki =new Chocolate();
choki.name="Dairy milk";
choki.cost=20;
System.out.println(choki.name+ " "+choki.cost);
choki.getChocolate();

Chocolate choki1 =new Chocolate();
choki1.name="Milky bar";
choki1.cost=10;
System.out.println(choki1.name+ " "+choki1.cost);
choki1.getChocolate();

Chocolate choki2 =new Chocolate();
choki2.name="Kit kat";
choki2.cost=25;
System.out.println(choki2.name+ " "+choki2.cost);
choki2.getChocolate();
}
}