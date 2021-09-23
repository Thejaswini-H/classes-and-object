class IceCreamUtil{

public static void main(String a[])
{

IceCream icecream = new IceCream();
icecream.name="Cone";
icecream.flavour="Chocolate";
icecream.cost=30;
System.out.println(icecream.name+" "+icecream.flavour+" "+icecream.cost);

IceCream icecream1 = new IceCream();
icecream1.name="Titanic";
icecream1.flavour="Chocolate pista butterScotch";
icecream1.cost=130;
System.out.println(icecream1.name+" "+icecream1.flavour+" "+icecream1.cost);

IceCream icecream2 = new IceCream();
icecream2.name="little bites";
icecream2.flavour="Cotton candy";
icecream2.cost=5;
System.out.println(icecream2.name+" "+icecream2.flavour+" "+icecream2.cost);
}
}