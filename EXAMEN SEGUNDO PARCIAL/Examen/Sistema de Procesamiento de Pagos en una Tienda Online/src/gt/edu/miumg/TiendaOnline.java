package gt.edu.miumg;

public class TiendaOnline {
    private PaymentStrategy metodoPago;

    public void seleccionarMetodoDePago(String metodo) {
        this.metodoPago = PaymentFactory.getPaymentMethod(metodo);
    }

    public void procesarOrden(double monto) {
        if (metodoPago == null) {
            throw new IllegalStateException("Debe seleccionar un método de pago.");
        }
        metodoPago.procesarPago(monto);
    }

    public static void main(String[] args) {
        TiendaOnline tienda = new TiendaOnline();
        // Ejemplo 1: Procesar pago con Tarjeta de Crédito válida
        System.out.println("Intento con Tarjeta de Crédito válida:");
        tienda.seleccionarMetodoDePago("TarjetaCredito");
        tienda.procesarOrden(150.0);

        // Ejemplo 2: Procesar pago con Tarjeta de Crédito inválida
        System.out.println("\nIntento con Tarjeta de Crédito inválida:");
        tienda.seleccionarMetodoDePago("TarjetaCreditoInvalida");  // Simulación de tarjeta inválida
        tienda.procesarOrden(150.0);  // Este intentará pero fallará

        // Ejemplo 3: Procesar pago con PayPal (método válido)
        System.out.println("\nIntento con PayPal:");
        tienda.seleccionarMetodoDePago("PayPal");
        tienda.procesarOrden(200.0);

        // Ejemplo 4: Procesar pago con Criptomonedas (método válido)
        System.out.println("\nIntento con Criptomonedas:");
        tienda.seleccionarMetodoDePago("CriptoMonedas");
        tienda.procesarOrden(300.0);

        // Ejemplo 5: Procesar pago con Transferencia Bancaria (método válido)
        System.out.println("\nIntento con Transferencia Bancaria:");
        tienda.seleccionarMetodoDePago("TransferenciaBancaria");
        tienda.procesarOrden(500.0);
    }
}