package gt.edu.miumg;

public class TransferenciaBancaria implements PaymentStrategy {
    @Override
    public void procesarPago(double monto) {
        // Lógica para validaciones manuales de transferencia
        System.out.println("Procesando pago con Transferencia Bancaria: " + monto);
    }
}