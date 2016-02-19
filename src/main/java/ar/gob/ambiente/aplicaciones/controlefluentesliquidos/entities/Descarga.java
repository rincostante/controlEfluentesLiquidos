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
public class Descarga implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToMany(mappedBy="vuelco")
    private List<Vuelco> vuelcos; 
    
    @Column (nullable=false, length=5, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 5)
    private Integer numOrden;         
    
    @OneToMany(mappedBy="curso")
    private List<Curso> cursos; 
    
    @Column (nullable=false, length=10, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 10)
    private String tipo;    // Ver en detalle no entiendo defincion

    @Column (nullable=false, length=5, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 5)
    private Integer caudal;         
    
    @OneToMany(mappedBy="aforo")
    private List<Aforo> aforos; 

    @OneToMany(mappedBy="operador")
    private List<Operador> operadores; 

    @Column (nullable=false, length=100, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 100)
    private String pretratamiento;

    @Column (nullable=false, length=100, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 100)
    private String tratPnmFis;
    
    @Column (nullable=false, length=100, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 100)
    private String tratPnmQuim;

    @Column (nullable=false, length=100, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 100)
    private String tratSec;

    @Column (nullable=false)
    private Boolean desinfeccion;    
    
    @Column (nullable=false)
    private Boolean mayor5Km;    

    @Column (nullable=false)
    private Boolean anulado;    

    @Column (nullable=false, length=100, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 100)
    private String motivo;

    @Column (nullable=false)
    private Boolean camTomaMuestra;    

    @Column (nullable=false)
    private Boolean factibilidad;    

    @Column (nullable=false, length=18, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 18)
    private Float caudalAutorizado;         

    @Column (nullable=false, length=100, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 100)
    private String organismoAutorizante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Vuelco> getVuelcos() {
        return vuelcos;
    }

    public void setVuelcos(List<Vuelco> vuelcos) {
        this.vuelcos = vuelcos;
    }

    public Integer getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(Integer numOrden) {
        this.numOrden = numOrden;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCaudal() {
        return caudal;
    }

    public void setCaudal(Integer caudal) {
        this.caudal = caudal;
    }

    public List<Aforo> getAforos() {
        return aforos;
    }

    public void setAforos(List<Aforo> aforos) {
        this.aforos = aforos;
    }

    public List<Operador> getOperadores() {
        return operadores;
    }

    public void setOperadores(List<Operador> operadores) {
        this.operadores = operadores;
    }

    public String getPretratamiento() {
        return pretratamiento;
    }

    public void setPretratamiento(String pretratamiento) {
        this.pretratamiento = pretratamiento;
    }

    public String getTratPnmFis() {
        return tratPnmFis;
    }

    public void setTratPnmFis(String tratPnmFis) {
        this.tratPnmFis = tratPnmFis;
    }

    public String getTratPnmQuim() {
        return tratPnmQuim;
    }

    public void setTratPnmQuim(String tratPnmQuim) {
        this.tratPnmQuim = tratPnmQuim;
    }

    public String getTratSec() {
        return tratSec;
    }

    public void setTratSec(String tratSec) {
        this.tratSec = tratSec;
    }

    public Boolean isDesinfeccion() {
        return desinfeccion;
    }

    public void setDesinfeccion(Boolean desinfeccion) {
        this.desinfeccion = desinfeccion;
    }

    public Boolean isMayor5Km() {
        return mayor5Km;
    }

    public void setMayor5Km(Boolean mayor5Km) {
        this.mayor5Km = mayor5Km;
    }

    public Boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(Boolean anulado) {
        this.anulado = anulado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Boolean isCamTomaMuestra() {
        return camTomaMuestra;
    }

    public void setCamTomaMuestra(Boolean camTomaMuestra) {
        this.camTomaMuestra = camTomaMuestra;
    }

    public Boolean isFactibilidad() {
        return factibilidad;
    }

    public void setFactibilidad(Boolean factibilidad) {
        this.factibilidad = factibilidad;
    }

    public Float getCaudalAutorizado() {
        return caudalAutorizado;
    }

    public void setCaudalAutorizado(Float caudalAutorizado) {
        this.caudalAutorizado = caudalAutorizado;
    }

    public String getOrganismoAutorizante() {
        return organismoAutorizante;
    }

    public void setOrganismoAutorizante(String organismoAutorizante) {
        this.organismoAutorizante = organismoAutorizante;
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
        if (!(object instanceof Descarga)) {
            return false;
        }
        Descarga other = (Descarga) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities.Descarga[ id=" + id + " ]";
    }
    
}
