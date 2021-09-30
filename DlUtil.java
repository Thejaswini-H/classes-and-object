class DlUtil{

public static void main(String a[]){

DlDTO dto = new DlDTO();
dto.setDlNo("KA14202102171");
dto.setName("xyz");
dto.setCov("LMV");
dto.setIy(2021);
 System.out.println(dto.getDlNo()+" "+dto.getName()+" "+dto.getCov()+" "+dto.getIy());
}
}