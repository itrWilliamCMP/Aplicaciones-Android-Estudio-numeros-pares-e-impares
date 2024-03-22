class Numeros {
    fun Calcular(num: Int): String{
        var resultado: String

        if(num % 2 == 0){
            resultado = "Es par"
        }else{
            resultado = "Es impar"
        }
        return resultado

    }
}