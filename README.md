# SBBMasters ![data](https://img.shields.io/badge/Status-development-orange.svg)
##TBZ Schoolproject
The assignment of this project was to read data from a csv file and do some simple functions to show diffrent informations about the train departures in Zurich. The task is documented on the BSCW, the csv File is also on the BSCW and in our Java solution. 

##Assessment Grid
|                                       |not good |ok       |very good|
| ------------------------------------- | :-----: | :-----: | :-----: |
|**Structured code**                    |0        |3        |6        |
|**Commented code**                     |0        |3        |6        |
|**Functionality**                      |1        |5        |8        |
|**User friendly, usability**           |0        |2        |4        |
|**Structograms**                       |0        |5        |8        |
|**Presentation**                       |0        |2        |4        |
|**Work report (with Division of task)**|0        |3        |6        |


## Data ![data](https://img.shields.io/badge/data-abfahrten__zhb.csv-green.svg)

File with data received from school in application folder resources/data/

## Functions
**Get All departures from Zurich mainstation**
```java
public ArrayList<Departure> getAllDepartures() {}
```
**Get the next 20 depatrures (Time with format hh:mm)**
```java
public ArrayList<Departure> getDepartures(String time) {}
```
**Get the next 2 depatrures on a platform (Time with format hh:mm)**
```java
public ArrayList<Departure> getPlatformDepartures(String platform, String time) {}
```java
**Get the next depatrures to a city**
```
public ArrayList<Departure> getDeparturestToCity(String city) {}
```

## Structograms

TODO

## Built With

* Java 8 
* Eclipse Mars
* Structorizer

## Authors

* **Chiramet Phong Penglerd** - *Code, GUI and Documentation* - [Phong6698](https://github.com/Phong6698)
* **Elia Perenzin** - *Code and Documentation* - [zperee](https://github.com/zperee)

See also the list of [contributors](https://github.com/MastersProjects/SBBMasters/graphs/contributors) who participated in this project.

##TODO
- [x] Functions
- [x] GUI
- [ ] Validation inputfields
- [ ] Outsource Actionlistener
- [ ] Structograms
- [ ] Presentation
