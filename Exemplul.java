public class Exemplul{
    public static void main(String [] args){
        String x = 3>6 ? "Hello": "World";
        
        System.out.println(x);
        
        String y= 3 > 5 ? (3 < 7 ? "a" : "b" ): "c";
        System.out.println(y);
    }
}