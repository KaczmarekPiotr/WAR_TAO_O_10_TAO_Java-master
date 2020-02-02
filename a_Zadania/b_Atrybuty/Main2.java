package a_Zadania.b_Atrybuty;


public class Main2 {

    public static void main(String[] args) {

        AccessModifier testAttribute = new AccessModifier();

        System.out.println(testAttribute.protectedAttribute);
        System.out.println(testAttribute.publicAttribute);
       // System.out.println(testAttribute.privateAttribute); - nie ma dostepu do atrybutu prywatnego

    }
}
