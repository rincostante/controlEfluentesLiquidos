/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Afanjul
 */
@XmlRootElement(name = "historialfirmantes")
@Entity
@Table(name = "historialfirmantes")
public class HistorialFirmantes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="establecimiento_id")
    private Establecimiento establecimiento;
    
    @ManyToOne
    @JoinColumn(name="firmante_id")
    private Firmante firmanteAnterior;
    
    @ManyToOne /**se debe cambiar firmante_id dado que esta repetido?**/
    @JoinColumn(name="firmante_id")
    private Firmante firmanteActual;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    @Column
    private String motivo;
    
    @Column
    private boolean accion;
    
    @Column
    private Usuario usuario;
    
    @Transient
    String strFecha;
    
    public String getStrFecha() {
        if(fecha != null){
            SimpleDateFormat formateador = new SimpleDateFormat("dd'/'MM'/'yyyy", new Locale("es_ES"));
            strFecha = formateador.format(fecha);
            return strFecha;
        }
        return "";
    }

    public void setStrFecha(String strFecha) {
        this.strFecha = strFecha;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        if (!(object instanceof HistorialFirmantes)) {
            return false;
        }
        HistorialFirmantes other = (HistorialFirmantes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities.HistorialFirmantes[ id=" + id + " ]";
    }
    
}
