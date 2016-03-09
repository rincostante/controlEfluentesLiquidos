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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author lagarcia
 */
@Entity
public class Vuelco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne(mappedBy="vuelco")
    private DeclaracionJurada declaracion;
    
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="descarga_id")
    private List<Barro> decargas;

    @Column (nullable=false)
    private Boolean circCerrCirc;    
    
    @Column (nullable=false)
    private Boolean reCircAgua;    

    @Column (nullable=false)
    private Boolean lavaPisosInd;    
    
    @Column (nullable=false)
    private Boolean refrig;    
    
    @Column (nullable=false)
    private Boolean caldera;    
    
    @Column (nullable=false)
    private Boolean captaAguaSubte;   
    
    @Column (nullable=false)
    private Boolean arsenico;    
    
    @Column (nullable=false)
    private Boolean cadmio;    
    
    @Column (nullable=false)
    private Boolean cianuro;    
    
    @Column (nullable=false)
    private Boolean cromo;    
    
    @Column (nullable=false)
    private Boolean detergentes;    
    
    @Column (nullable=false)
    private Boolean fenoles;    

    @Column (nullable=false)
    private Boolean hidrocarburos;    
    
    @Column (nullable=false)
    private Boolean mercurio;    
    
    @Column (nullable=false)
    private Boolean plomo;    
    
    @Column (nullable=false)
    private Boolean solventesOrganicos;  
    
    @Column (nullable=false)
    private Boolean sustanciasSolubles;   
    
    @Column (nullable=false)
    private Boolean solidosSedimentales;    
    
    @Column (nullable=false)
    private Boolean acido;    
    
    @Column (nullable=false)
    private Boolean neutro;    
    
    @Column (nullable=false)
    private Boolean alcalino;    
    
        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DeclaracionJurada getDeclaracion() {
        return declaracion;
    }

    public void setDeclaracion(DeclaracionJurada declaracion) {
        this.declaracion = declaracion;
    }

    public List<Barro> getDecargas() {
        return decargas;
    }

    public void setDecargas(List<Barro> decargas) {
        this.decargas = decargas;
    }


    public Boolean isCircCerrCirc() {
        return circCerrCirc;
    }

    public void setCircCerrCirc(Boolean circCerrCirc) {
        this.circCerrCirc = circCerrCirc;
    }

    public Boolean isReCircAgua() {
        return reCircAgua;
    }

    public void setReCircAgua(Boolean reCircAgua) {
        this.reCircAgua = reCircAgua;
    }

    public Boolean isLavaPisosInd() {
        return lavaPisosInd;
    }

    public void setLavaPisosInd(Boolean lavaPisosInd) {
        this.lavaPisosInd = lavaPisosInd;
    }

    public Boolean isRefrig() {
        return refrig;
    }

    public void setRefrig(Boolean refrig) {
        this.refrig = refrig;
    }

    public Boolean isCaldera() {
        return caldera;
    }

    public void setCaldera(Boolean caldera) {
        this.caldera = caldera;
    }

    public Boolean isCaptaAguaSubte() {
        return captaAguaSubte;
    }

    public void setCaptaAguaSubte(Boolean captaAguaSubte) {
        this.captaAguaSubte = captaAguaSubte;
    }

    public Boolean isArsenico() {
        return arsenico;
    }

    public void setArsenico(Boolean arsenico) {
        this.arsenico = arsenico;
    }

    public Boolean isCadmio() {
        return cadmio;
    }

    public void setCadmio(Boolean cadmio) {
        this.cadmio = cadmio;
    }

    public Boolean isCianuro() {
        return cianuro;
    }

    public void setCianuro(Boolean cianuro) {
        this.cianuro = cianuro;
    }

    public Boolean isCromo() {
        return cromo;
    }

    public void setCromo(Boolean cromo) {
        this.cromo = cromo;
    }

    public Boolean isDetergentes() {
        return detergentes;
    }

    public void setDetergentes(Boolean detergentes) {
        this.detergentes = detergentes;
    }

    public Boolean isFenoles() {
        return fenoles;
    }

    public void setFenoles(Boolean fenoles) {
        this.fenoles = fenoles;
    }

    public Boolean isHidrocarburos() {
        return hidrocarburos;
    }

    public void setHidrocarburos(Boolean hidrocarburos) {
        this.hidrocarburos = hidrocarburos;
    }

    public Boolean isMercurio() {
        return mercurio;
    }

    public void setMercurio(Boolean mercurio) {
        this.mercurio = mercurio;
    }

    public Boolean isPlomo() {
        return plomo;
    }

    public void setPlomo(Boolean plomo) {
        this.plomo = plomo;
    }

    public Boolean isSolventesOrganicos() {
        return solventesOrganicos;
    }

    public void setSolventesOrganicos(Boolean solventesOrganicos) {
        this.solventesOrganicos = solventesOrganicos;
    }

    public Boolean isSustanciasSolubles() {
        return sustanciasSolubles;
    }

    public void setSustanciasSolubles(Boolean sustanciasSolubles) {
        this.sustanciasSolubles = sustanciasSolubles;
    }

    public Boolean isSolidosSedimentales() {
        return solidosSedimentales;
    }

    public void setSolidosSedimentales(Boolean solidosSedimentales) {
        this.solidosSedimentales = solidosSedimentales;
    }

    public Boolean isAcido() {
        return acido;
    }

    public void setAcido(Boolean acido) {
        this.acido = acido;
    }

    public Boolean isNeutro() {
        return neutro;
    }

    public void setNeutro(Boolean neutro) {
        this.neutro = neutro;
    }

    public Boolean isAlcalino() {
        return alcalino;
    }

    public void setAlcalino(Boolean alcalino) {
        this.alcalino = alcalino;
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
        if (!(object instanceof Vuelco)) {
            return false;
        }
        Vuelco other = (Vuelco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.controlefluentesliquidos.entities.Vuelco[ id=" + id + " ]";
    }
    
}
