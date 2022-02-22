package br.com.develcode.order.services.exeptions;

public class DataBaseExeption extends RuntimeException {
    public DataBaseExeption(String msg) {
        super(msg);
    }
}
