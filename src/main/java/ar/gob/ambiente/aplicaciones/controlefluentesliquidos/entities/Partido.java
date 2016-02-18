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
import javax.persistence.OneToMany;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Afanjul
 */
@XmlRootElement(name = "partido")
@Entity
@Table(name = "partido")
public class Partido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (nullable=false, unique=true)
    @NotNull(message = "{entidades.fieldNotNullError}")
    private Long idRt;
    
    @Column (nullable=false, length=40, unique=true)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 40)
    private String nombre;
    
    @OneToMany(mappedBy="partido")
    private List<Establecimiento> establecimiento;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdRt() {
        return idRt;
    }

    public void setIdRt(Long idRt) {
        this.idRt = idRt;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<Establecimiento> getEstablecimiento() {
         return establecimiento;
    }
    
    public void setEstablecimiento(List<Establecimiento> establecimiento) {
         this.establecimiento = establecimiento;
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
        if (!(object instanceof Partido)) {
            return false;
        }
        Partido other = (Partido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities.Partido[ id=" + id + " ]";
    }
    
}
