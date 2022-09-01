package br.com.alura.forum.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import br.com.alura.forum.modelo.Topico;

//long é do tipo da chave primaria desta classe (topico)
public interface TopicoRepository extends JpaRepository<Topico, Long> {
//curso é a entidade de relacionamento e nome é o atributo dentro de curso
//adicionar o anderline (_) fala pro spring que Curso é uma classe ou entidade e Nome é atributo dela
	Page<Topico> findByCurso_Nome(String nomeCurso, Pageable paginacao);
	
//ou pode ser feito assim para nao serguir regra de nomenclatura:
//	@Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
//	List<Topico> CarregarPorNomeCurso(@Param("nomeCurso") String nomeCurso);
}

//essa classe substitui o padão DAO para criação de 
//métodos de consulta, exclusão, inclusão etc no banco de dados