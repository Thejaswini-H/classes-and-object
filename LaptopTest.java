class LaptopTest{
public static void main(String a[]){

Laptop laptop =new Laptop();
laptop.name="HP";
laptop.cost=50000;
laptop.processor="AMD";
System.out.println(laptop.name+" "+laptop.cost+" "+laptop.processor);
laptop.getLaptop();

Laptop laptop1 =new Laptop();
laptop1.name="Dell";
laptop1.cost=70000;
laptop1.processor="Intel";
System.out.println(laptop1.name+" "+laptop1.cost+" "+laptop1.processor);
laptop1.getLaptop();

Laptop laptop2 =new Laptop();
laptop2.name="HP";
laptop2.cost=80000;
laptop2.processor="intel";
System.out.println(laptop2.name+" "+laptop2.cost+" "+laptop2.processor);
laptop2.getLaptop();
}
}
