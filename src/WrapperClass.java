public class WrapperClass {
    public static void main(String[] args) {
        /*
        Cada dato primitivo (salvo el String) tiene su clase envoltorio (Wrapper Class)
        que nos permite realizar operaciones con ellos.
        Se identificar por empezar con mayusculas
        int = Integer
        double = Double
        char = Character
        boolean = Boolean
         */

        System.out.println("Byte: " + Byte.SIZE);
        // esto nos devolverá 8, ya que un byte tiene 8 bits
        System.out.println("Byte: " + Byte.BYTES);
        // esto nos devolverá 1, ya que un byte tiene 1 byte
        System.out.println("Integer: " + Integer.SIZE);
        // esto nos devolverá 32, ya que un int tiene 32 bits
        System.out.println("Integer: " + Integer.BYTES);
        // esto nos devolverá 4, ya que un int tiene 4 bytes

        // A traves de la wrapper class podemos convertir un dato primitivo a otro
    }
}
