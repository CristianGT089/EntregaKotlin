import java.util.Scanner

object Comision {
    val topeFinal: Double = 2000000.0
    val salarioBase: Double = 1600000.0

    fun verificarComision(scanner: Scanner) {
        var topeActual: Double = 500000.0
        var comision: Double = 0.0
        var enRango: Boolean = false

        print("\nSe necesita el valor de la venta: ")
        val venta: Double = scanner.nextDouble()
    
        if (venta > topeFinal) {
            comision = 0.20
        } else {
            while (!enRango) {
                if (venta < topeActual) {
                    enRango = true
                } else {
                    comision += 0.05
                    topeActual += 500000
                }
            }
        }

        var comisionVenta:Double = comision * venta
        var total: Double = salarioBase + comisionVenta
        println("""
            El pago por su venta fue:\n
            Su salario basico: $salarioBase
            Comision por la venta: $comisionVenta
            Total: $total
        """)

    }


}