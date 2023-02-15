package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {
	
	@Id
	private int id;
	private String Name;
	private String Blood_Group;
	private String Place;
	private long Phone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBlood_Group() {
		return Blood_Group;
	}
	public void setBlood_Group(String blood_Group) {
		Blood_Group = blood_Group;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	

}
