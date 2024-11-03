/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.member;

/**
 *
 * @author hifi
 */
public class Member {
    private String name;
    private String surname;
    private String id;
    private String gender;
    private String contractType;
    private boolean ispersonalTrainerNeeded;

    public Member(String name, String surname, String id, String gender, String contractType, boolean personalTrainer) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.gender = gender;
        this.contractType = contractType;
        this.ispersonalTrainerNeeded = ispersonalTrainerNeeded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public boolean getPersonalTrainer() {
        return ispersonalTrainerNeeded;
    }

    public void setPersonalTrainer(String personalTrainer) {
        this.ispersonalTrainerNeeded = ispersonalTrainerNeeded;
    }

    @Override
    public String toString() {
        return "Member{" + "name=" + name + ", surname=" + surname + ", id=" + id + ", gender=" + gender + ", contractType=" + contractType + ", personalTrainer=" + ispersonalTrainerNeeded+ '}';
    }
    
    
}
