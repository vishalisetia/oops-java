package recursion;

public class recursion {
	static void fun(int n)
	{
		if(n == 0)
			return;
		fun(n - 1);
		System.out.println("n = " + n);
		fun(n - 1);
	}
    public static void main(String [] args) 
    {
        fun(3);
    }
}


