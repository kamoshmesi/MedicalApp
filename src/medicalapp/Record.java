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
public class Record {
    private int Student_id;
    private String symptoms,medicines,special_notes,ref_doc,date;
    
    public Record(int Student_id,String symptoms,String medicines,String special_notes,String ref_doc,String date)
    {
        this.Student_id = Student_id;
        this.symptoms = symptoms;
        this.medicines = medicines;
        this.special_notes = special_notes;
        this.ref_doc = ref_doc;
        this.date = date;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int Student_id) {
        this.Student_id = Student_id;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public String getSpecial_notes() {
        return special_notes;
    }

    public void setSpecial_notes(String special_notes) {
        this.special_notes = special_notes;
    }

    public String getRef_doc() {
        return ref_doc;
    }

    public void setRef_doc(String ref_doc) {
        this.ref_doc = ref_doc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
   
    
}
