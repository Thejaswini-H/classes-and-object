public class PropertyDTO{

public PropertyDTO()
{
System.out.println("Object is created");
}

private long propertyId;
private String name;
private String location;
private String size;

public long getPropertyId()
{
return propertyId;
}

public void setPropertyId(long propertyId)
{
this.propertyId=propertyId;
}
public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}
public String  getLocation()
{
return location;
}
public void setLocation(String location){
this.location=location;
}
public String getSize(){
return size;
}
public void setSize(String size){
this.size=size;
}
}