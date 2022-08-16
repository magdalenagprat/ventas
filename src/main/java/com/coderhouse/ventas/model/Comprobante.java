package com.coderhouse.ventas.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "comprobante")
public class Comprobante {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Integer comprobanteId;

    @Column
    private Integer total;

    @Column
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name="clienteId")
    private Cliente cliente;

    public Comprobante() {
    }

    public Integer getComprobanteId() {
        return comprobanteId;
    }

    public void setComprobanteId(Integer comprobanteId) {
        this.comprobanteId = comprobanteId;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
