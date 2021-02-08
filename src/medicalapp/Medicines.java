/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalapp;

/**
 *
 * @author Chamuditha Jayaweera
 */
public class Medicines {
    
    private int Dno,Qty,Amount;
    private String Dname,cutOff,ARange,Date;
    
    public Medicines(int Dno, String Dname, String cutOff, int Qty, String ARange, int Amount, String Date)
    {
        this.Dno = Dno;
        this.Dname = Dname;
        this.cutOff = cutOff;
        this.Qty = Qty;
        this.ARange = ARange;
        this.Amount = Amount;
        this.Date = Date;
                
    }

    public int getDno() {
        return Dno;
    }

    public void setDno(int Dno) {
        this.Dno = Dno;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String Dname) {
        this.Dname = Dname;
    }

    public String getCutOff() {
        return cutOff;
    }

    public void setCutOff(String cutOff) {
        this.cutOff = cutOff;
    }

    public String getARange() {
        return ARange;
    }

    public void setARange(String ARange) {
        this.ARange = ARange;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
    
}
