interface sim
{
    void startsim();
}
class jio implements sim
{
    public void startsim()
    {
        System.out.println("welcome to jio");
    }
}
class airtel implements sim
{
    public void startsim()
    {
        System.out.println("welcome to airtel");
    }
}
class mobile
{
    mobile()
    {
         airtel a =new airtel();
        a.startsim();
    }
    public void startsim()
    {
        System.out.println("welcome to mobile");
    }
}
class interface1
{
    public static void main(String[] args) {
        new mobile();
        jio j=new jio();
        j.startsim();
    }
}