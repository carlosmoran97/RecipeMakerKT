import java.lang.NumberFormatException

// RecipeMakerKT
// Autor: Carlos Moran
// Fecha: 18/05/2019
// Descripcion: ReciperMakerKT es un programa de interfaz de consola,
// que te permite crear nuestras propias recetas a partir de insumos (ingredientes)
// previamente definidos.
//
// Este es el primero de los retos del curso de Kotlin basico de Platzi
// NUNCA PARES DE APRENDER!

fun main(args: Array<String>) {
    val ingredientes: List<String> =
        listOf<String>("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")
    var recetas: String = """
    """.trimIndent()

    var response:String?
    do {
        val menuPrincipal = """
            Selecciona la opción deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
            />
        """.trimIndent()
        print(menuPrincipal)
        response = readLine()
        when(response){
            "1" -> {
                println("Vamos a hacer una receta.")
                println("A continuación te mostraré una lista de ingredientes. Tu deberás ingresar la letra \"s\" si deseas agregar ese ingrediente a tu receta, o la letra \"n\" si no deseas hacerlo.")
                println("Empecemos!!\n")
                var nuevaReceta: String = ""
                ingredientes.forEachIndexed{
                    index, ingrediente ->
                    println("¿Deseas agregar $ingrediente a tu receta? (${index + 1}/${ingredientes.size})")
                    println("s/n")
                    print("> ")
                    val response: String? = readLine()
                    if(response == "s" || response == "S"){
                        if(nuevaReceta.length == 0){
                            nuevaReceta += "*-*-*-*-*-*-*-*-*"
                        }
                        nuevaReceta +="\n- $ingrediente"
                    }
                }
                if(nuevaReceta.length != 0){
                    recetas+="$nuevaReceta\n"
                }
            }
            "2" -> {
                println("Esta es tu lista de recetas")
                println(recetas)
            }
            "3" -> println("Adios!")

        }
    }while(response != "3")

}

