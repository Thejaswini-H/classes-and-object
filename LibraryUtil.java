class LibraryUtil{
public static void main(String a[]){
LibraryDTO dto=new LibraryDTO();
dto.setLibId(9865);
dto.setName("Central library");
dto.setAddress("Jail circle");
dto.setBookNo(678);
System.out.println(dto.getLibId()+" "+dto.getName()+" "+dto.getAddress()+" "+dto.getBookNo());
}
}
