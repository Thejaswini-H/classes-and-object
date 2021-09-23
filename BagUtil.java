class BagUtil{
public static void main(String a[]){
Bag bag=new Bag();
bag.bagId=123;
bag.name="Wildcraft";
bag.color="Black";
bag.price=1965;
System.out.println(bag.bagId+" "+bag.name+" "+bag.color+" "+bag.price);
bag.packing();

Bag bag1=new Bag();
bag1.bagId=456;
bag1.name="American Tourister";
bag1.color="Black";
bag1.price=2300;
System.out.println(bag1.bagId+" "+bag1.name+" "+bag1.color+" "+bag1.price);
bag.packing();


Bag bag2=new Bag();
bag2.bagId=789;
bag2.name="Skybag";
bag2.color="Grey";
bag2.price=2540;
System.out.println(bag2.bagId+" "+bag2.name+" "+bag2.color+" "+bag2.price);
bag.packing();
}
}