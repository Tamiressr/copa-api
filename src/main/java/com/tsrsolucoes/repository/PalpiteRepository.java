package com.tsrsolucoes.repository;

import com.tsrsolucoes.model.Palpite;
import com.tsrsolucoes.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalpiteRepository extends JpaRepository<Palpite,Integer> {


}
