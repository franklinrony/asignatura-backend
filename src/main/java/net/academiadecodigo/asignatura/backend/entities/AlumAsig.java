/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.academiadecodigo.asignatura.backend.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


/**
 *
 * @author Franklin Rony Cortez
 */
@Entity
@Table(name = "ALUM_ASIG", catalog = "", schema = "ASIGNATURA")

public class AlumAsig implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AlumAsigPK alumAsigPK;
    @Basic(optional = false)
    @Column(name = "ALAS_FECHA_INSCRIPCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date alasFechaInscripcion;
    @JoinColumn(name = "ALUM_ID", referencedColumnName = "ALUM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Alumno alumno;
    @JoinColumn(name = "ASIG_ID", referencedColumnName = "ASIG_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Asignatura asignatura;

    public AlumAsig() {
    }

    public AlumAsig(AlumAsigPK alumAsigPK) {
        this.alumAsigPK = alumAsigPK;
    }

    public AlumAsig(AlumAsigPK alumAsigPK, Date alasFechaInscripcion) {
        this.alumAsigPK = alumAsigPK;
        this.alasFechaInscripcion = alasFechaInscripcion;
    }

    public AlumAsig(BigInteger asigId, BigInteger alumId) {
        this.alumAsigPK = new AlumAsigPK(asigId, alumId);
    }

    public AlumAsigPK getAlumAsigPK() {
        return alumAsigPK;
    }

    public void setAlumAsigPK(AlumAsigPK alumAsigPK) {
        this.alumAsigPK = alumAsigPK;
    }

    public Date getAlasFechaInscripcion() {
        return alasFechaInscripcion;
    }

    public void setAlasFechaInscripcion(Date alasFechaInscripcion) {
        this.alasFechaInscripcion = alasFechaInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alumAsigPK != null ? alumAsigPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlumAsig)) {
            return false;
        }
        AlumAsig other = (AlumAsig) object;
        if ((this.alumAsigPK == null && other.alumAsigPK != null) || (this.alumAsigPK != null && !this.alumAsigPK.equals(other.alumAsigPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AlumAsig[ alumAsigPK=" + alumAsigPK + " ]";
    }
    
}
