class Demo
{
    void display()
    {
        System.out.println("Object is created");
    }

    protected void finalize()
    {
        System.out.println("Object is garbage collected");
    }
}

class Main
{
    public static void main(String args[])
    {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        d1.display();
        d2.display();
        d3.display();

        d1 = null;
        d2 = null;

        System.gc();

        System.out.println("Garbage collection requested");
    }
}
