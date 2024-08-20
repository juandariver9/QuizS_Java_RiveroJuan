/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

public class Nomina extends Tarjeta{
    
    private double descuento = 0.15;
            
    public Nomina(String numeroDeCuenta, double valorApertura, String mes){
        super(numeroDeCuenta, valorApertura, mes);
    }

    
    @Override
    public double cuotaDeManejo() {
        return 50000 * descuento + 50000;
    }

}
