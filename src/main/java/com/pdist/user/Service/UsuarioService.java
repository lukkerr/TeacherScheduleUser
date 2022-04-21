package com.pdist.user.Service;

import com.pdist.user.Model.Usuario;
import com.pdist.user.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> read() {
        return this.usuarioRepository.findAll();
    }

    public Usuario readById(Long id){
        return this.usuarioRepository.findById(id).orElse(null);
    }

    @Transactional
    public Usuario push(Usuario usuario){
        return this.usuarioRepository.save(usuario);
    }

    public void delete(Long id){
        this.usuarioRepository.deleteById(id);
    }
}
