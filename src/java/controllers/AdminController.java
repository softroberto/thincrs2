/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entidades.Admin;
import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

/**
 *
 * @author Roberto Avelar
 */
@ManagedBean(name = "adminController")
@SessionScoped
public class AdminController implements Serializable {

    
    private int nombreUsaurio;
    private String password;
 
    private Admin current;
    private Admin admin;

    public int getNombreUsaurio() {
        return nombreUsaurio;
    }

    public void setNombreUsaurio(int nombreUsaurio) {
        this.nombreUsaurio = nombreUsaurio;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  
    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    private DataModel items = null;
   

    public AdminController() {
    }

    public Admin getSelected() {
     
        return current;
    }



    public String prepareList() {
        recreateModel();
        return "List";
    }
    public String autenticar(){
        return null;
    }

    public String prepareView() {
        
        return "View";
    }

    public String prepareCreate() {
        
        return "Create";
    }

    public String create() {
        return null;
    }

    public String prepareEdit() {
        
        return "Edit";
    }

    public String update() {
         return null;
    }

    public String destroy() {
        
        return "List";
    }

    public String destroyAndView() {
    return null;
    }

    private void performDestroy() {
      
    }

    private void updateCurrentItem() {
       
    }

    public DataModel getItems() {
       
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
        
    }

    public String next() {
        
        return "List";
    }

    public String previous() {
       
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
       return null;
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return null;
        
    }

       

}

