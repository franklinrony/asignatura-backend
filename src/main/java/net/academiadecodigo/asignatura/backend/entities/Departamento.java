/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.academiadecodigo.asignatura.backend.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


/**
 *
 * @author Franklin Rony Cortez
 */
@Entity
@Table(name = "DEPARTAMENTO", catalog = "", schema = "ASIGNATURA")
public class Departamento implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "DEPT_ID")
    private BigDecimal deptId;
    @Column(name = "DEPT_NOMBRE")
    private String deptNombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deptId")
    @JsonBackReference
    private List<Municipio> municipioList;

    public Departamento() {
    }

    public Departamento(BigDecimal deptId) {
        this.deptId = deptId;
    }

    public BigDecimal getDeptId() {
        return deptId;
    }

    public void setDeptId(BigDecimal deptId) {
        this.deptId = deptId;
    }

    public String getDeptNombre() {
        return deptNombre;
    }

    public void setDeptNombre(String deptNombre) {
        this.deptNombre = deptNombre;
    }

    public List<Municipio> getMunicipioList() {
        return municipioList;
    }

    public void setMunicipioList(List<Municipio> municipioList) {
        this.municipioList = municipioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deptId != null ? deptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.deptId == null && other.deptId != null) || (this.deptId != null && !this.deptId.equals(other.deptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Departamento[ deptId=" + deptId + " ]";
    }
    
}
