open class Persona(val nombre:String, var edad:Int = 0){

    init {
        require(nombre.isNotBlank()){"El nombre no puede estar vacío"}
        require(edad >= 0){"La edad no puede ser negativa"}
    }

    fun cumple() = edad++

    fun mostrarEdad() { println("$nombre tiene $edad años") }

    open fun actividad() {
        println("$nombre está realizando una actividad")
    }
    override fun toString(): String {
        return "Persona(nombre = $nombre, edad = $edad)"
    }
}