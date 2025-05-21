abstract class vehical
{
    abstract void car();
}
class toyota extends vehical
{
    void car(){
        System.out.println("is is nice car");
    }
}

public class multiple2 {
    public static void main(String args[])
    {
        toyota t=new toyota();
        t.car();
    }
    
}
