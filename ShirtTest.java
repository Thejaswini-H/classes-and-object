class ShirtTest{
public static void main(String a[])
{
Shirt shirt= new Shirt();
shirt.name="peter england";
shirt.cost=900;
shirt.size='L';
System.out.println(shirt.name+" "+shirt.cost+" "+shirt.size);
shirt.getShirt();

Shirt shirt1= new Shirt();
shirt1.name="Raymond";
shirt1.cost=950;
shirt1.size='M';
System.out.println(shirt1.name+" "+shirt1.cost+" "+shirt1.size);
shirt1.getShirt();

Shirt shirt2= new Shirt();
shirt2.name="crocodile";
shirt2.cost=1000;
shirt2.size='L';
System.out.println(shirt2.name+" "+shirt2.cost+" "+shirt2.size);
shirt2.getShirt();
}
}

