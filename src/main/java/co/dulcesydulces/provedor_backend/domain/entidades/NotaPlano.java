package co.dulcesydulces.provedor_backend.domain.entidades;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "notas_plano")
public class NotaPlano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "upload_id", nullable = false)
    private Uploads uploads;

    @Column(name = "docto_proveedor", length = 50)
    private String doctoProveedor;

    @Column(name = "nro_documento", length = 50)
    private String nroDocumento;

    @Column(name = "referencia_1", length = 80)
    private String referencia1;

    @Column(name = "razon_social_proveedor", length = 200)
    private String razonSocialProveedor;

    @Column(name = "valor_bruto", precision = 14, scale = 2)
    private BigDecimal valorBruto;

    @Column(name = "valor_dsctos", precision = 14, scale = 2)
    private BigDecimal valorDsctos;

    @Column(name = "valor_imptos", precision = 14, scale = 2)
    private BigDecimal valorImptos;

    @Column(name = "valor_neto", precision = 14, scale = 2)
    private BigDecimal valorNeto;

    @Column(name = "valor_retenciones", precision = 14, scale = 2)
    private BigDecimal valorRetenciones;

    @Column(name = "notas", columnDefinition = "TEXT")
    private String notas;

    @Column(name = "creado_en", nullable = false)
    private LocalDateTime creadoEn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Uploads getUploads() {
        return uploads;
    }

    public void setUpload(Uploads uploads) {
        this.uploads = uploads;
    }

    public String getDoctoProveedor() {
        return doctoProveedor;
    }

    public void setDoctoProveedor(String doctoProveedor) {
        this.doctoProveedor = doctoProveedor;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getReferencia1() {
        return referencia1;
    }

    public void setReferencia1(String referencia1) {
        this.referencia1 = referencia1;
    }

    public String getRazonSocialProveedor() {
        return razonSocialProveedor;
    }

    public void setRazonSocialProveedor(String razonSocialProveedor) {
        this.razonSocialProveedor = razonSocialProveedor;
    }

    public BigDecimal getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(BigDecimal valorBruto) {
        this.valorBruto = valorBruto;
    }

    public BigDecimal getValorDsctos() {
        return valorDsctos;
    }

    public void setValorDsctos(BigDecimal valorDsctos) {
        this.valorDsctos = valorDsctos;
    }

    public BigDecimal getValorImptos() {
        return valorImptos;
    }

    public void setValorImptos(BigDecimal valorImptos) {
        this.valorImptos = valorImptos;
    }

    public BigDecimal getValorNeto() {
        return valorNeto;
    }

    public void setValorNeto(BigDecimal valorNeto) {
        this.valorNeto = valorNeto;
    }

    public BigDecimal getValorRetenciones() {
        return valorRetenciones;
    }

    public void setValorRetenciones(BigDecimal valorRetenciones) {
        this.valorRetenciones = valorRetenciones;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(LocalDateTime creadoEn) {
        this.creadoEn = creadoEn;
    }
}