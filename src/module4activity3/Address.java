/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module4activity3;

/**
 *
 * @author Luke
 */
public class Address {
    private String homeAddress;
    private String homeCity;
    private String homeState;
    private String homeCountry;
    private int homeZipcode;
    
    public Address(String newHomeAddress, String newHomeCity, String newHomeState, String newHomeCountry, int newHomeZipcode){
        homeAddress = newHomeAddress;
        homeCity = newHomeCity;
        homeState = newHomeState;
        homeCountry = newHomeCountry;
        homeZipcode = newHomeZipcode;
    }
    
    public boolean checkIfState(){
        if(getHomeState().length() == 2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String getFullAddress(){
        return getHomeAddress() + ",\n" + getHomeCity() + ", " + getHomeState() + " " + getHomeZipcode();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public String getHomeState() {
        return homeState;
    }

    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

    public String getHomeCountry() {
        return homeCountry;
    }

    public void setHomeCountry(String homeCountry) {
        this.homeCountry = homeCountry;
    }

    public int getHomeZipcode() {
        return homeZipcode;
    }

    public void setHomeZipcode(int homeZipcode) {
        this.homeZipcode = homeZipcode;
    }
    

}
