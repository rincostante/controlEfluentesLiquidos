/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author afanjul
 */
@XmlRootElement(name = "establecimiento")
@Entity
@Table(name = "establecimiento")
public class Establecimiento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column (nullable=false, length=20, unique=true)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 20)
    private Long idRupEst;
    
    @Column (nullable=false, length=20, unique=true)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 20)
    private Long idRupRaz;
    
    @Column (length=3)
    private boolean rzJuridica;
    
    @Column (nullable=false, length=40)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 20)
    private String razonSocial;
    
    @Column (nullable=false, length=11, unique=true)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 11)
    private Long cuit;
    
    @OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="inmueble_id")
    private Inmueble inmueble;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="firmante_id", nullable=false)
    @NotNull(message = "Debe existir un firmante")
    private Firmante firmante;
    
    private HistorialActividades historialActividades;
    
    private HistorialFirmantes historialFirmantes;
    
    private long[] historialDeclaraciones;
    
    private Long numero;
    
    private Partido partido;
    
    private String codPostal;
    
    private String partInmob;
    
    private String procProduct;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdRupEst() {
        return idRupEst;
    }

    public void setIdRupEst(Long idRupEst) {
        this.idRupEst = idRupEst;
    }
    
    public Long getIdRupRaz() {
        return idRupRaz;
    }

    public void setIdRupRaz(Long idRupRaz) {
        this.idRupRaz = idRupRaz;
    }
    
    public boolean getRzJuridica() {
        return rzJuridica;
    }

    public void setRzJuridica(boolean rzJuridica) {
        this.rzJuridica = rzJuridica;
    }
    
    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }
    
    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }
    
    public Firmante getFirmante() {
        return firmante;
    }

    public void setFirmante(Firmante firmante) {
        this.firmante = firmante;
    }
    
    public String getProcProduct() {
        return procProduct;
    }

    public void setProcProduct(String procProduct) {
        this.procProduct = procProduct;
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
        if (!(object instanceof Establecimiento)) {
            return false;
        }
        Establecimiento other = (Establecimiento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities.Establecimiento[ id=" + id + " ]";
    }
    
}
