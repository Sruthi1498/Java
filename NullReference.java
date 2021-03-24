public class NullReference {

    int a = 10;
    public static int add(NullReference o)
    {
        /*if(o==null)
        {
            o = new NullReference();
        }*/
        int b = 10+o.a;
        return b;
    }

    public static void main(String[] args) {
        NullReference o = null;
        //System.out.println(add(o));
        NullReference o1 = new NullReference();
        System.out.println(add(o1));
    }

}
