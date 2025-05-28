package br.senac.tads.dsw.musicas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;

@Entity
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O título é obrigatório")
    private String titulo;

    @NotBlank(message = "O nome do artista é obrigatório")
    private String artista;

    @Min(value = 1900, message = "Ano de lançamento inválido")
    private int anoLancamento;

    @Size(max = 200, message = "O link deve ter no máximo 200 caracteres")
    private String linkYoutube;

    private LocalDateTime dataCadastro;

    @PrePersist
    public void prePersist() {
        dataCadastro = LocalDateTime.now();
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getLinkYoutube() {
        return linkYoutube;
    }

    public void setLinkYoutube(String linkYoutube) {
        this.linkYoutube = linkYoutube;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
