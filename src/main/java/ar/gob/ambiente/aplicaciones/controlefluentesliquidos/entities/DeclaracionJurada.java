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
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author lagarcia
 */
@Entity
public class DeclaracionJurada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column (nullable=false, length=14, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 14)
    private Long cuit;         

    @Column (nullable=false, length=100, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 100)
    private String razonSocial;         

    @Column (nullable=false, length=100, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 100)
    private String firmante;         
    // Hay que ver esto ***********
    
    
    @OneToMany(mappedBy="recibo")
    private List<Recibo> recibos;    
    
    @OneToMany(mappedBy="horarioTrabajo")
    private List<Horario> horarios; 
    
    @OneToMany(mappedBy="vuelco")
    private List<Vuelco> vuelcos; 
    
    @OneToMany(mappedBy="barro")
    private List<Barro> barros; 
    
    @Column (nullable=false)
    private Boolean inscriptoDrp;    
    
    @Column (nullable=false, length=100, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 100)
    private String expediente;         

    @OneToMany(mappedBy="croquis")
    private List<Croquis> croquiss; 

    @OneToMany(mappedBy="producto")
    private List<Producto> productos; 
    
    @OneToMany(mappedBy="abastecimiento")
    private List<Abastecimiento> abastecimientos; 
   
    @Column (nullable=false, length=10, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 10)
    private Long admin;         
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getFirmante() {
        return firmante;
    }

    public void setFirmante(String firmante) {
        this.firmante = firmante;
    }

    public List<Recibo> getRecibos() {
        return recibos;
    }

    public void setRecibos(List<Recibo> recibos) {
        this.recibos = recibos;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public List<Vuelco> getVuelcos() {
        return vuelcos;
    }

    public void setVuelcos(List<Vuelco> vuelcos) {
        this.vuelcos = vuelcos;
    }

    public List<Barro> getBarros() {
        return barros;
    }

    public void setBarros(List<Barro> barros) {
        this.barros = barros;
    }

    public Boolean isInscriptoDrp() {
        return inscriptoDrp;
    }

    public void setInscriptoDrp(Boolean inscriptoDrp) {
        this.inscriptoDrp = inscriptoDrp;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public List<Croquis> getCroquiss() {
        return croquiss;
    }

    public void setCroquiss(List<Croquis> croquiss) {
        this.croquiss = croquiss;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Abastecimiento> getAbastecimientos() {
        return abastecimientos;
    }

    public void setAbastecimientos(List<Abastecimiento> abastecimientos) {
        this.abastecimientos = abastecimientos;
    }

    public Long getAdmin() {
        return admin;
    }

    public void setAdmin(Long admin) {
        this.admin = admin;
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
        if (!(object instanceof DeclaracionJurada)) {
            return false;
        }
        DeclaracionJurada other = (DeclaracionJurada) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities.DeclaracionJurada[ id=" + id + " ]";
    }
    
}
