class Recu_fact
{	
	 static int fact=1;
	void recfact(int no)
	{
		if(no>1)
		{
			fact=fact*no;
			recfact(no-1);//recursion
			
		}
	}
	public static void main(String args[])
	{
		int no=5;
		Recu_fact rf=new Recu_fact();
		rf.recfact(no);	
		System.out.println(fact);


	}
}