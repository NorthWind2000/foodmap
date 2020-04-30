package cn.henu.one.bean;


import java.util.ArrayList;
import java.util.Arrays;

public class Customer {

    private int id;
    private String account;
    private String password;
    private String name;
//    private String[] taste_preferences;
//    private String[] collections;
//    private ArrayList<String> evaluation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//
//    public String[] getTaste_preferences() {
//        return taste_preferences;
//    }
//
//    public void setTaste_preferences(String[] taste_preferences) {
//        this.taste_preferences = taste_preferences;
//    }
//
//    public String[] getCollections() {
//        return collections;
//    }
//
//    public void setCollections(String[] collections) {
//        this.collections = collections;
//    }
//
//    public ArrayList<String> getEvaluation() {
//        return evaluation;
//    }
//
//    public void setEvaluation(ArrayList<String> evaluation) {
//        this.evaluation = evaluation;
//    }
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "customer_id='" + id + '\'' +
//                ", nickname='" + nickname + '\'' +
//                ", taste_preferences=" + Arrays.toString(taste_preferences) +
//                ", collections=" + Arrays.toString(collections) +
//                ", evaluation=" + evaluation +
//                '}';
//    }
}
