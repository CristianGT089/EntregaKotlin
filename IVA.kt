import java.util.Scanner

object IVA {
    val IVA: Double = 0.19

    fun agregarIVA(scanner: Scanner) {
        print("\nPor favor digite el precio de la compra: ")

        val compra = scanner.nextDouble()
        
        println("El valor de la compra más el IVA (" + (IVA*100) + "): " + ((IVA*compra)+compra))
        println("\n")
    }
}