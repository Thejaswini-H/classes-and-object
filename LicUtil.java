class LicUtil{

public static void main(String a[])
{
LicDTO dto=new LicDTO();
dto.setPolicyId(457);
dto.setName("abc");
dto.setYears(15);

System.out.println(dto.getPolicyId()+" "+dto.getName()+" "+dto.getYears());
}
}