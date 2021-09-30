class LicDTO{

public LicDTO(){
System.out.println("Object is created");
}

private int policyId;
private String name;
private int years;

public int getPolicyId(){
return policyId;
}
public String getName(){
return name;
}
public int getYears(){
return years;
}
public void setPolicyId(int policyId){
this.policyId=policyId;
}
public void setName(String name){
this.name=name;
}
public void setYears(int years){
this.years=years;
}
}