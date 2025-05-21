

class parent{
    void show()
    {
        System.out.println("method of parent class");
    }
}
class middle extends parent{
    void show()
    {
        System.out.println("method of middle class");
    }
}
class child extends middle{
    void show()
    {
        System.out.println("method of child class");
    }
}

public class Multilevel {
    public static void main(String args[])
    {
        parent c=new middle();
        c.show();
        parent c1=new child();
        c1.show();

    }
    
}
