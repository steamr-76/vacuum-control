#!/bin/bash

cd /opt/vacuum

/usr/bin/java -jar vacuum-1.0.1-SNAPSHOT.jar --gpio.simulate=false --gpio.startup-state=HIGH &
