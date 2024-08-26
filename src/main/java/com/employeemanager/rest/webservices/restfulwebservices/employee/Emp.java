package com.employeemanager.rest.webservices.restfulwebservices.employee;
public class Emp {

        private int id;
        private String username;
        private String name;
        private String email;
        private String designation;

        public Emp() {
            // Default constructor
        }

    public Emp(int id, String username, String name, String email, String designation) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.email = email;
        this.designation = designation;
    }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }


    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

    @Override
    public String toString() {
        return "Emp [id=" + id + ", username=" + username + ", name=" + name + ", email=" + email + ", designation=" + designation + "]";
    }
    }
