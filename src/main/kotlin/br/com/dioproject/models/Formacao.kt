package br.com.dioproject.models

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        println("Aluno matriculado com sucesso!")
        inscritos.add(usuario)
    }

    fun cancelarMatricula(usuario:Usuario){
        inscritos.remove(usuario);
        println("Aluno ${usuario} teve sua matricula cancelada")
    }
}