class PropertyUtil{
public static void main(String a[]){

PropertyDTO dto= new PropertyDTO();
dto.setPropertyId(345658);
dto.setName("abinav");
dto.setLocation("Shimoga");
dto.setSize("1345sqft");

System.out.println(dto.getPropertyId()+" "+dto.getName()+" "+dto.getLocation()+" "+dto.getSize());
}
}