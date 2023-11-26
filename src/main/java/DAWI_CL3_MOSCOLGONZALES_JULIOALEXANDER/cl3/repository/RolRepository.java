package DAWI_CL3_MOSCOLGONZALES_JULIOALEXANDER.cl3.repository;

import DAWI_CL3_MOSCOLGONZALES_JULIOALEXANDER.cl3.model.bd.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,
        Integer> {

    Rol findByNomrol(String nomrol);

}
