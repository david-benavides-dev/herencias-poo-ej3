import classes.*

fun main() {
    // * Crea un objeto de la clase Persona e imprime sus propiedades.
    val persona1 = Persona("Sin nombre", 99)
    println(persona1.nombre)
    println(persona1.edad)

    println()

    // * Ejecuta el cumple de la persona y muestra su información de dos formas: accediendo a sus propiedades y mediante el métod toString()
    persona1.cumple()
    println(persona1)
    persona1.mostrarEdad()

    println()

    // * Crea en el main a una persona y un estudiante y muestra la actividad que realizan.
    val personaActiva = Persona("Julio", 25)
    val estudianteActivo = Estudiante("Marta", 27, "Ciudad")
    personaActiva.actividad()
    println()
    estudianteActivo.actividad()

    println()

    // * Prueba a crer un estudiante con una edad negativa, controlando las excepciones y mostrando el mensaje de error específico.

    try {
        val estudianteNegativo = Estudiante("Juan", -5, "Colegio",)
        println(estudianteNegativo)
    } catch (e: IllegalArgumentException) {
        println("*ERROR* No puede crearse al estudiante -> ${e.message}")
    }

    println()

    try {
        val estudianteValido = Estudiante("Ana", 20, "Ciudad")
        println(estudianteValido)
    } catch (e: IllegalArgumentException) {
        println("*ERROR* No puede crearse al estudiante -> ${e.message}")
    }
}