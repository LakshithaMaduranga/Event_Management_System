package controller;

public class AssociateFormController {
    private String name;
    private String id;
    private int age;
    private String address;

    private String contact;


    public AssociateFormController() {
    }

    public AssociateFormController(String name, String id, int age, String address, String contact) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
