class CameraUtil{
 
public static void main(String a[])
{
Camera cam= new Camera();
cam.name="Nikon D3500";
cam.cost=44000;
cam.iso="ISO 100-25600";
System.out.println(cam.name+" "+cam.cost+" "+cam.iso);

Camera cam1= new Camera();
cam1.name="Canon EOS 1500D";
cam1.cost=65000;
cam1.iso="ISO 100-25800";
System.out.println(cam1.name+" "+cam1.cost+" "+cam1.iso);

Camera cam2= new Camera();
cam2.name="Sony FE 200";
cam2.cost=155000;
cam2.iso="ISO 100-5660";
System.out.println(cam2.name+" "+cam2.cost+" "+cam2.iso);
}
}

