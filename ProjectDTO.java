public class ProjectDTO{

public ProjectDTO(){
System.out.println("Object is created");
}
private String name;
private int memNo;
private String guideName;

public String getName(){
return name;
}
public int getMemNo(){
return memNo;
}
pubic String getGuideName(){
return guideName;
}
public void setName(String name){
this.name=name;
}
public void setMemNo(int memNo){
this.memNo=memNo;
}
public void setGuideName(String guideName){
this.guideName=guideName;
}
}