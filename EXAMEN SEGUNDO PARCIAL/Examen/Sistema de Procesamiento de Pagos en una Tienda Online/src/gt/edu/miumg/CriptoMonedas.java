package gt.edu.miumg;

public class CriptoMonedas implements PaymentStrategy {
    @Override
    public void procesarPago(double monto) {
        // Lógica para validar transacciones en blockchain
        System.out.println("Procesando pago con CriptoMonedas: " + monto);
    }
}
