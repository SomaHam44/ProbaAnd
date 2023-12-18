package com.example.pp;

import java.util.Date;

public class Gyogyszer {
    private int id;
    private String nev;
    private String hatoanyag;
    private String link;
    private String lejarat;
    private int napi;
    private int keszlet;
    private String mod;

    public Gyogyszer(int id, String nev, String hatoanyag, String link, String lejarat, int napi, int keszlet, String mod) {
        this.id = id;
        this.nev = nev;
        this.lejarat = lejarat;
        this.napi = napi;
        this.keszlet = keszlet;
        this.mod = mod;
    }

    public Gyogyszer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getHatoanyag() {
        return hatoanyag;
    }

    public void setHatoanyag(String hatoanyag) {
        this.hatoanyag = hatoanyag;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLejarat() {
        return lejarat;
    }

    public void setLejarat(String lejarat) {
        this.lejarat = lejarat;
    }

    public int getNapi() {
        return napi;
    }

    public void setNapi(int napi) {
        this.napi = napi;
    }

    public int getKeszlet() {
        return keszlet;
    }

    public void setKeszlet(int keszlet) {
        this.keszlet = keszlet;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }
}
