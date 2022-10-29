package org.senac.aula01.api;

import org.senac.aula01.model.Marca;
import org.senac.aula01.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class MarcaController {

    final MarcaRepository repository;

    public MarcaController(MarcaRepository repository) {
        this.repository = repository;
    }

    @PutMapping
    public ResponseEntity update(@RequestBody Marca marca, @PathVariable Long id){
        repository.save(marca);
        return ResponseEntity.ok(marca);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
