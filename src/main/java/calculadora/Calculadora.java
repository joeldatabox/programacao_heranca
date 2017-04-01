package calculadora;

public class Calculadora {

    public Number multiplicar(Number num1, Number num2) {
        
        return num1.doubleValue() * num2.doubleValue();
    }

    public Number dividir(Number num1, Number num2) {
        return num1.doubleValue() / num2.doubleValue();
    }
    
    public Number somar(Number num1, Number num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        System.out.println("c.multiplicar(1, 2) ->" + c.multiplicar(5, 2L));
        System.out.println("c.multiplicar(1F, 1F) ->" + c.multiplicar(1F, 1F));
        System.out.println("c.multiplicar(1L,2L) ->" + c.multiplicar(1L, 2L));
    }
}
