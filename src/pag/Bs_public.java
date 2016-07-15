
package pag;
//Модификатор доступа умолчанию 
public class Bs_public {
    public static void main(String args[]){
        A_public ob=new A_public();
        pag1.A1_deault ob1=new pag1.A1_deault();
        
        ob.a=1;
        System.out.println("Открытый "+ob.a);
        //нет доступа т.к другой пакет
         //ob1.b=2; 
}
}