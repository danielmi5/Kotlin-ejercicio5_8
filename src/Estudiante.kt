class Estudiante(nombre:String, edad:Int, val carrera: String): Persona(nombre, edad){

    override fun actividad() {
        println("$nombre está estudiando")
    }

    override fun toString(): String {
        val string = super.toString().substring(0, super.toString().length-1).replace("Persona", "Estudiante")
        return "$string, carrera = $carrera)"
    }
}