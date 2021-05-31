package com.fantastic.manage_calendar_events.models;

import com.google.gson.annotations.SerializedName;

public final class CalendarEvent {

  @SerializedName("eventId")
  private String eventId;
  @SerializedName("title")
  private String title;
  @SerializedName("description")
  private String description;
  @SerializedName("startDate")
  private long startDate;
  @SerializedName("endDate")
  private long endDate;
  @SerializedName("location")
  private String location;
  @SerializedName("duration")
  private long duration;
  @SerializedName("isAllDay")
  private boolean isAllDay;
  @SerializedName("hasAlarm")
  private boolean hasAlarm;
  @SerializedName("reminder")
  private Reminder reminder;

  public CalendarEvent(String eventId, String title, String description, long startDate,
      long endDate,
      String location, boolean isAllDay, boolean hasAlarm) {
    this.eventId = eventId;
    this.title = title;
    this.description = description;
    this.startDate = startDate;
    this.endDate = endDate;
    this.location = location;
    this.isAllDay = isAllDay;
    this.hasAlarm = hasAlarm;
  }

  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public long getStartDate() {
    return startDate;
  }

  public void setStartDate(long startDate) {
    this.startDate = startDate;
  }

  public long getEndDate() {
    return endDate;
  }

  public void setEndDate(long endDate) {
    this.endDate = endDate;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public long getDuration() {
    return duration;
  }

  public void setDuration(long duration) {
    this.duration = duration;
  }

  public boolean isAllDay() {
    return isAllDay;
  }

  public void setAllDay(boolean allDay) {
    isAllDay = allDay;
  }

  public boolean isHasAlarm() {
    return hasAlarm;
  }

  public void setHasAlarm(boolean hasAlarm) {
    this.hasAlarm = hasAlarm;
  }

  public Reminder getReminder() {
    return reminder;
  }

  public void setReminder(Reminder reminder) {
    this.reminder = reminder;
  }

  @Override
  public String toString() {
    return eventId + "-" + title + "-" + description + "-" + startDate + "-" + endDate + "-"
        + location + "-"
        + duration + "-"
        + hasAlarm;
  }

  public static class Reminder {

    private final long minutes;

    public Reminder(long minutes) {
      this.minutes = minutes;
    }

    public long getMinutes() {
      return minutes;
    }

    @Override
    public String toString() {
      return "Minutes - " + minutes;
    }
  }

}
