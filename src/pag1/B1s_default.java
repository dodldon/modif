package pag1;
//модификатор доступа private 
public class B1s_default {

    public static void main(String args[]) {
        A1_deault ob1 = new A1_deault();
        pag.A_public ob = new pag.A_public();
        pag2.A2_private ob2 = new pag2.A2_private();
     //модификатор доступа private 
        //ob2.setA(2);
        ob.a = 1;
        System.out.println("модификатор доступа по умолчанию " + ob.a);
        //доступ из другого пакета,метод доступа public
        ob1.b = 2;
        System.out.println("модификатор доступа public " + ob1.b);

    }
}
