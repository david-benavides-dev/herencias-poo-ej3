package classes

class Estudiante(nombre: String, edad: Int, var carrera: String) : Persona(nombre, edad) {

    override fun toString(): String {
        return super.toString() + "\nCarrera: $carrera"
    }

    override fun actividad() {
        super.actividad()
        println("En concreto, está en la carrera $carrera.")
    }
}