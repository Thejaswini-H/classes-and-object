public class LibraryDTO{

public LibraryDTO(){
System.out.println("Object is created");
}
private int libId;
private String name;
private String address;
private int bookNo;

public int getLibId(){
return libId;
}
public String getName(){
return name;
}
public String getAddress(){
return address;
}
public int getBookNo(){
return bookNo;
}
public void setLibId(int libId){
this.libId=libId;
}
public void setName(String name){
this.name=name;
}
public void setAddress(String address){
this.address=address;
}
public void setBookNo(int bookNo){
this.bookNo=bookNo;
}
}