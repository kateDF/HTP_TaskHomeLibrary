package by.htp.library.entity.newspaper.schedules;

import java.time.LocalDate;

import by.htp.library.entity.EntityDB;

public class SchedulesOfTelecasts extends EntityDB {

	private String channel;
	private LocalDate beginDate;
	private LocalDate endDate;

	public SchedulesOfTelecasts(int id, String channel, LocalDate beginDate, LocalDate endDate) {
		super(id);
		this.channel = channel;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public LocalDate getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Schedules Of Telecasts: channel " + channel + ", begin Date: " + beginDate + ", end Date: " + endDate;
	}

}
