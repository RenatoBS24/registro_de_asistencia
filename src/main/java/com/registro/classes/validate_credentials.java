package com.registro.classes;

public class validate_credentials {
    /**
     * @param user username required to validate credentials,
     * @param pass Key to validate the user
     */
    public int validate(String user, String pass) {
       if(user.equals("usuario")){
           if(pass.equals("123")){
               return 1;
           }else{
               return 2;
           }
       }else {
           return 0;
       }
    }
}
