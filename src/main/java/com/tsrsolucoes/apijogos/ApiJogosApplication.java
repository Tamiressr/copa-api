package com.tsrsolucoes.apijogos;

import com.tsrsolucoes.model.Jogo;

import com.tsrsolucoes.model.Palpite;
import com.tsrsolucoes.model.Pontuacao;
import com.tsrsolucoes.model.Usuario;
import com.tsrsolucoes.repository.JogoRepository;
import com.tsrsolucoes.repository.PalpiteRepository;
import com.tsrsolucoes.repository.UsuarioRepository;
import com.tsrsolucoes.services.JogoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.tsrsolucoes.repository") // Não tive mais o erro com essa anotação
@EntityScan(basePackages = "com.tsrsolucoes.model")
public class ApiJogosApplication implements CommandLineRunner {
@Autowired
private JogoRepository service;
	@Autowired
	private UsuarioRepository userRepo;
	@Autowired
	private PalpiteRepository palpiteRepository;
	public static void main(String[] args) {
		SpringApplication.run(ApiJogosApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		Jogo jogo=new Jogo();
		jogo.setDataJogo(LocalDateTime.now());
		jogo.setEmpate(false);
		jogo.setTime1("Brasil");
		jogo.setTime2("Argentina");
		Pontuacao p= new Pontuacao();
		p.setGolTime1(7);
		p.setGotlTime2(1);
		jogo.setPontuacao(p);


		Usuario usuario= new Usuario();
		usuario.setNome("Tamires");
		usuario.setPontuacao(0);


		Palpite palpite= new Palpite();
		palpite.setJogo(jogo);
		palpite.setDataCriacao(LocalDateTime.now());
		Pontuacao palpiteUser1=new Pontuacao();
		palpiteUser1.setGolTime1(7);
		palpiteUser1.setGotlTime2(0);
		//atualizacao da pontuacao
		if(palpiteUser1.getGolTime1()==jogo.getPontuacao().getGolTime1()&&palpiteUser1.getGotlTime2()==jogo.getPontuacao().getGotlTime2()){
			usuario.setPontuacao(1);
		}
		palpite.setPalpite(palpiteUser1);
		usuario.getPalpite().add(palpite);
		service.save(jogo);
		userRepo.save(usuario);
		palpiteRepository.save(palpite);


	}

}

