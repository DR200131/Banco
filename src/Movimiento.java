/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Movimiento {
    
    private String _date;
    private double _saldoAnterior;
    private double _cantidad;

    public Movimiento(String _date, double _saldoAnterior, double _cantidad) {
        this._date = _date;
        this._saldoAnterior = _saldoAnterior;
        this._cantidad = _cantidad;
    }

    public String getDate() {
        return _date;
    }

    public void setDate(String _date) {
        this._date = _date;
    }

    public double getSaldoAnterior() {
        return _saldoAnterior;
    }

    public void setSaldoAnterior(double _saldoAnterior) {
        this._saldoAnterior = _saldoAnterior;
    }

    public double getCantidad() {
        return _cantidad;
    }

    public void setCantidad(double _cantidad) {
        this._cantidad = _cantidad;
    }
    
    
}
