import br.com.dioproject.models.Usuario
import br.com.dioproject.service.dioProjectService

fun main() {
    //Inicializa a classe de negocios da aplicacao
    val service = dioProjectService();

    //Cria os usuarios que serão utilizados
    val usuarios: Array<Usuario> = service.criaUsuarios();

    //Preenche a formação angular com os cursos
    val formacaoAngular = service.retornaFormacaoAngular();

    //matricula os alunos na formacao
    service.matriculaUsuariosFormacaoAngular(usuarios,formacaoAngular)

    println("Quantidade de alunos matriculados matriculados: ${formacaoAngular.inscritos.size}")

    //Exibe os cursos da formação Angular
    service.exibeDadosDaFormacaoAngular(formacaoAngular);
}



