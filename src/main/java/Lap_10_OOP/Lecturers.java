package Lap_10_OOP;

import java.util.ArrayList;
import java.util.List;

public class Lecturers {
    protected String name;
    protected String email;
    protected String address;
    protected int phone;
    protected double timeTeach;

    public Lecturers(String name, String email, String address, int phone, double timeTeach) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.timeTeach = timeTeach;
    }

    public Lecturers() {
    }

    public Lecturers enterLecturer() {
        return this;
    }

    public String printListLecturer(ArrayList<Lecturers> list) {
        String re = "Name\t\t\t\t\tEmail\t\t\t\t\tAddress\t\t\t\tPhone\t\t\t\tTime teach\n";
        for (int i = 0; i < list.size(); i++) {
            re += i+1 + ". " + list.get(i).name + "\t\t" + list.get(i).email + "\t\t" + list.get(i).address +
                    "\t\t\t\t\t" + list.get(i).phone + "\t\t\t" + list.get(i).timeTeach+"\n";
        }
        return re;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public double getTimeTeach() {
        return timeTeach;
    }

    public void setTimeTeach(double timeTeach) {
        this.timeTeach = timeTeach;
    }
}
