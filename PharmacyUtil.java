class PharmacyUtil{
public static void main(String a[]){

PharmacyDTO dto= new PharmacyDTO();
dto.setId(4657);
dto.setName("avc");
dto.setLocation("shimoga");

System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getLocation());
}
}