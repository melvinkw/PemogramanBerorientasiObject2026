public class Employee {
    private String employeeId;
    private String name;
    private String role;

    public Employee(String employeeId, String name, String role) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getInfo() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Role: " + role;
    }

    public void processService(Customer customer, Vehicle vehicle, Service service) {
        double serviceFee = 0;

        if (vehicle.getVehicleType().equalsIgnoreCase("Car")) {
            serviceFee = 50000;
        } else if (vehicle.getVehicleType().equalsIgnoreCase("Motorcycle")) {
            serviceFee = 20000;
        }

        double totalEstimatedCost = service.getServicePrice() + serviceFee;

        System.out.println("=========================================");
        System.out.println("Customer Name     : " + customer.getName());
        System.out.println("Vehicle Info      : " + vehicle.getBrand() + " " + vehicle.getModel() + " (" + vehicle.getPlateNumber() + ")");
        System.out.println("Vehicle Type      : " + vehicle.getVehicleType());
        System.out.println("Selected Service  : " + service.getServiceName());
        System.out.println("Base Service Price: Rp " + service.getServicePrice());
        System.out.println("Service Fee       : Rp " + serviceFee);
        System.out.println("-----------------------------------------");
        System.out.println("Total Estimated   : Rp " + totalEstimatedCost);
        System.out.println("Processed by      : " + this.name + " (" + this.role + ")");
        System.out.println("=========================================\n");
    }
}
