package com.ect.kim.memo;

import javax.xml.crypto.Data;

public class TicketReservation {
	private int uid;
	private int movieId;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public Data getRegData() {
		return regData;
	}
	public void setRegData(Data regData) {
		this.regData = regData;
	}
	private int seatId; 
	private Data regData;
}

