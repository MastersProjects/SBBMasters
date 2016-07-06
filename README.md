# SBBMasters ![data](https://img.shields.io/badge/Status-development-orange.svg)

A TBZ school project
Module 411 - Design and implement data structures and algorithms 


## Summary

### -[Assessment Grid](#assessment-grid)
### -[Data](#data)
### -[Functions](#functions)
### -[Structograms](#structograms)
### -[Built with](#built-with)
### -[Conclusion](#conclusion)
### -[Authors](#authors)


## Description

The assignment of this project is to make an application which reads data from a **[csv file](#data)** and do has 3 simple **[functions](#functions)** to show different informations about the train departures in Zurich. The task is documented on the BSCW, the csv File is also on the BSCW and in our Java solution. 


## Assessment Grid

|                                       |not good |ok       |very good|
| ------------------------------------- | :-----: | :-----: | :-----: |
|**Structured code**                    |0        |3        |6        |
|**Commented code**                     |0        |3        |6        |
|**Functionality**                      |1        |5        |8        |
|**User friendly, usability**           |0        |2        |4        |
|**Structograms**                       |0        |5        |8        |
|**Presentation**                       |0        |2        |4        |
|**Work report (with Division of task)**|0        |3        |6        |

Max. 42 Points; Formula for the mark: (Reached Points / Max. Points) * 5 + 1


## Data 
![data](https://img.shields.io/badge/data-abfahrten__zhb.csv-green.svg)

File with data received from school in application folder /resources/data/abfahrten_zhb.csv

**[File](/resources/data/abfahrten_zhb.csv)**


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
```
**Get the next depatrures to a city**
```java
public ArrayList<Departure> getDeparturestToCity(String city) {}
```


## Structograms

![getPlatformDepartures](/resources/structograms/getPlatformDepartures.png)
![getDeparturesToCity](/resources/structograms/getDeparturesToCity.png)


## Built With

* Java 8 
* Eclipse Mars
* Structorizer


## Authors

* **Chiramet Phong Penglerd** - *Code, GUI and Documentation* - [Phong6698](https://github.com/Phong6698)
* **Elia Perenzin** - *Code and Documentation* - [zperee](https://github.com/zperee)

See also the list of [contributors](https://github.com/MastersProjects/SBBMasters/graphs/contributors) who participated in this project.


## Conclusion

We think the code is very structured and well commented. It was an easy assignment and we had no problems with the implementations. The GUI is responsive and easy to use. Our teamwork was good and we made everything on time.


## TODO
- [x] Functions
- [x] GUI
- [x] Validation inputfields
- [x] Outsource Actionlistener
- [x] Structograms
- [x] Presentation
