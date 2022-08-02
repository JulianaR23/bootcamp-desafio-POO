package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(12);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devJuliana = new Dev();
		devJuliana.setNome("Juliana");
		devJuliana.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Juliana: " + devJuliana.getConteudosInscritos());
		devJuliana.progredir();
		devJuliana.progredir();
		System.out.println("Conteúdos inscritos Juliana: " + devJuliana.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Juliana: " + devJuliana.getConteudosConcluidos());
		System.out.println("XP: " + devJuliana.calcularTotalXP());
		
		System.out.println("-------------");
		
		Dev devGustavo = new Dev();
		devGustavo.setNome("Gustavo");
		devGustavo.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Gustavo: " + devGustavo.getConteudosInscritos());
		devGustavo.progredir();
		devGustavo.progredir();
		devGustavo.progredir();
		System.out.println("Conteúdos inscritos Gustavo: " + devGustavo.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Gustavo: " + devGustavo.getConteudosConcluidos());
		System.out.println("XP: " + devGustavo.calcularTotalXP());
	}

}
