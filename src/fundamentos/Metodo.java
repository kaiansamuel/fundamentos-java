package fundamentos;

public class Metodo {

    public static void main(String[] args) {

        metodoSemArgumento();
        metodoComArgumento("Argumento de Teste");
    }

    private static void metodoComArgumento(String argumento1){
        System.out.println("Método com argumento" + argumento1);
    }

    public static void metodoSemArgumento() {
        System.out.println("Método sem argumento");
    }
}
