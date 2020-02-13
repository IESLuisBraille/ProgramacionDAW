package unidad7;

class A
{

    class B
    {
        // static int x; not allowed here
    	int a = 1;
    
    	
    }

    static class C
    {
        static int x; // allowed here
        static int getX() {
        	return x;
        }
    }
}