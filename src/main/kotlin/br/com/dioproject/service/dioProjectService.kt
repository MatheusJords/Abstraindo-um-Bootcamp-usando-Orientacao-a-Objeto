package br.com.dioproject.service

import br.com.dioproject.models.ConteudoEducacional
import br.com.dioproject.models.Formacao
import br.com.dioproject.models.Usuario

class dioProjectService {

    fun retornaFormacaoAngular(): Formacao {
        val formacaoAngular = mutableListOf<ConteudoEducacional>()

        val introducaoAngularCurso = ConteudoEducacional(
            nome = "Curso de Introdução ao Angular",
            duracao = 2)

        val dataBindAngularCurso = ConteudoEducacional(
            nome = "Curso de DataBind Angular",
            duracao = 2)

        val pipeAngularCurso = ConteudoEducacional(
            nome = "Curso de DataBind Angular",
            duracao = 2)

        val httpAngularCurso = ConteudoEducacional(
            nome = "Curso de Requisições Http Angular",
            duracao = 2)

        formacaoAngular.add(introducaoAngularCurso);
        formacaoAngular.add(dataBindAngularCurso);
        formacaoAngular.add(pipeAngularCurso);
        formacaoAngular.add(httpAngularCurso);

        return Formacao("Angular", formacaoAngular)
    }

    fun criaUsuarios(): Array<Usuario>{

        val usuarioMatheus = Usuario(nome="Matheus Jordan", idade=26);
        val usuarioFabricio = Usuario(nome="Fabricio Procaci", idade=41);

        var usuarios : Array<Usuario> = arrayOf(usuarioMatheus,usuarioFabricio);

        return usuarios;
    }

    fun matriculaUsuariosFormacaoAngular(usuarios: Array<Usuario>,
                                         formacaoAngular:Formacao){
        usuarios.forEach { formacaoAngular.matricular(it) }
    }

    fun exibeDadosDaFormacaoAngular(formacaoAngular: Formacao){
        formacaoAngular.conteudos.stream().forEach { println("Nome do curso ${it.nome}") }
    }

}