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

class Estudiante(nombre:String, edad:Int, val carrera: String): Persona(nombre, edad){

    override fun actividad() {
        println("$nombre está realizando una tarea")
    }

    override fun toString(): String {
        val string = super.toString().substring(0, super.toString().length-1).replace("Persona", "Estudiante")
        return "$string, carrera = $carrera)"
    }
}



fun main(){
    val persona = Persona("Pedro",58)
    //println("${persona.nombre} ${persona.edad}")
    persona.cumple()
    println(persona)

    val estudiante = Estudiante("Felipe", 22, "Ingeniería..")
    println(estudiante)
    println()
    persona.actividad()
    estudiante.actividad()
    try {
        val estudianteError = Estudiante("Error", -34, "Error")
    } catch (e: IllegalArgumentException){
        println("ERROR -> $e")
    }
}

