class Point2D
{
    int x;
    int y;
    void display()
    {
        System.out.println("x="+x+"y="+y);
    }
}
class Point2D extends Point3D
{
    int z;
    void display()
    {
        System.out.println("x="+x+"y="+y+"z="+z);
    }
}
class simpleSingleInheritance
{
    public static void main(String args[])
    {
        Point2D P1 = new P1();
        Point3D P2 = new P2();
        P1.x = 10;
        P1.y = 20;
        System.out.println("Point2D P1 is" + P1.display());
        // initializing point3d
        P2.x = 5;
        P2.y = 6;
        P3.z = 15;
        System.out.println("Point3D P2 is" + P2.display());
        
    }
}

        
        
