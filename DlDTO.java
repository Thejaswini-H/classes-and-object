public class DlDTO{

public DlDTO()
{
System.out.println("Object is created");
}
private String dlNo;
private String name;
private String cov;
private int iy;

public String getDlNo(){
return dlNo;
}
public String getName(){
return name;
}
public String getCov(){
return cov;
}
public int getIy(){
return iy;
}
public void setDlNo(String dlNo){
this.dlNo=dlNo;
}
public void setName(String name){
this.name=name;
}
public void setCov(String cov){
this.cov=cov;
}
public void setIy(int iy){
this.iy=iy;
}
}