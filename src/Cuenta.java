/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Cuenta {
    
    private int _numeroCuenta;
    private double _saldoCuenta;
    private String _fechaCreacion;
    private String _mombreCliente;

    public Cuenta(int _numeroCuenta, double _saldoCuenta, String _fechaCreacion, String _mombreCliente) {
        this._numeroCuenta = _numeroCuenta;
        this._saldoCuenta = _saldoCuenta;
        this._fechaCreacion = _fechaCreacion;
        this._mombreCliente = _mombreCliente;
    }

    public int getNumeroCuenta() {
        return _numeroCuenta;
    }

    public void setNumeroCuenta(int _numeroCuenta) {
        this._numeroCuenta = _numeroCuenta;
    }

    public double getSaldoCuenta() {
        return _saldoCuenta;
    }

    public void setSaldoCuenta(double _saldoCuenta) {
        this._saldoCuenta = _saldoCuenta;
    }

    public String getFechaCreacion() {
        return _fechaCreacion;
    }

    public void setFechaCreacion(String _fechaCreacion) {
        this._fechaCreacion = _fechaCreacion;
    }

    public String getMombreCliente() {
        return _mombreCliente;
    }

    public void setMombreCliente(String _mombreCliente) {
        this._mombreCliente = _mombreCliente;
    }
    
    
    
}
