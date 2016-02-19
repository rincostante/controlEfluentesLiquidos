/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author lagarcia
 */
@Entity
public class Barro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
        
    @OneToMany(mappedBy="declaracion")
    private List<DeclaracionJurada> declaracionjuradas;
    
    @Column (nullable=false, length=18, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 18)
    private Float volumen;         
    
    @Column (nullable=false, length=18, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 18)
    private Float porcentajeAgua;         

    @Column (nullable=false)
    private Boolean tratamientoPropio;    
    
    @Column (nullable=false)
    private Boolean deshidratacion;    
    
    @Column (nullable=false)
    private Boolean estabilizacion;    
    
    @Column (nullable=false)
    private Boolean desinfecion;    
    
    @Column (nullable=false, length=100, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 100)
    private String otroTratamiento;         

    @Column (nullable=false)
    private Boolean retiraPorMediosPropios;    
    
    @Column (nullable=false)
    private Boolean usaTransportista;    
    
    @Column (nullable=false, length=100, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 100)
    private String retiroOtrosMedios;         
    
    @Column (nullable=false)
    private Boolean tieneCertificado;    

    @Column (nullable=false)
    private Boolean destinoLandFarming;    
    
    @Column (nullable=false)
    private Boolean destinoOperadores;    
    
    @Column (nullable=false)
    private Boolean rellSanit;    

    @Column (nullable=false)
    private Boolean destinoBarroInsumo;    
    
    @Column (nullable=false, length=100, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 100)
    private String otrosDestinos;         

    @Column (nullable=false)
    private Boolean protocolo;    
    
    @Column (nullable=false)
    private Boolean caraterizBarros;    
    
    
    public Long getId() {
        return id;
    }

      public void setId(Long id) {
        this.id = id;
    }

    public List<DeclaracionJurada> getDeclaracionjuradas() {
        return declaracionjuradas;
    }

    public void setDeclaracionjuradas(List<DeclaracionJurada> declaracionjuradas) {
        this.declaracionjuradas = declaracionjuradas;
    }

    public Float getVolumen() {
        return volumen;
    }

    public void setVolumen(Float volumen) {
        this.volumen = volumen;
    }

    public Float getPorcentajeAgua() {
        return porcentajeAgua;
    }

    public void setPorcentajeAgua(Float porcentajeAgua) {
        this.porcentajeAgua = porcentajeAgua;
    }

    public Boolean isTratamientoPropio() {
        return tratamientoPropio;
    }

    public void setTratamientoPropio(Boolean tratamientoPropio) {
        this.tratamientoPropio = tratamientoPropio;
    }

    public Boolean isDeshidratacion() {
        return deshidratacion;
    }

    public void setDeshidratacion(Boolean deshidratacion) {
        this.deshidratacion = deshidratacion;
    }

    public Boolean isEstabilizacion() {
        return estabilizacion;
    }

    public void setEstabilizacion(Boolean estabilizacion) {
        this.estabilizacion = estabilizacion;
    }

    public Boolean isDesinfecion() {
        return desinfecion;
    }

    public void setDesinfecion(Boolean desinfecion) {
        this.desinfecion = desinfecion;
    }

    public String getOtroTratamiento() {
        return otroTratamiento;
    }

    public void setOtroTratamiento(String otroTratamiento) {
        this.otroTratamiento = otroTratamiento;
    }

    public Boolean isRetiraPorMediosPropios() {
        return retiraPorMediosPropios;
    }

    public void setRetiraPorMediosPropios(Boolean retiraPorMediosPropios) {
        this.retiraPorMediosPropios = retiraPorMediosPropios;
    }

    public Boolean isUsaTransportista() {
        return usaTransportista;
    }

    public void setUsaTransportista(Boolean usaTransportista) {
        this.usaTransportista = usaTransportista;
    }

    public String getRetiroOtrosMedios() {
        return retiroOtrosMedios;
    }

    public void setRetiroOtrosMedios(String retiroOtrosMedios) {
        this.retiroOtrosMedios = retiroOtrosMedios;
    }

    public Boolean isTieneCertificado() {
        return tieneCertificado;
    }

    public void setTieneCertificado(Boolean tieneCertificado) {
        this.tieneCertificado = tieneCertificado;
    }

    public Boolean isDestinoLandFarming() {
        return destinoLandFarming;
    }

    public void setDestinoLandFarming(Boolean destinoLandFarming) {
        this.destinoLandFarming = destinoLandFarming;
    }

    public Boolean isDestinoOperadores() {
        return destinoOperadores;
    }

    public void setDestinoOperadores(Boolean destinoOperadores) {
        this.destinoOperadores = destinoOperadores;
    }

    public Boolean isRellSanit() {
        return rellSanit;
    }

    public void setRellSanit(Boolean rellSanit) {
        this.rellSanit = rellSanit;
    }

    public Boolean isDestinoBarroInsumo() {
        return destinoBarroInsumo;
    }

    public void setDestinoBarroInsumo(Boolean destinoBarroInsumo) {
        this.destinoBarroInsumo = destinoBarroInsumo;
    }

    public String getOtrosDestinos() {
        return otrosDestinos;
    }

    public void setOtrosDestinos(String otrosDestinos) {
        this.otrosDestinos = otrosDestinos;
    }

    public Boolean isProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Boolean protocolo) {
        this.protocolo = protocolo;
    }

    public Boolean isCaraterizBarros() {
        return caraterizBarros;
    }

    public void setCaraterizBarros(Boolean caraterizBarros) {
        this.caraterizBarros = caraterizBarros;
    }

      
      
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barro)) {
            return false;
        }
        Barro other = (Barro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities.Barro[ id=" + id + " ]";
    }
    
}
