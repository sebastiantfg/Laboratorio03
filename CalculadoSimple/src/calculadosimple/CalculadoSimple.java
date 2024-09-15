package calculadosimple;

class CalculadoSimple {
    private double num1;
    private double num2;
    private String operacion;

    public void RealizarOperacion(double num1, String operacion) {
        this.num1 = num1;
        this.operacion = operacion;
    }

    public double calcular(double num2) {
        this.num2 = num2;
        double resultado = 0;
        
        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    throw new ArithmeticException("División por cero no permitida");
                }
                break;
        }
        return resultado;
    }

    public void reset() {
        num1 = 0;
        num2 = 0;
        operacion = "";
    } 

    public static void main(String[] args) {
                new JFrameCalculadora().setVisible(true);
    }
    
}
