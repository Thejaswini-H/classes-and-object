class SpecsTest{

public static void main(String a[])
{
Specs spec=new Specs();
spec.name="Tom Ford";
spec.cost=1500;
System.out.println(spec.name+" "+spec.cost);
spec.getSpecs();

Specs spec1=new Specs();
spec1.name="Ray-Ban";
spec1.cost=2100;
System.out.println(spec1.name+" "+spec1.cost);
spec1.getSpecs();

Specs spec2=new Specs();
spec2.name="prada";
spec2.cost=1250;
System.out.println(spec2.name+" "+spec2.cost);
spec2.getSpecs();
}
}

