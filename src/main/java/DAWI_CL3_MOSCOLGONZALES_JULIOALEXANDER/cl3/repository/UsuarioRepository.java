package DAWI_CL3_MOSCOLGONZALES_JULIOALEXANDER.cl3.repository;

import DAWI_CL3_MOSCOLGONZALES_JULIOALEXANDER.cl3.model.bd.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends
        JpaRepository<Usuario, Integer>
{
    Usuario findByNomusuario(String nomusuario);
}