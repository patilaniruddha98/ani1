package ani1;
class Example_3 {
    public static void main(String args[]){
        Son obj=new Son();
        obj.add();
        obj.call();
    }
    
}
class Father{
    void add(){
        int x=52;
        int sum=x+x;
        System.out.println(sum);
    }
}
interface Mother{
    void call();
}
class Son  extends Father implements Mother{
    public void call(){
        System.out.println("aniruddha");
    }

}
