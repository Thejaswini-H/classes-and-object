 public class PatientDTO{ //*data transfer object*//

public PatientDTO(){
System.out.println("PatientDTO object is created");
}

private long patientId;
private String patientName;
private int age;
private String patientGender;
private String bloodGroup;
private String address;

public long getPatientId(){     //*get method*//
 return this.patientId;

}
public void setPatientId(long patientId){
this.patientId=patientId;
}
public String getPatientName(){
return patientName;
}
public void setPatientName(String patientName){
this.patientName=patientName;
}

public int getAge(){
return age;
}
public void setAge(int age){
this.age=age;
}

public String getPatientGender(){
return patientGender;
}
public void setPatientGender(String patientGender){
this.patientGender=patientGender;
}
public String getBloodGroup(){
return bloodGroup;
}
public void setBloodGroup(String bloodGroup){
this.bloodGroup=bloodGroup;
}
public String getAddress(){
return address;
}
public void setAddress(String address){
this.address=address;
}
}