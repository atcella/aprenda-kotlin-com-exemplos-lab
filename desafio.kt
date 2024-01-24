// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val id: Int, val nome: String) {
    override fun equals(other: Any?) =
        other is Usuario && other.id == this.id 
}

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        println(usuario.nome)
        if (inscritos.equals(usuario)) {
            println("Já matriculado")
        } else {
            inscritos.add(usuario)
            println("Aluno matriculado")
        }
        
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    val usuario = Usuario(16,"Anderson")
    val conteudoEducacional = ConteudoEducacional("Desenvolvimento Mobile Kotlin",240)
    val formacao = Formacao("Formação Kotlin", listOf(conteudoEducacional))
    val formacao1 = Formacao("Formação Kotlin", listOf(conteudoEducacional)).matricular(usuario)
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}