package gt.edu.miumg;

public class PaymentFactory {
    public static PaymentStrategy getPaymentMethod(String metodo) {
        switch (metodo) {
            case "TarjetaCredito":
                return new TarjetaCredito();
            case "TarjetaCreditoInvalida":  // Tarjeta no válida
                return new TarjetaCreditoInvalida();
            case "PayPal":
                return new PayPal();
            case "CriptoMonedas":
                return new CriptoMonedas();
            case "TransferenciaBancaria":
                return new TransferenciaBancaria();
            default:
                throw new IllegalArgumentException("Método de pago no soportado.");
        }
    }
}

