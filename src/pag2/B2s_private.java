
package pag2;

public class B2s_private {
    public static void main(String args[]){
        A2_private ob2=new A2_private();
        pag.A_public ob=new pag.A_public();
        ob2.setA(2);
        System.out.println("закрытый "+ ob2.getA());
        ob.a=1;
        System.out.println("public "+ ob.a);
    
}
}