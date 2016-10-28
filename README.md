storm-metrics-reporter
======================

A Storm metrics reporter capable of sending both Storm built-in metrics, as well as custom ones, to various metrics reporters such as Graphite or plain JMX.

**Please take a look at the [Wiki](https://github.com/staslev/storm-metrics-reporter/wiki) for further details.**

Usage
--------

Add a pom dependency (hosted by maven central):

```xml
<dependency>
  <groupId>com.github.staslev</groupId>
  <artifactId>storm-metrics-reporter</artifactId>
  <version>1.5.0</version>
</dependency>
```

Or, in case you wish to build the jar yourself:

```bash 
git clone https://github.com/staslev/storm-metrics-reporter.git
cd storm-metrics-reporter
mvn install
```

Screenshots
-----------

![Graphite metric hierarchy](https://raw.githubusercontent.com/staslev/storm-metrics-reporter/master/screenshots/graphite-metrics-hierarchy.png "Graphite metric hierarchy")

![Execute Latency Metrics](https://raw.githubusercontent.com/staslev/storm-metrics-reporter/master/screenshots/graphite-capacity-metrics.png "Execute latency metrics (not provided by Storm directly)")

Disclaimers
-----------
* This project was inspired by [storm-metrics-statsd](https://github.com/endgameinc/storm-metrics-statsd/), thanks [jt6211](https://github.com/jt6211)!
* The screenshots above were generated using a custom `StormMetricProcessor` implementation, not the one included in the sources. It depicts a particular Graphite naming convention (the host for instance, is not seen in the metric hierarchy chart as it's located higher in the hierarchy). Metrics naming styles are subject to change in other environemnts.
* storm-metrics-reporter **currently** supports reporting metrics to Graphite only, but it should be pretty straight forward to extend it to support other metrics reporting mechanisms.

Further Reading
----------------
* [storm-metrics-reporter wiki](https://github.com/staslev/storm-metrics-reporter/wiki)
* [Sending out Storm metrics](http://twocentsonsoftware.blogspot.co.il/2014/12/sending-out-storm-metrics.html)
* [Storm Metrics How-To](https://www.endgame.com/blog/storm-metrics-how-to.html)
* [Sending metrics from storm to graphite](http://www.michael-noll.com/blog/2013/11/06/sending-metrics-from-storm-to-graphite/) 
* [Storm documentation](http://storm.apache.org/documentation/Metrics.html)
