package classes

open class Persona(nombre: String, edad: Int = 99) {
    var nombre: String = nombre
        private set
    var edad: Int = edad
        private set

    init {
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío." }
        require(edad > 0) { "La edad no puede ser negativa." }
    }

    fun cumple() {
        this.edad += 1
    }

    fun mostrarEdad() {
        println("$nombre tiene $edad años.")
    }

    open fun actividad() {
        println("$nombre está realizando una actividad.")
    }

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }
}