/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hibnate_proj;

/**
 *
 * @author DELL
 */
public class Company {
    private int regNo;
    private String compName;
    private String city;
    private String rank;
    private String platform;
    
    public Company(){
        
    }
    
    public Company(int regNo,String compName,String city,String rank,String platform){
       this.regNo = regNo;
       this.compName = compName;
       this.city = city;
       this.rank = rank;
       this.platform = platform;
    }

    /**
     * @return the regNo
     */
    public int getRegNo() {
        return regNo;
    }

    /**
     * @param regNo the regNo to set
     */
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    /**
     * @return the compName
     */
    public String getCompName() {
        return compName;
    }

    /**
     * @param compName the compName to set
     */
    public void setCompName(String compName) {
        this.compName = compName;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * @return the platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @param platform the platform to set
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
