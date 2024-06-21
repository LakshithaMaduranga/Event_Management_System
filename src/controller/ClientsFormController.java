package controller;

public class ClientsFormController extends AssociateFormController {
    private Double budget;

    public ClientsFormController() {

    }

    public ClientsFormController(String name, String id, int age, String address, String contact, Double budget) {
        super(name, id, age, address, contact);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }
}
