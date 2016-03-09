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
import javax.persistence.ManyToOne;
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
  
    @ManyToOne
    @JoinColumn(name="firmante_id")
    private Firmante firmante;

    @OneToOne
    @JoinColumn(name="recibo_id")
    private Recibo recibo;
       
    @OneToOne(mappedBy="declaracion")
    private HistorialDeclaraciones Historial;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="horario_id")
    private Horario horarioTrabajo;   
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="vuelco_id")
    private Vuelco vuelco;   
      
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="decalaracion_id")
    private List<Barro> barros;

    @Column (nullable=false)
    private Boolean inscriptoDrp;    
    
    @Column (nullable=false, length=100, unique=false)
    @NotNull(message = "{entidades.fieldNotNullError}")
    @Size(message = "{endidades.stringSizeError}", min = 1, max = 100)
    private String expediente;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="croquis_id")
    private Croquis croquis;   


    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="decalaracion_id")
    private List<Producto> productos;
    
    @OneToOne
    @JoinColumn(name="abastecimiento_id")
    private Abastecimiento abastecimiento;
   
    @OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @NotNull(message = "{enitdades.objectNotNullError}") 
    private AdminEntidad admin;    

    public Long getId() {
    return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HistorialDeclaraciones getHistorial() {
        return Historial;
    }

    public void setHistorial(HistorialDeclaraciones Historial) {
        this.Historial = Historial;
    }

    public Firmante getFirmante() {
        return firmante;
    }

    public void setFirmante(Firmante firmante) {
        this.firmante = firmante;
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

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }

    public Horario getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(Horario horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public Vuelco getVuelco() {
        return vuelco;
    }

    public void setVuelco(Vuelco vuelco) {
        this.vuelco = vuelco;
    }

    public List<Barro> getBarros() {
        return barros;
    }

    public void setBarros(List<Barro> barros) {
        this.barros = barros;
    }

    public Croquis getCroquis() {
        return croquis;
    }

    public void setCroquis(Croquis croquis) {
        this.croquis = croquis;
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

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Abastecimiento getAbastecimiento() {
        return abastecimiento;
    }

    public void setAbastecimiento(Abastecimiento abastecimiento) {
        this.abastecimiento = abastecimiento;
    }

    public AdminEntidad getAdmin() {
        return admin;
    }

    public void setAdmin(AdminEntidad admin) {
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
