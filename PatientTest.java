class PatientTest{
public static void main(String a[]){

 PatientDTO dto= new PatientDTO();
dto.setPatientId(46578786);
dto.setPatientName("byz");
dto.setAge(89);
dto.setPatientGender("male");
dto.setBloodGroup("B+ve");
dto.setAddress("Rajaji nagar");
System.out.println(dto.getPatientId()+" "+dto.getPatientName()+" "+dto.getAge()+" "+dto.getPatientGender()+" "+dto.getBloodGroup()+" "+dto.getAddress());


}

}