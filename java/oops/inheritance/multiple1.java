// using interface


interface frontend
{
    void display();
}
interface backend
{
    void show();
}
class fullstack implements frontend,backend
{
    public void display()
    {
        System.out.println("it contains client side");
    }
    public void show()
    {
        System.out.println("is contains server side");
    }
}
class java implements backend
{
    
    public void show()
    {
        System.out.println("java is used in backend");
    }

}
class multiple1
{
    public static void main(String args[])
    {
        java j1=new java();
        j1.show();
        fullstack fs=new fullstack();
        fs.display();
        fs.show();
    }
}

