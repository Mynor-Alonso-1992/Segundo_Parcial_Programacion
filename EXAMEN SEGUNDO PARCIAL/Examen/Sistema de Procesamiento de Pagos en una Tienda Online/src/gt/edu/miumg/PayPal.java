package gt.edu.miumg;

public class PayPal implements PaymentStrategy {
    @Override
    public void procesarPago(double monto) {
        // Lógica para autenticación y procesamiento con PayPal
        System.out.println("Procesando pago con PayPal: " + monto);
    }
}