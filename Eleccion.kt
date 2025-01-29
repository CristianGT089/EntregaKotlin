import java.util.Scanner

class Eleccion() {
    var estaActivo: Boolean

    init {
        this.estaActivo = true
    }

    fun iniciar (scanner: Scanner) {
        println("Bienvenido a la quinta entrega del certificado\n")

        while(estaActivo) {
            print("""
                ¿Cual ejercicio desea ver?
                1.  Realizar las operaciones Suma, Resta, Multiplicación y Division
                2.  Agregar el IVA a una compra
                3.  Verificar las comisiones por venta
                9.  Salir de la aplicación
                > """)

            when(scanner.nextInt()) {
                1 -> SRMD.realizarOperaciones(scanner)
                2 -> IVA.agregarIVA(scanner)
                3 -> Comision.verificarComision(scanner)
                9 -> {
                    print("\n¡Muchas gracias por usar este aplicativo!")
                    estaActivo = false
                }
                else -> {
                    print("\nHa elegido una opcion no valida, si desea salir de la aplicación, presione 9.\n\n")
                }
            }

            try{
                Thread.sleep(3000)
            } catch(e: Exception) {
                print("Error: " + e)
            }
        }
    }
}