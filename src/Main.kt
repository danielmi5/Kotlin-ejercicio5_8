



fun main(){
    val persona = Persona("Pedro",58)
    //println("${persona.nombre} ${persona.edad}")
    persona.cumple()
    persona.mostrarEdad()
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

