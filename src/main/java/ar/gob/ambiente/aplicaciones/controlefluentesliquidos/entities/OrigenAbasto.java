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
public class OrigenAbasto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne
    private Abasto abasto;    
    
    @OneToMany(mappedBy="caudalabasto")
    private List<CaudalAbasto> caudales; 
    
    @OneToMany(mappedBy="circuitoabasto")
    private List<CircuitoAbasto> circuitos; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Abasto getAbasto() {
        return abasto;
    }

    public void setAbasto(Abasto abasto) {
        this.abasto = abasto;
    }

    public List<CaudalAbasto> getCaudales() {
        return caudales;
    }

    public void setCaudales(List<CaudalAbasto> caudales) {
        this.caudales = caudales;
    }

    public List<CircuitoAbasto> getCircuitos() {
        return circuitos;
    }

    public void setCircuitos(List<CircuitoAbasto> circuitos) {
        this.circuitos = circuitos;
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
        if (!(object instanceof OrigenAbasto)) {
            return false;
        }
        OrigenAbasto other = (OrigenAbasto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities.OrigenAbasto[ id=" + id + " ]";
    }
    
}
