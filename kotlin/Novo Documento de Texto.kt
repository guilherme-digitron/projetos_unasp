// Exercicios de Kotlin

//parte 1 

//exercicio 1

/* 
fun main() {
    val disciplina = "Programação Mobile"
    val aulas = 20
    aulas = 21
    println("$disciplina tem $aulas aulas")
}
 

// o erro ocorria por tentar mudar o valor de aulas que e declarado como val, mas valores declarados como val
// não podem sofre alteração e devem ser fixos

fun main() {
    val disciplina = "Programação Mobile"
    var aulas = 20
    aulas = 21
    println("$disciplina tem $aulas aulas")

}
*/
// exercicio 2

//val nomeDoCurso = "Análise e Desenvolvimento de Sistemas" //o nome do curso dificilmente vai mudar durante o ano
//var totalDeAlunos = 0        // aumenta conforme a chamada | como já está escrito esse valor aumenta ou seja varia
//val anoLetivo = 2026		// durante o ano letivo esse valor não sera auterado
//var notaFinal = 0.0          // recalculada a cada avaliação | mesma coisa, como já esta escrito o valor varia

// exercicio 3

/*
 * 
 * 
val a = 10 - int
val b = 10.0 - double ou float
val c = "10" - string
val d = '1' - string
val e = true - booleano
val f = 10L - null

*/
/*
val a = 10
val b = 10.0
val c = "10"
val d = '1'
val e = true
val f = 10L

println(a::class) // acertei
println(b::class) //acertei
println(c::class) //acertei
println(d::class) //errei 
println(e::class) //acertei
println(f::class) //errei 
*/

//exercicio 4
/*
 * não funcionava por que String? definia que o valor poderia ser null, e o valor estava declarado como null
 * mas apelido!! defiania que o valor nao podia ser null gerando um erro NullPointerException
 * 
 * isso e falado na documentação do kotlin https://kotlinlang.org/docs/null-safety.html#not-null-assertion-operator
 * 
fun main() {
    val apelido: String? = null
    println(apelido!!.uppercase())
}



fun main() {
    val apelido: String? = null
    if (apelido == null){println("sem apelido".uppercase())}
    
}
*/

//exercicio 5
/*
fun tamanhoSeguro(texto: String?): Int {
    if (texto == null){return 0;}
    else {return texto.length}
}

 
fun main() {
    println(tamanhoSeguro("Kotlin"))   // deve imprimir 6
    println(tamanhoSeguro(null))       // deve imprimir 0
    
    
}
*/

//exercicio 6
/*
data class Endereco(val cidade: String?)
data class Aluno(val nome: String, val endereco: Endereco?)
 
fun main() {
    val ana = Aluno("Ana", null)
    val beto = Aluno("Beto", Endereco("São Paulo"))
    val caio = Aluno("Caio", Endereco(null))
    
    val alunos = listOf(ana, beto, caio)
    alunos.forEach {
        
        if (it.endereco == null || it.endereco?.cidade == null){println(it.nome + " não tem registro de endereço ")}
        else{println(it.nome + " more em " + it.endereco?.cidade)}
        
        
    }
}
*/


//exercicio 7
/*
fun saudacao(nome: String, prefixo: String = "Ola"): String = "$prefixo, $nome!"

fun main(){
    
    println(saudacao("Zunildo"))
    println(saudacao( "Zunildo", "Rei de Norin"))
    
}

*/

//exercicio 8
/*
fun matricular(nome: String, curso: String = "ADS", periodo: Int = 1) {
    println("$nome — $curso — ${periodo}º período")
}


fun main(){
    
   matricular("Victorine")
   matricular("Donavon", periodo = 2)
   matricular(periodo = 2, curso = "Dominação global", nome = "Norpintacio")
    
}
*/


//exercicio 9 
/*
fun main() {
    val nomes = listOf("Ana", "Beatriz", "Caio", "Daniela")
    val filtrados = nomes.filter { it.length > 3 }
    val up = {nome: String -> nome.uppercase()}
	
    filtrados.forEach {
        
        println(up(it))
        
    }
    
}

*/

//exercicio 10
/*
fun botao(rotulo: String, acao: () -> Unit) {
    println("[$rotulo] clicado")
    acao()
}

fun main() {
    botao("Salvar") {
        println("Salvando...")
    }
}
*/

//parte 2

//3
//-1
//4
/*
fun main() {
    val nomes: List<String?> = listOf("Ana", null, "Beto")
    for (n in nomes) {
        println(n?.length ?: -1)
    }
}

//20
//40

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)
    val resultado = numeros.filter { it % 2 == 0 }.map { it * 10 }
    println(resultado)
}

//10
//15
//20
fun dobrar(n: Int, vezes: Int = 2): Int = n * vezes
 
fun main() {
    println(dobrar(5))
    println(dobrar(5, 3))
    println(dobrar(vezes = 4, n = 5))
}

*/







