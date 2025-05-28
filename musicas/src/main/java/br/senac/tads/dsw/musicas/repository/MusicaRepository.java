package br.senac.tads.dsw.musicas.repository;

import br.senac.tads.dsw.musicas.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicaRepository extends JpaRepository<Musica, Long> {
}


