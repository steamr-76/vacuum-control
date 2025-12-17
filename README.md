

## Install guide

#### prerequisite

##### Networking
https://github.com/morrownr/8821cu-20210916

##### java 21
```
sudo apt update
sudo apt install openjdk-21-jdk
```

##### gpiod
Usually pre installed in raspberryPi OS

```
sudo adduser appuser --system --no-create-home
sudo groups appuser gpio
sudo mkdir /opt/vacuum

## Assuming *.jar, *.sh and *.service file is installed in /opt/vacuum
ln -s /opt/vacuum/vacuum.service /etc/systemd/system/vacuum.service
% sudo systemctl daemon-reload
% sudo systemctl enable vacuum.service
% sudo service vacuum start 
```

#### to start manually

```
Look at the run script run.sh
```
