/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author lagarcia
 */
@Entity
public class Pozo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column (nullable=false, length=10, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 10)
    private Integer numero;         
    
    @Column (nullable=false)
    private Boolean enServicio;    
    
    @Column (nullable=false, length=18, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 18)
    private Float rendimiento;         
    
    @Column (nullable=false, length=18, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 18)
    private Float horasFunc;         
    
    @Column (nullable=false, length=10, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 10)
    private Integer diasFunc;  
    
    @Column (nullable=false, length=100, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 100)
    private String bombaTipo;
    
    @Column (nullable=false, length=18, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 18)
    private Float bombaPotencia;         

    @Column (nullable=false, length=18, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 18)
    private Float profundidad;    
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="abastecimiento_id")
    private Abastecimiento abastecimiento;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Boolean isEnServicio() {
        return enServicio;
    }

    public void setEnServicio(Boolean enServicio) {
        this.enServicio = enServicio;
    }

    public Float getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(Float rendimiento) {
        this.rendimiento = rendimiento;
    }

    public Float getHorasFunc() {
        return horasFunc;
    }

    public void setHorasFunc(Float horasFunc) {
        this.horasFunc = horasFunc;
    }

    public Integer getDiasFunc() {
        return diasFunc;
    }

    public void setDiasFunc(Integer diasFunc) {
        this.diasFunc = diasFunc;
    }

    public String getBombaTipo() {
        return bombaTipo;
    }

    public void setBombaTipo(String bombaTipo) {
        this.bombaTipo = bombaTipo;
    }

    public Float getBombaPotencia() {
        return bombaPotencia;
    }

    public void setBombaPotencia(Float bombaPotencia) {
        this.bombaPotencia = bombaPotencia;
    }

    public Float getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Float profundidad) {
        this.profundidad = profundidad;
    }

    public Abastecimiento getAbastecimiento() {
        return abastecimiento;
    }

    public void setAbastecimiento(Abastecimiento abastecimiento) {
        this.abastecimiento = abastecimiento;
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
        if (!(object instanceof Pozo)) {
            return false;
        }
        Pozo other = (Pozo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities.Pozo[ id=" + id + " ]";
    }
    
}
