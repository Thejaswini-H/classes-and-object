class GoldUtil{
public static void main(String a[])
{

GoldDTO dto=new GoldDTO();
dto.setGoldId(345);
dto.setType("kdm");
dto.setPrice(45000);
System.out.println(dto.getGoldId()+" "+dto.getType()+" "+dto.getPrice());
}
}
