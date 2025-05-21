class parent
{
    parent(){
    System.out.println ("welcome to parent class");
    }
}
class child extends parent
{
    child()
    {
    
    System.out.println ("welcome to child class");
    }
}
class Single
{
    public static void main(String args[])
    {
        
        child c=new child();
    }
}