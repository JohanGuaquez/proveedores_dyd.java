package co.dulcesydulces.provedor_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.dulcesydulces.provedor_backend.domain.entidades.Proveedores;

public interface ProveedoresRepository extends JpaRepository<Proveedores, String> {

    List<Proveedores> findAllByOrderByUsuarioCodigoAsc();

}