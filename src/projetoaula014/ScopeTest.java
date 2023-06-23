// @author RA21600867
package projetoaula014;
public class ScopeTest {
    public static void main(String[] args) {
        Scope testScope = new Scope();
        Scope testScope2 = new Scope(10);
        testScope.begin();
        testScope.begin();
        System.out.printf("O campo x é %d\n", testScope.getField());
        testScope.setField(55);
        System.out.printf("O campo x é %d\n", testScope.getField());
        testScope.useLocalVariable2(10);
        testScope2.begin();
    }
}