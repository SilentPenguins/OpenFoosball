package com.silentpenguins.OpenFoosball.pojo;

public class RegisterRQ {
        private String login;
        private String password;
        private String email;
        private String first_name;
        private String last_name;

        public RegisterRQ(){}

        public RegisterRQ(String login, String password, String email, String first_name, String last_name){
            this.login=login;
            this.password=password;
            this.email=email;
            this.first_name=first_name;
            this.last_name=last_name;
        }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}