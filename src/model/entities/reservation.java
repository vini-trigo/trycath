package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class reservation {

	private Integer roomnunber;
	private Date checkin;
	private Date checkOut;
	
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public reservation(Integer roomnunber, Date checkin, Date checkOut) {
		this.roomnunber = roomnunber;
		this.checkin = checkin;
		this.checkOut = checkOut;
	}


	public Integer getRoomnunber() {
		return roomnunber;
	}


	public void setRoomnunber(Integer roomnunber) {
		this.roomnunber = roomnunber;
	}


	public Date getCheckin() {
		return checkin;
	}


	public Date getCheckOut() {
		return checkOut;
	}

	
	public long duration() {
		long di = checkOut.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(di, TimeUnit.MILLISECONDS);
	}
	
	public void update(Date checkin, Date checkOut ) {
		this.checkin = checkin;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Romm: " +roomnunber+", check-in: " +sdf.format(checkin)+ ", check-out: " +sdf.format(checkOut)
		+", " +duration()+ " nigths";		
	}
	
}
