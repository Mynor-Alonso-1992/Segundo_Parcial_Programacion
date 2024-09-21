package gt.edu.miumg;

public class TarjetaCreditoInvalida implements PaymentStrategy {
    @Override
    public void procesarPago(double monto) {
        // Simulación de una tarjeta inválida
        System.out.println("Error: La tarjeta de crédito ingresada es inválida. Transacción cancelada.");
    }
}