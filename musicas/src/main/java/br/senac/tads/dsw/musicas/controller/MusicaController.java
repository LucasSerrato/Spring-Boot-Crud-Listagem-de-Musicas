package br.senac.tads.dsw.musicas.controller;

import br.senac.tads.dsw.musicas.model.Musica;
import br.senac.tads.dsw.musicas.repository.MusicaRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/musicas")
@CrossOrigin
public class MusicaController {

    private final MusicaRepository repo;

    public MusicaController(MusicaRepository repo) {
        this.repo = repo;
    }

    // LISTAR TODAS
    @GetMapping
    public List<Musica> listar() {
        return repo.findAll();
    }

    // BUSCAR UMA POR ID
    @GetMapping("/{id}")
    public ResponseEntity<Musica> buscarPorId(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // ADICIONAR NOVA
    @PostMapping
    public ResponseEntity<?> adicionar(@RequestBody @Valid Musica musica) {
        return ResponseEntity.ok(repo.save(musica));
    }

    // ATUALIZAR EXISTENTE
    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody @Valid Musica musica) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        musica.setId(id);
        return ResponseEntity.ok(repo.save(musica));
    }

    // EXCLUIR
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repo.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
