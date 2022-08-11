package com.tsrsolucoes.repository;

import com.tsrsolucoes.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogoRepository extends JpaRepository<Jogo,Integer> {


}
