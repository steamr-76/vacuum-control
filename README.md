

## Install guide

#### prerequisite

##### java 8
```
sudo apt update
sudo apt install openjdk-8-jdk
```


WiringPI needs to be installed on host.

See [http://wiringpi.com/download-and-install/]

```
% cp vacuum.service /etc/systemd/system
% sudo systemctl enable vacuum.service
% sudo systemctl start vacuum.service 
```

#### to start manually

```
java -Dpi4j.linking=dynamic -jar vacuum-1.0-SNAPSHOT.jar --spring.profiles.active=pi
```
