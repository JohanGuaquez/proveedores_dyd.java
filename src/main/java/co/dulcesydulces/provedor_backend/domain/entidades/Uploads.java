package co.dulcesydulces.provedor_backend.domain.entidades;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Uploads")
public class Uploads {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario", length = 100)
    private String usuario;

    @Column(name = "nombre_egresos", length = 255)
    private String nombreEgresos;

    @Column(name = "nombre_facturas", length = 255)
    private String nombreFacturas;

    @Column(name = "nombre_notas", length = 255)
    private String nombreNotas;

    @Column(name = "creado_en", nullable = false)
    private LocalDateTime creadoEn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombreEgresos() {
        return nombreEgresos;
    }

    public void setNombreEgresos(String nombreEgresos) {
        this.nombreEgresos = nombreEgresos;
    }

    public String getNombreFacturas() {
        return nombreFacturas;
    }

    public void setNombreFacturas(String nombreFacturas) {
        this.nombreFacturas = nombreFacturas;
    }

    public String getNombreNotas() {
        return nombreNotas;
    }

    public void setNombreNotas(String nombreNotas) {
        this.nombreNotas = nombreNotas;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(LocalDateTime creadoEn) {
        this.creadoEn = creadoEn;
    }
}