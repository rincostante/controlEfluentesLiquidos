/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Afanjul
 */
@XmlRootElement(name = "firmante")
@Entity
@Table(name = "firmante")
public class Firmante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (nullable=false, length=20, unique=true)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 20)
    private Long idRupFis;
    
    @OneToMany (mappedBy="firmante")
    private List<Establecimiento> establecimiento;
    
    @OneToMany (mappedBy="firmante")
    private List<HistorialFirmantes> historialEstablecimientos;
    
    @OneToMany (mappedBy="firmante")
    private List<DeclaracionJurada> declaraciones;
    
    @OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @NotNull(message = "{enitdades.objectNotNullError}") 
    private AdminEntidad admin;    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AdminEntidad getAdmin() {
        return admin;
    }

    public void setAdmin(AdminEntidad admin) {
        this.admin = admin;
    }

    public List<DeclaracionJurada> getDeclaraciones() {
        return declaraciones;
    }

    public void setDeclaraciones(List<DeclaracionJurada> declaraciones) {
        this.declaraciones = declaraciones;
    }
    
    public Long getIdRupFis() {
        return idRupFis;
    }

    public void setIdRupFis(Long idRupFis) {
        this.idRupFis = idRupFis;
    }

    public List<Establecimiento> getEstablecimiento() {
         return establecimiento;
    }
    
    public void setEstablecimiento(List<Establecimiento> establecimiento) {
         this.establecimiento = establecimiento;
    }
    
    public List<HistorialFirmantes> getHistorialEstablecimientos() {
         return historialEstablecimientos;
    }
    
    public void setHistorialEstablecimientos(List<HistorialFirmantes> historialEstablecimientos) {
         this.historialEstablecimientos = historialEstablecimientos;
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
        if (!(object instanceof Firmante)) {
            return false;
        }
        Firmante other = (Firmante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities.Firmante[ id=" + id + " ]";
    }
    
}
