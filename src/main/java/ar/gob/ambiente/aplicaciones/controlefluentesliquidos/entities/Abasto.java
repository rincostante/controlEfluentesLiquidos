/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author lagarcia
 */
@Entity
public class Abasto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne
    private TipoAbasto tipo; 

    @OneToMany(mappedBy="origenabasto")
    private List<OrigenAbasto> origenes; 
    
    @OneToMany(mappedBy="fuenteabasto")
    private List<FuenteAbasto> fuentes; 

    @OneToMany(mappedBy="circuitoabasto")
    private List<CircuitoAbasto> caudales; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoAbasto getTipo() {
        return tipo;
    }

    public void setTipo(TipoAbasto tipo) {
        this.tipo = tipo;
    }

    public List<OrigenAbasto> getOrigenes() {
        return origenes;
    }

    public void setOrigenes(List<OrigenAbasto> origenes) {
        this.origenes = origenes;
    }

    public List<FuenteAbasto> getFuentes() {
        return fuentes;
    }

    public void setFuentes(List<FuenteAbasto> fuentes) {
        this.fuentes = fuentes;
    }

    public List<CircuitoAbasto> getCaudales() {
        return caudales;
    }

    public void setCaudales(List<CircuitoAbasto> caudales) {
        this.caudales = caudales;
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
        if (!(object instanceof Abasto)) {
            return false;
        }
        Abasto other = (Abasto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities.Abasto[ id=" + id + " ]";
    }
    
}
