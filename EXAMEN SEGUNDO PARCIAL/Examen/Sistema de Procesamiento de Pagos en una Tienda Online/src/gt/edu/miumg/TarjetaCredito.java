package gt.edu.miumg;

public class TarjetaCredito implements PaymentStrategy {
    private boolean tarjetaValida = true;  // Cambiar a `false` para simular tarjeta inválida

    @Override
    public void procesarPago(double monto) {
        if (!tarjetaValida) {
            // Simulación de tarjeta no válida
            System.out.println("Error: La tarjeta de crédito no es válida. Transacción fallida.");
        } else {
            // Lógica de pago con tarjeta válida
            System.out.println("Validando número de tarjeta...");
            System.out.println("Validando CVV...");
            System.out.println("Autorizando pago con banco...");
            System.out.println("Pago con tarjeta de crédito completado: $" + monto);
        }
    }
}





