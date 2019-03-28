/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adminfaces.starter.bean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author evert
 */
@ManagedBean
public class RadioView {
     
    private String console;    
    private String city; 
    private String city2; 
    private List<String> realizaTriagem;
    private List<String> resultTriagem;
    private List<String> aceitacaoAlimentar;
    private List<String> booleanOption;
    private List<String> toleranciaTNE;
    private List<String> cities;  
    private String color;
     
    @PostConstruct
    public void init() {
        cities = new ArrayList<String>();
        cities.add("Miami");
        cities.add("London");
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Barcelona");
        cities.add("Rome");
        cities.add("Brasilia");
        cities.add("Amsterdam");
        
        realizaTriagem = new ArrayList<String>();
        realizaTriagem.add("Não se aplica");
        realizaTriagem.add("Em até 48 horas");
        realizaTriagem.add("Acima de 48 horas");
        
        resultTriagem = new ArrayList<String>();
        resultTriagem.add("Sem risco");
        resultTriagem.add("Baixo risco");
        resultTriagem.add("Risco médio");
        resultTriagem.add("Com risco");
        
        aceitacaoAlimentar = new ArrayList<String>();
        aceitacaoAlimentar.add("0% - Nenhuma");
        aceitacaoAlimentar.add("25% - Pouco");
        aceitacaoAlimentar.add("50% - Metade");
        aceitacaoAlimentar.add("75% - Maior parte");
        aceitacaoAlimentar.add("100% - Total");
        
        booleanOption = new ArrayList<String>();
        booleanOption.add("Sim");
        booleanOption.add("Não");
        
        toleranciaTNE = new ArrayList<String>();
        toleranciaTNE.add("Distenção abdominal");
        toleranciaTNE.add("Êmese");
        toleranciaTNE.add("Resíduo gástrico elevado");
        toleranciaTNE.add("Diarreia");
        toleranciaTNE.add("Constipação");
    }
 
    public String getConsole() {
        return console;
    }
 
    public void setConsole(String console) {
        this.console = console;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public String getCity2() {
        return city2;
    }
 
    public void setCity2(String city2) {
        this.city2 = city2;
    }
     
    public String getColor() {
        return color;
    }
 
    public void setColor(String color) {
        this.color = color;
    }
 
    public List<String> getCities() {
        return cities;
    }

    public List<String> getRealizaTriagem() {
        return realizaTriagem;
    }

    public List<String> getResultTriagem() {
        return resultTriagem;
    }

    public void setRealizaTriagem(List<String> realizaTriagem) {
        this.realizaTriagem = realizaTriagem;
    }

    public void setResultTriagem(List<String> resultTriagem) {
        this.resultTriagem = resultTriagem;
    }

    public List<String> getAceitacaoAlimentar() {
        return aceitacaoAlimentar;
    }

    public void setAceitacaoAlimentar(List<String> aceitacaoAlimentar) {
        this.aceitacaoAlimentar = aceitacaoAlimentar;
    }

    public List<String> getBooleanOption() {
        return booleanOption;
    }

    public void setBooleanOption(List<String> booleanOption) {
        this.booleanOption = booleanOption;
    }

    public List<String> getToleranciaTNE() {
        return toleranciaTNE;
    }

    public void setToleranciaTNE(List<String> toleranciaTNE) {
        this.toleranciaTNE = toleranciaTNE;
    }
    
    
    
}
