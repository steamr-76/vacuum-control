package org.deolfamily.vacuum.service;

public interface OnOffDevice {
  boolean isOn();
  
  boolean isOff();
  
  void turnOn();
  
  void turnOff();
  
  void togglePower();
  
  void setPowerState(boolean paramBoolean);
}


/* Location:              /home/ravinder/IdeaProjects/vacuum/!/org/deolfamily/vacuum/service/OnOffDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */