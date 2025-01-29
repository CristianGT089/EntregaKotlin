import java.util.Scanner

object SRMD {
    fun realizarOperaciones(scanner: Scanner) {
        println("\n Para poder realizar las operaciones matemáticas se necesitan dos números, por favor digitelos:")

        print("Número 1: ")
        val num1: Double = scanner.nextDouble()

        print("Número 2: ")
        val num2: Double = scanner.nextDouble()

        println("\nLos resultados quedaron de la siguiente manera: ")
        println("Suma:\t\t $num1 + $num2 = ${num1+num2}")
        println("Resta:\t\t $num1 - $num2 = ${num1-num2}")
        println("Multiplicación: $num1 * $num2 = ${num1*num2}")
        
        val div:String = if (num2 == 0.0) {
            "No se puede dividir por cero"
        } else {
            "$num1 / $num2 = ${num1 / num2}"
        }

        println("División:\t" + div);
        println("\n");
    }
}