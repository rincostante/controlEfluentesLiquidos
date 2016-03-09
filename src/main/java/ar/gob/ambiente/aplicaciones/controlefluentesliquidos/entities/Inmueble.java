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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Afanjul
 */
@XmlRootElement(name = "inmueble")
@Entity
@Table(name = "inmueble")
public class Inmueble implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
        
    @Column (nullable=false, length=20)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 20)
    private String partInmob;
    
    @Column (nullable=false, length=20)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 20)
    private String nomCatastral;
    
    @Column
    private float latitud;
    
    @Column
    private float longitud;
    
    @Column
    private int personalFabrica;
    
    @Column
    private int personalOficina;
    
    @Column
    private float supCubierta;
    
    @Column
    private float supLibre;
    
    @Column
    private boolean radioServido;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public String getPartInmob() {
        return partInmob;
    }

    public void setPartInmob(String partInmob) {
        this.partInmob = partInmob;
    }
    
    public String getNomCatastral() {
        return nomCatastral;
    }

    public void setNomCatastral(String nomCatastral) {
        this.nomCatastral = nomCatastral;
    }
    
    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }
    
    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    } 
    
    public int getPersonalFabrica() {
        return personalFabrica;
    }

    public void setPersonalFabrica(int personalFabrica) {
        this.personalFabrica = personalFabrica;
    }
    
    public int getPersonalOficina() {
        return personalOficina;
    }

    public void setPersonalOficina(int personalOficina) {
        this.personalOficina = personalOficina;
    }
    
    public float getSupCubierta() {
        return supCubierta;
    }

    public void setSupCubierta(float supCubierta) {
        this.supCubierta = supCubierta;
    }
    
    public float getSupLibre() {
        return supLibre;
    }

    public void setSupLibre(float supLibre) {
        this.supLibre = supLibre;
    }
    
    public boolean getRadioServido() {
        return radioServido;
    }

    public void setRadioServido(boolean radioServido) {
        this.radioServido = radioServido;
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
        if (!(object instanceof Inmueble)) {
            return false;
        }
        Inmueble other = (Inmueble) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities.Inmueble[ id=" + id + " ]";
    }
    
}
