/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

public class Viewer {

    private int id;
    private int code;

    //Contructores
    public Viewer(int id, int code) {
        setID(id);
        setCode(code);
    }

    //Construtor Vazio
    public Viewer(Viewer vw) {
        id = vw.id;
        code = vw.code;
    }

    //Métodos de instância
    //Métodos de consulta
    public int getID() {
        return id;
    }

    public int getCode() {
        return code;
    }

    //Métodos modificadores
    public void setID(int id) {
        this.id = id;
    }

    public void setCode(int code) {
        this.code = code;
    }

    //Méotodos complementares
    public String toString() {
        return " " + id + ", " + code;
    }

}
