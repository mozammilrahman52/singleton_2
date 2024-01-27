public class A {
    private static  A a;
    private A(){

    }
    public static A getA(){
        if(a == null){
            synchronized (A.class){
                if(a == null){
                    a = new A();
                }
            }
        }
        return a;
    }
}
