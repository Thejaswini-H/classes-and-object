class AmusementParkTest{
public static void main(String a[])
{
AmusementPark amp=new AmusementPark();
amp.name="Wonderland";
amp.fee=1000;
System.out.println(amp.name+" "+amp.fee);
amp.gaming();

AmusementPark amp1 =new AmusementPark();
amp1.name="GRS";
amp1.fee=750;
System.out.println(amp1.name+" "+amp1.fee);
amp1.gaming();

AmusementPark amp2 =new AmusementPark();
amp2.name="Veega land";
amp2.fee=850;
System.out.println(amp2.name+" "+amp2.fee);
amp2.gaming();
}
}
