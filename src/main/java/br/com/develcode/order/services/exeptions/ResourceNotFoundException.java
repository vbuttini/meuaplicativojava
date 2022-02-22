package br.com.develcode.order.services.exeptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Object id){
        super("Resource not found. ID " + id);
    }
}
